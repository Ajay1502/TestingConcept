package loopingpattern;

public class LoopingAlphabetPattern {

	public static void main(String[] args) {
		char ch ='A';
		for(int a=1; a<=5; a++) {
			
			for(int b=1; b<=a; b++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
		for(int a= 1; a<= 5; a++) {
			
			for(int b= 4;b>=a; b--) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
