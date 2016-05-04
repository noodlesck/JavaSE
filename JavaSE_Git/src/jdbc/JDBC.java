package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;

public class JDBC {
    /**
     * @param args
     */
    
    public static void main(String args[]){
    	
    	Connection conn = null;
    	
    	String url = "jdbc:mysql://localhost:3306/noodles?"

                + "user=root&password=&useUnicode=true&characterEncoding=UTF8";
    	
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			// or:

            // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();

            // or：

            // new com.mysql.jdbc.Driver();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println("成功加载MySQL驱动程序");
    	
    	try {
			conn = DriverManager.getConnection(url);
			Statement stat = conn.createStatement();
			String sql = "select * from auction_user";
		  //int result = stat.executeQuery(sql);
			ResultSet result = stat.executeQuery(sql);
			
			while(result.next()){
				System.out.println(result.getString(1)+result.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	
    	
    	
    	
    }
}
