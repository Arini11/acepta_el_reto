public class Main{
	
	static java.util.Scanner in;
		
	public static void main(String[] args){
		in = new java.util.Scanner(System.in);
		
		int n = in.nextInt();
		for(int i=0;i<n;++i) {
			inici();
		}
	}
	
	public static void inici(){
		int q = 13;
		int suma = 0;
		int[] pals = new int[4];
		for(int i=0;i<pals.length;i++) pals[i]=0;
		while(q-- > 0) {
			char c1 = in.next().toUpperCase().charAt(0);
			char c2 = in.next().toUpperCase().charAt(0);
			
			if(c1 == 'Q')suma+=2;
			else if(c1 == 'A') suma+=4;
			else if(c1 == 'K') suma+=3;
			else if(c1 == 'J') suma+=1;
			
			if(c2 == 'C') pals[0]++;
			else if(c2 == 'D') pals[1]++;
			else if(c2 == 'P') pals[2]++;
			else if(c2 == 'T') pals[3]++;
			
		}
		for(int i=0;i<pals.length;i++) {
			if(pals[i] == 2) suma+=1;
			else if(pals[i] == 1)suma+=2;
			else if(pals[i] == 0)suma+=3;
		}
		System.out.println(suma);
		
	}
}
