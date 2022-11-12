package objectorientedprogramming;
// to provide reletion between Interfece and class then use "implements"
public class Thar implements Vehicle {

	public static void main(String[] args) {
		Thar vx = new Thar();
		vx.breake();
		vx.acceleration();
		vx.wheel();
		vx.sunroof();
		
	}

	@Override
	public void breake() {
		System.out.println("Breake functinality are working");
		
	}

	@Override
	public void acceleration() {
		System.out.println("Acceleraton functinality are working");
		
	}

	@Override
	public void wheel() {
		System.out.println("Wheel functinality are working");
		
	}

	@Override
	public void sunroof() {
		System.out.println("Sunroof functinality are working");
		
	}

}
