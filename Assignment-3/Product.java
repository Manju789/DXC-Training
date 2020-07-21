package Demo;

public class Product {
	private String productCode;
	private String productName;
	private double productPrice;
	private char categoryCode;
	private static int prodCounter = 100;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public char getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}
	public static int getProdCounter() {
		return prodCounter;
	}
	public static void setProdCounter(int prodCounter) {
		Product.prodCounter = prodCounter;
	}
	private String generateProductCode() {
		++Product.prodCounter;
		String st = this.getCategoryCode() + Integer.toString(Product.getProdCounter());
		this.productCode= st;
		return this.productCode;
	}
	public Product(String productName, double productPrice, char categoryCode) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = categoryCode;
		this.productCode = generateProductCode();
	}
	public Product(String productName,double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = 'E';
		this.productCode = generateProductCode();
	}
	public String getProductDetails() {
		String str = "Product Code : "+ this.getProductCode() +", \r\n" + 
				"Name : "+ this.getProductName()+", \r\n" + 
				"Price : "+ this.getProductPrice()+", \r\n" + 
				"Category : "+ this.getCategoryCode();
		return str;
	}
	
}
