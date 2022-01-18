import java.util.Scanner;

public class ac{
	public static void main(String[] args){
		Scanner lector=new Scanner(System.in);
		int arrel,n,t,v=1;
		while(v==1){
			n = lector.nextInt();
			if(n!=0){
			t=0;
			while(n>0){
				arrel = (int)Math.sqrt(n);
				t += arrel*arrel + 4*arrel;
				n-=arrel*arrel;
			}
			System.out.println(t);
			}
			else
				v=0;
		}
	}
}
