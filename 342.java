import java.util.*;
/* import java.sql.*;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; */

public class Main{
	static java.util.Scanner in;
	public static void main(String[] args){
		in = new java.util.Scanner(System.in);
		
		while(inici());
	}
	
	public static boolean inici(){
      
      int inici,finl,num,n,valor;
      inici=in.nextInt();
      finl=in.nextInt();
      num=in.nextInt();
      if(inici==0&&finl==0&&num==0) return false;   
      
      n=in.nextInt();
      while(n-- > 0){
         valor=in.nextInt();
         if(valor>=inici&&valor<=finl){
            if(num>=valor) inici=valor;
            else if(num<valor) finl=valor-1;
         }
      }
      if(inici-finl==0)System.out.println("LO SABE");
      else System.out.println("NO LO SABE");      
		return true;
	}
	// 1 -> 1 1
   // 1
	
	// cd C:\Users\amas\Documents\ProvesJava
	// javac -cp .;./lib/ojdbc6.jar;./lib/ucp.jar Main.java && java -cp .;./lib/ojdbc6.jar;./lib/ucp.jar Main
	
	
	/* CÃ€LCULS PROVES
	
		MENGE 				== 	 QUANTITAT COMANDA
		MENGE * (UEBTO/100) ==	 INCREMENT MÃ€XIM 
		SUM(WEMNG)  		== 	 QUANTITAT ENTRADA
		
		ENTRADA MÃ€XIMA  ==   QUANTITAT COMANDA  +  INCREMENT MÃ€XIM  +  QUANTITAT ENTRADA
		
		// 30010   01
		MATR 	   --> 35032635000
		MENGE 	   --> 723,90
		SUM(WEMNG) --> 1269,75
		UEBTO 	   --> 20,00
	
		// 30010   02
		MATR 	   --> 35033650000
		MENGE 	   --> 838,20
		SUM(WEMNG) --> 1269,75
		UEBTO 	   --> 20,00
	
	*/
	
	/* public void inici() {
		Connection conn = null;
		try {
			conn = OracleConnectionPool.getInstance().getConexio();
			String mandt = OracleConnectionPool.getInstance().getMandt();
			Statement stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
			sql = "";
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()){
				String datar = rs.getString("datar");
				LocalDate data = LocalDate.parse(datar, DateTimeFormatter.BASIC_ISO_DATE);
				LocalDate data_ahir = LocalDate.now().minusDays(2);
				if(!data.isBefore(data_ahir)){
				} else {
					error="asddsa";
				}
			}
			rs.close();
			stm.close();
			
			if (stm!=null){
				try {
					stm.close();
				} catch (Exception e){System.out.println("Error validaDadesPaletQR: "+e.getMessage());}
			}
			conn.close();
		} catch (Exception e){
			System.out.println(e.getMessage());
						
		}
		if (conn!=null){
			try {
				conn.close();
			} catch (Exception e){System.out.println("Error validaDadesPaletQR: "+e.getMessage());}
		}

	} */
		
}
