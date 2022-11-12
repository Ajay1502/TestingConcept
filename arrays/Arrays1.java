package arrays;

public class Arrays1 {//2

	public static void main(String[] args) {
		int [] marks = {33,44,55,53,22,45,66,36};
		System.out.println(marks.length);
		System.out.println("*************");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("************ ");
		for(int i=marks.length-1; i>=0;i--) {
			System.out.println(marks[i]);
			}
		System.out.println("***********");
		for(int element:marks) {
			System.out.println(element);
		}
		String [] name= {"ajay","abhay","deepak","sushant"};
		System.out.println("**********");
		for(String element:name) {
			System.out.println(element);
		}
		System.out.println("******");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
	}

}
