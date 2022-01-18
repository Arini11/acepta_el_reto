package acpt;

public class Main {
	
	static java.util.Scanner in;
	
	public static void casoDePrueba() {
		
		int i=in.nextInt(),p=in.nextInt();
		int asc=0,desc=0,aux;
		
		//asc ++
		aux = i;
		while(aux!=p) {
			aux++;
			asc++;
			if(aux==360) aux = 0;
		}
		
		//desc --
		aux = i;
		while(aux!=p) {
			aux--;
			desc++;
			if(aux==-1) aux = 359;
		}
		
		if(asc==desc)
			System.out.println("DA IGUAL");
		else if(asc<desc)
			System.out.println("ASCENDENTE");
		else
			System.out.println("DESCENDENTE");
		}


	public static void main(String[] args) {
		
		in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0)
			casoDePrueba();

	}

}
