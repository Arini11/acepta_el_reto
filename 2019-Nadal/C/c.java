import java.util.*;

public class c{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		char[] stanlee = { 's','t','a','n','l','e','e' };
		int[] pos = { -1, -1, -1, -1, -1, -1, -1 };
		int n = lector.nextInt();lector.nextLine();
		String paraula;
		char[] paraulaChar;
		int compt;
		while(n-- > 0){
			paraula = lector.nextLine();	
			paraulaChar = paraula.toCharArray();
			compt = 0;
			int j = 0;
				for(int i=0;i<paraulaChar.length;i++){
					if(Character.toLowerCase(paraulaChar[i])==stanlee[j]){
						j++;
						if(j==7){
							j=0;
							compt++;
						}		
					}
				}
			System.out.println(compt); 
			}
		}
	}
