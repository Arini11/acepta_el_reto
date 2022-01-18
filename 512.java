import java.util.*;

public class b{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int n,conill,cavall;
		n = lector.nextInt();
		while(n-->0){
			conill = lector.nextInt();
			cavall = lector.nextInt();
			System.out.println(conill*100/(conill+cavall));
		}
	}
}
