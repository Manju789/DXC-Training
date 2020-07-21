package Demo;

public class TestProduct {
	public static void main(String[] args) {
		Product prod = new Product("Laptop",45000,'E');
		String str = prod.getProductDetails();
		System.out.println(str);
		Product product = new Product("Mobile",23000);
		String string = product.getProductDetails();
		System.out.println(string);
	}
}
