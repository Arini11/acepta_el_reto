# Problemes aceptaelreto

Problemes solucionats d'aceptaelreto.

Apunto aquí quatre coses, per què més endevant m'ho miraré i no sabré què hauré fet.
A veure, tots els problemes que hi ha en aquest repositori no els he descarregat manualment, perquè seria una pèrdua de temps.
Aleshores, hi ha un arxiu que es diu bot-descarregar-aceptaelreto que és un programa en Python amb el qual scrapejo la web d'aceptaelreto per obtenir
tots els problemes solucionats per mi.

Això es fa en vàries parts.
1. Faig un request a "https://www.aceptaelreto.com/user/profile.php".
2. Obtinc el formulari d'inici de sessió, l'omplo, i l'envio.
3. Obtinc les cookies dels headers de la resposta i me les guardo per mantenir la sessió al llarg del programa.
4. Ara, amb les dades de sessió, ja puc scrapejar la pàgina del meu perfil. D'ella n'obtinc les IDs dels problemes resolts.
5. Per cada problema, mitjançant una query a un Web Service que vaig descobrir que tenien, obtinc un JSON amb les dades relatives al problema (ID).
6. Busco al JSON l'última entrega del problema amb un "result: AC" (acceptada) i n'obtinc la ID d'entrega.
7. Faig un request a "https://www.aceptaelreto.com/problem/submission.php" i li passo l'ID d'entrega.
8. Obtinc el codi del problema i el guardo en un arxiu que porta com a nom la ID del problema i l'extensió corresponent, en funció de "language: JAVA/CPP/C". 

Coses que voldria deixar apuntades:

- L'estructura del JSON: Primer va un objecte (el típic de dades) i després un array d'objectes, que són les entregues d'aquell problema en específic.
- El Web Service que utilitzo el vaig descobrir amb les DevTools a la pestanya de Network. Vaig advertir que hi havia una query que s'enviava cada escassos segons,
i que servia, entenc jo, per actualitzar el llistat d'entregues en temps real, sense necessitat d'actualitzar la pàgina.
- Hi ha una "flag", això ja ho tinc explicat amb uns comentaris a dins del programa, però.
- També cal dir que de cada problema només guardo l'última entrega que va ser acceptada, o sigui, que si d'un problema hi ha cinc entregues, en aquest ordre,
de més recent a més antiga:
    1- C    | WA
    2- Java | AC
    3- CPP  | AC
    4- CPP  | WA
    5- CPP  | TLE
la que es guardarà és la de Java AC, ignorarà la primera perquè és WrongAnswer, i la de CPP AC també la ignorarà perquè abans ja n'ha trobat una que havia estat acceptada.
- Important, pel tema de les cookies, per saber quin nom tenen als headers, crec que no cal que ho digui, però no està de més. Cal anar a Network amb els DevTools,
recarregar la pàgina i mirar d'un request amb sessió els headers. Es pot copiar (per cURL), i després convertir-ho a codi Python
amb aquesta eina: https://curlconverter.com/ 

I fins aquí escric, espero haver donat prou detalls perquè, en un futur, si volgués tornar a utilitzar el programa i s'hagués de canviar alguna cosa, sàpiga
més o menys com va la cosa.

Salutacions coordials,

Arnau del 18 de Gener de 2022.
