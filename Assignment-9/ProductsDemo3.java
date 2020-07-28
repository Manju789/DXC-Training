package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class ProductsDemo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num, name, category;
		int price, code;
		System.out.println("Enter the number of products ");
		num = scan.next();
		ArrayList<Product> product = new ArrayList<Product>();
		for(int i=1; i<=(Integer.parseInt(num)) ; i++) {
			System.out.println("Enter the values of product "+ i + " in the order code, name, category and price ");
			code = scan.nextInt();
			name = scan.next();
			category = scan.next();
			price = scan.nextInt();
			product.add(new Product(code, name, category, price));
		}
		scan.close();
		try {
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rs.setUsername("MD");
			rs.setPassword("manju");
			rs.setCommand("select * from PRODUCTS");
			rs.execute();
			
			for(int i=0 ; i<product.size() ; i++) {
				Product prod = product.get(i);
				int code1 = prod.getProdCode(); 
				String name1 = prod.getProdName(); 
				String category1 = prod.getProdCategory(); 
				int price1 = prod.getProdPrice();
			    rs.afterLast(); rs.moveToInsertRow(); 
			    rs.updateInt("PROD_CODE", code1);
			    rs.updateString("PROD_NAME", name1); 
			    rs.updateString("PROD_CATG", category1);
			    rs.updateInt("PROD_PRICE", price1); 
			    rs.updateRow();
			}
			 
			rs.beforeFirst();
			while (rs.next()) {
				System.out.println("Product Details \n" + "Code : " + rs.getInt("PROD_CODE") +"\nName : "+ rs.getString("PROD_NAME") + "\nPrice : " + rs.getInt("PROD_PRICE")+"\nCategory : "+ rs.getString("PROD_CATG"));
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	System.out.println("All products inserted successfully");
	}

}
