import java.util.*;

public class Main{
	static java.util.Scanner in;
	public static void main(String[] args){
		in = new java.util.Scanner(System.in);
		
		while(inici());
	}
	
	public static boolean inici(){
	  if(!in.hasNext())
			return false;
      int n,k,valor;
      n=in.nextInt();
      k=in.nextInt();   
      Map<Integer,Integer> map=new HashMap<Integer,Integer>();
      
      int suma2 = 0;
      int suma = 0;
      for(int i=0;i<n;++i){
         valor=in.nextInt();
         if(map.containsKey(valor)) suma++;
         if(map.containsKey(valor) && (i-map.get(valor) <= k)) suma2++;
         map.put(valor,i);
      }
      
      System.out.println(suma+" "+suma2);   
		return true;
	}

		
}
