#!/usr/bin/env python
# coding: utf-8

# In[2]:


import urllib
from bs4 import BeautifulSoup
import werkzeug
werkzeug.cached_property = werkzeug.utils.cached_property
from robobrowser import RoboBrowser
import re
import requests
import json

usr_agent = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36"
br = RoboBrowser(parser='html.parser',user_agent=usr_agent)
br.open("https://www.aceptaelreto.com/user/profile.php")

# El tema de les cookies és diferent per cada web. Per saber què és exactament el que s'ha de passar,
# cal utilitzar l'inspector del navegador, anar a la pestanya de Network i actualitzar la pàgina de manera
# que es pugui veure el request. Llavors només cal mirar els headers i veure què s'està enviant per mantenir
# la sessió

def login():
    form = br.get_form(action="/bin/login.php")
    form['loginForm_username'] = 'arnaumas'
    form['loginForm_password'] = ''
    br.submit_form(form)

login()
html = str(br.parsed())
acrsession = br.session.cookies.get("acrsession")
ACR = br.session.cookies.get("ACR_SessionCookie")

cookies = {
        'ACR_SessionCookie': ACR,
        'acrsession': acrsession,
    }

#ACR_SessionCookie
#acrsession

soup = BeautifulSoup(html)

tags = soup("a")
flag = 0
ids = []

for tag in tags:
    t = tag.get("href")
    if '/problem/statement.php' in t:
        # El codi del primer html (el perfil de l'usuari) té repetit varies vegades la llista de problemes,
        # que són els que es vol scrapejar. Bàsicament, com que obtinc tots el href, cal que els vagi ignorant
        # fins a trobar el primer '/problem/statement.php?id='. En aquest punt es posa la flag a 1, i quan 
        # el següent href no sigui un '/problem/statement.php?id=', si ja n'ha trobat abans, o sigui, si flag
        # és 1, llavors ja surt del bucle, perquè si no, es tornaria a trobar més '/probl[...]' i tornaria a 
        # crear els arxius i a fer-ho tot de nou, la qual cosa és inútil, i augmenta de manera molt notale
        # el temps d'execució del programa.
        # La flag no cal tornar-la a posar a 0, perquè ja s'ha acabat el programa.
        flag = 1
        n = tag.get("href")[-3:]
        ids.append(n)
        # Anar a buscar cada problema
        headers = {
            'Connection': 'keep-alive',
            'Accept': 'application/json, */*; q=0.01',
            'User-Agent': 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36',
            'X-Requested-With': 'XMLHttpRequest',
            'Sec-GPC': '1',
            'Sec-Fetch-Site': 'same-origin',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Dest': 'empty',
            'Referer': 'https://www.aceptaelreto.com/problem/mysubmissions.php?id='+n,
            'Accept-Language': 'ca-ES,ca;q=0.9',
        }

        params = (
            ('_', '164241887674'+n),
        )

        response = requests.get("https://www.aceptaelreto.com/ws/user/19167/submissions/problem/"+n, headers=headers, params=params, cookies=cookies)
        json_ = json.loads(response.text)
        # json["submission"] és un array amb totes les entregues del problema en qüestió
        # Exemple d'un element de l'array:
        # {'num': 524686, 'result': 'AC', 'language': 'CPP', 'executionTime': 1.252, 'memoryUsed': 1952, 'ranking': 170, 'submissionDate': 1619769697000}
        for obj in json_["submission"]:
            # Agafar la primera (que seria l'última que vaig pujar, per tant la definitiva)
            # i obtenir-ne el "num", per poder descarregar el codi.
            if(obj["result"] == "AC"):
                llenguatge = obj["language"]
                num = obj["num"]
                # Aquí obtenir el codi i guardar-lo a un arxiu amb l'extensió corresponent en funció del llenguatge

                headers = {
                    'Connection': 'keep-alive',
                    'Cache-Control': 'max-age=0',
                    'Upgrade-Insecure-Requests': '1',
                    'User-Agent': 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36',
                    'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
                    'Sec-GPC': '1',
                    'Sec-Fetch-Site': 'same-origin',
                    'Sec-Fetch-Mode': 'navigate',
                    'Sec-Fetch-User': '?1',
                    'Sec-Fetch-Dest': 'document',
                    'Accept-Language': 'ca-ES,ca;q=0.9',
                }

                params = (
                    ('id', str(num)),
                )


                response = requests.get('https://www.aceptaelreto.com/problem/submission.php', headers=headers, params=params, cookies=cookies)
                # Encoding a utf-8, perquè si no, no surten els accents
                response.encoding = "utf-8"
                soup = BeautifulSoup(response.text, 'html.parser')
                tag = soup.select_one('td[class="code-container"]')

                if llenguatge == "CPP":
                    f = open("aceptaelreto/"+str(n)+".cpp","w")
                    print(str(n)+".cpp")
                elif llenguatge == "JAVA":
                    f = open("aceptaelreto/"+str(n)+".java","w")
                    print(str(n)+".java")
                elif llenguatge == "C":
                    f = open("aceptaelreto/"+str(n)+".c","w")
                    print(str(n)+".c")

                #print(str(num)+" -> "+tag.text)

                f.write(tag.text)
                f.close()
                break


    else:
        if flag == 1:
            break


# In[ ]:




