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
		int n = in.nextInt();
		if(n==1) {System.out.println(0); return;}
		int n1 = 1;
		int compt = 0;
		while(n1 < n) {
			n1*=2;
			compt++;
		}
		System.out.println(compt);
		
		
	}
}
