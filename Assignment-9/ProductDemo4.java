package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDemo4 {
	public static void main(String[] args) {
		int price;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "MD";
		String password = "manju";
		
		String sql = "select * from PRODUCTS";
		Connection con = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				price = result.getInt("PROD_PRICE");
				if(price<1000 && result.getString("PROD_CATG").equalsIgnoreCase("Electronics")) {
					price = (price/10)+price;
					result.moveToInsertRow();
					result.updateInt("PROD_PRICE", price);
					result.updateRow();
				}
				if(price>1000 && result.getString("PROD_CATG").equalsIgnoreCase("Clothing")) {
					price = price - (price/10);
					result.moveToInsertRow();
					result.updateInt("PROD_PRICE", price);
					result.updateRow();
				}
			}
			result.beforeFirst();
			while (result.next()) {
				System.out.println("Product Details \n" + "Code : " + result.getInt("PROD_CODE") +"\nName : "+ result.getString("PROD_NAME") + "\nPrice : " + result.getInt("PROD_PRICE")+"\nCategory : "+ result.getString("PROD_CATG"));
			}

		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally {
			try {
				con.close();
			}
			catch(SQLException ex) {
				System.out.println(ex);
			}
		}
	}
}
