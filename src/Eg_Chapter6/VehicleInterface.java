package Eg_Chapter6;

public class VehicleInterface {
	public static void main(String[] args) {
		Motobike moto = new Motobike("Honda", 100, 4, 2);
		moto.changeGear(2);
		moto.speedUp(3);
		moto.brake(1);
		System.out.println("Motobike: ");
		moto.printStates();

		Car car = new Car("Mitsubishi", 300, 6, 4);
		car.changeGear(1);
		car.speedUp(4);
		car.brake(3);
		System.out.println("Car: ");
		car.printStates();
	}
}
