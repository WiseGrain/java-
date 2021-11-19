
final public class HomeCar extends Car{
	private int num;
	
	public HomeCar() {
		
	}
	public HomeCar(String color,String userName,int num) {
		this.setColor(color);
		this.setUserName(userName);
		this.setNum(num);
	}
	
	public void display() {
		System.out.println(this.getUserName()+"拥有的"+this.getColor()+"颜色的私家车有"+this.getNum()+"座位");
	}
	public void display(int num) {
		System.out.println("家用汽车大多有"+num+"个座位");
	}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
