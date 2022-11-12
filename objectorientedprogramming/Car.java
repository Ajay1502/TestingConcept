package objectorientedprogramming;
//we can declare abstract class by using abstract keyword
public abstract class Car {
	public static void main(String[] args) {
//		Car c = new Car(); it's not possible to create to object in a abstract method
	}
//	abstract method in two type method concrete and unconcrete
//  Concrete method
	public void wheels() {
		System.out.println("car should have four wheels");
	}
//	Unconcrete method
//  Abstract method is a empty method and without code body
	public abstract void colour();
	
	public abstract void engine();
}
