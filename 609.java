import java.util.Arrays;

public class Main{
	
	static java.util.Scanner in;
		
	public static void main(String[] args){
		in = new java.util.Scanner(System.in);
		while(inici());
	}
	
	public static boolean inici(){
		if(!in.hasNext())
			return false;
		
		int n,t;
		
		n = in.nextInt();
		t = in.nextInt();
		
		int[] vert = new int[t];
		int[] horz = new int[t];
		
		for(int i=0;i<t;i++) {
			vert[i] = in.nextInt();
			horz[i] = in.nextInt();
		}
		Arrays.sort(vert); Arrays.sort(horz);
		System.out.println((vert[(vert.length-1)/2]) + " " + (horz[(horz.length-1)/2]));
		
		return true;
	}
}
