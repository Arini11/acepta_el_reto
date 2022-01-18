public class Main{
	
	static java.util.Scanner in;
		
	public static void main(String[] args){
		in = new java.util.Scanner(System.in);
		while(inici());
	}
	
	public static boolean inici(){
		if(!in.hasNext())
			return false;
		String str = in.nextLine();
		String s = null;
      for(int i=0;i<str.length();i+=2){
         if(str.charAt(i)=='1'){s = str.substring(i,i+3);i++;}
         else {s=str.substring(i,i+2);}
         System.out.print((char)Integer.parseInt(s));
      }
      System.out.print("\n");
		return true;
	}
}
