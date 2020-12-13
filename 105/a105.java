import java.util.*;

public class a105{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		double n, menor=Integer.MAX_VALUE, major=Integer.MIN_VALUE,mitjana=0;
		int iMajor=0,iMenor=0;
		boolean bucle = true;
		String strMitjana="";
		while(bucle){
			for(int i=0;i<6;i++){
				n=lector.nextDouble();
				if(i==0 && n==-1) {
					bucle = false;
					break;
				}
				if(i==5){
					if(n>mitjana) strMitjana = "SI";
					else if(n<mitjana) strMitjana = "NO";
				}
				if(n>major){
				       	major = n;
					iMajor = i;
				}
				if(n<menor){
					menor = n;
					iMenor= i;
				}
				mitjana+=n;
				
			}
			if(iMajor==0) System.out.print("MARTES ");
			else if(iMajor==1) System.out.print("MIERCOLES ");
			else if(iMajor==2) System.out.print("JUEVES ");
			else if(iMajor==3) System.out.print("VIERNES ");
			else if(iMajor==4) System.out.print("SABADO ");
			else if(iMajor==5) System.out.print("DOMINGO ");
			if(iMenor==0) System.out.print("MARTES ");
			else if(iMenor==1) System.out.print("MIERCOLES ");
			else if(iMenor==2) System.out.print("JUEVES ");
			else if(iMenor==3) System.out.print("VIERNES ");
			else if(iMenor==4) System.out.print("SABADO ");
			else if(iMenor==5) System.out.print("DOMINGO ");
			System.out.println(strMitjana);
		}
	}
}
