
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("红色","张三");
		Car car2 = new Car("红色","张三");
		
		car1.use();
		
		System.out.println(car1.equals(car2));
		
		Taxi taxi = new Taxi("黑色","李四","奔驰");
		HomeCar homecar = new HomeCar("白色","王五",4);
		
		taxi.ride();
		taxi.use();
		
		System.out.println(taxi.toString());
		
		homecar.display();
		homecar.display(5);
	
		
		
		
	}

}
