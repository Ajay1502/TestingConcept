package loopingpattern;

public class NestedLoopingPattern {

	public static void main(String[] args) {
		for(int a =1; a>=5; a++) {
	     for(int d =1; d<=a; d++) {
					System.out.print("* ");
				  }
				System.out.println();
	      }
	//for(int a =1; a<=5; a++) {
	//	for(int b =4; b>=a; b--) {
	//		System.out.print("* ");
	//	}
	//	System.out.println();
	//}
	}

}
