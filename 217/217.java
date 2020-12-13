import java.util.Scanner;

public class ac{
	public static void main(String[] args){
		Scanner lector=new Scanner(System.in);
		int n;
		do {
			n = lector.nextInt();
			if(n%2==0&&n!=0)
			System.out.println("DERECHA");
			else if(n%2!=0)
			System.out.println("IZQUIERDA");
		}while(n!=0);
	}
}
