
public class Customer {
	private String custNo;
	private String custName;
	private String category;
	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
		
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	void validate(String custNo,String custName, String category) throws InvalidInputException{
		
			if(custNo.charAt(0) != 'C' || custNo.charAt(0) != 'c') {
				
				System.out.println(custNo.charAt(0));
				throw new InvalidInputException("Exception as customer number was not starting with 'c' or 'C'");
				
			}
			if(custName.length() < 4)
				throw new InvalidInputException("Exception as length of name is less than 4 characters");
			if(category == "Gold" || category == "Platinum" || category == "Silver")
			{}	
			else
				throw new InvalidInputException("Exception as given category is not in list of categories");
		
	}
}

