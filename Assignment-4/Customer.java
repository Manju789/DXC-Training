
public class Customer {
	private String customerName;
	Address residentialAddress = new Address();
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Customer(String customerName, String addressLine, String city) {
		super();
		this.customerName = customerName;
		residentialAddress.setAddressLine(addressLine);
		residentialAddress.setCity(city);
	}
	public Customer() {
	}
	public String getCustomerDetails() {
		return ("Customer : "+ getCustomerName() +"\n" + "Residential Address : "+ residentialAddress.getAddressDetails());
	}
	
}
