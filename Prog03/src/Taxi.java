
public class Taxi extends Car{
	private String company;

	public Taxi() {
		
	}
	public Taxi(String color,String userName,String company) {
		super(color,userName);
		this.setCompany(company);
	}
	
	final public void ride() {
		System.out.println("���⳵���������������������Ҫ����֮һ");
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
