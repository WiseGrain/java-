
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
		System.out.println(this.getUserName()+"ӵ�е�"+this.getColor()+"��ɫ��˽�ҳ���"+this.getNum()+"��λ");
	}
	public void display(int num) {
		System.out.println("�������������"+num+"����λ");
	}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
