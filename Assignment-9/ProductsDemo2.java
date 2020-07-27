package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductsDemo2 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "MD";
		String pass = "manju";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the product code ");
		int pcode = scan.nextInt();
		scan.close();
		String sql = "select * from PRODUCTS where PROD_CODE="+pcode;
		Connection con = null;
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);

			while (result.next()) {
				System.out.println("Product Details \n" + "Code : " + result.getInt("PROD_CODE") +"\nName : "+ result.getString("PROD_NAME") + "\nPrice : " + result.getInt("PROD_PRICE")+"\nCategory : "+ result.getString("PROD_CATG"));
			}

		} catch (Exception ex) {
			System.err.println(ex);
		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	

	}

}
