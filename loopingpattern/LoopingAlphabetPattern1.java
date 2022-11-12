package loopingpattern;

public class LoopingAlphabetPattern1 {

	public static void main(String[] args) {
		char ch ='A';
		for(int a=1; a<=7; a++) {
			ch='A';
			for(int b=1; b<=a; b++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
		for(int a= 1; a<= 7; a++) {
			ch='A';
			for(int b= 6;b>=a; b--) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
