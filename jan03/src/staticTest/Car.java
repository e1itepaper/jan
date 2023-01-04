package staticTest;

public class Car {

	private String model;
	private String color;
	private int speed;
	private int id;
	static int number = 0;

	// 생성자
	// return 타입이 없음 ex) void, int ....
	public Car(String model, String colr, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.id = ++number;

	}

	public static void main(String[] args) {
		Car car1 = new Car("BMW", "white", 200);
		Car car2 = new Car("BMW", "white", 200);
		Car car3 = new Car("BMW", "white", 200);
		Car car4 = new Car("BMW", "white", 200);
		Car car5 = new Car("BMW", "white", 200);

		System.out.println(Car.number);
	}
}
