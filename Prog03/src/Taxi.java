
public class Taxi extends Car{
	private String company;

	public Taxi() {
		
	}
	public Taxi(String color,String userName,String company) {
		super(color,userName);
		this.setCompany(company);
	}
	
	final public void ride() {
		System.out.println("出租车是提高市民生活质量的重要条件之一");
	}
	
	public String toString() {
		return this.getColor()+" "+this.getUserName();
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
