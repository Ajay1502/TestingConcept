package objectorientedprogramming;

public class HDFCbank extends RBI{

	public static void main(String[] args) {
		
		HDFCbank hd = new HDFCbank();
		hd.overdraft();
        hd.deposite();
        hd.withdraw();
	}
        public void overdraft() {
        	System.out.println("this is hdfc od functionality");
        }
}
