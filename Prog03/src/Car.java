
public class Car extends Object{
	private String color;
	private String userName;
	
	public Car() {
		
	}
	
	public Car(String color,String userName) {
		this.setColor(color);
		this.setUserName(userName);
	}
	
	public void use() {
		System.out.println("我是机动车！");
	}
	
	public boolean equals(Car another) {
		if (this.getColor()==another.getColor() && this.getUserName()==another.getUserName())
			return true;
		return false;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
}
