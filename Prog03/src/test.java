
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("��ɫ","����");
		Car car2 = new Car("��ɫ","����");
		
		car1.use();
		
		System.out.println(car1.equals(car2));
		
		Taxi taxi = new Taxi("��ɫ","����","����");
		HomeCar homecar = new HomeCar("��ɫ","����",4);
		
		taxi.ride();
		taxi.use();
		
		System.out.println(taxi.toString());
		
		homecar.display();
		homecar.display(5);
	
		
		
		
	}

}
