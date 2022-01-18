public class Main{
	
	static java.util.Scanner in;
		
	public static void main(String[] args){
		in = new java.util.Scanner(System.in);
		while(inici());
	}
	
	public static boolean inici(){
		
		int n = in.nextInt();
		
		if(n == 0)
			return false;

		int[] seq = new int[n];
		int[] d  = new int[n];
		
		for(int i=0;i<n;i++) {
			seq[i] = in.nextInt();
		}
		int ans = 0;
		for(int i=0;i<seq.length;i++) {
			for(int j=0;j<i;j++) {
				if(seq[j] < seq[i]) {
					d[i] = Math.max(d[i], d[j]+1);
				}
			}
			ans = Math.max(d[i], ans);
		}

		System.out.println(ans+1);
		return true;
	}
}
