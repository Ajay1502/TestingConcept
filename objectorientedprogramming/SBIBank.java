package objectorientedprogramming;

public class SBIBank extends RBI{

	public static void main(String[] args) {
		
		SBIBank sb = new SBIBank();
		sb.overdraft();
		sb.deposite();
		sb.withdraw();
		sb.employee = 987984678;
		System.out.println(sb.employee);
	}
    public void overdraft() {
    	System.out.println("this is sbi od functionality");
    }
}
