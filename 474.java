import java.util.*;

public class A{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();
		int n1,n2,n3;
		for(int i=0;i<n;i++){
			n1 = lector.nextInt();	
			n2 = lector.nextInt();	
			n3 = lector.nextInt();	
			System.out.println(resoldre(n1,n2,n3));
		}
	}
	static int resoldre(int n1, int n2, int n3){
			//Determinar punt que està més a prop i el que està més lluny 
			int prop,lluny;
			if(Math.abs(n1-n2) < Math.abs(n1-n3)){
				prop=n2;
				lluny=n3;	
			}else{
				prop=n3;
				lluny=n2;
			}
			//La distància total és la distància des de la posició fins al punt més a prop, sumada a la distància des del punt més a prop al més lluny.
			return (Math.abs(n1-prop) + Math.abs(prop-lluny));
	}
}
