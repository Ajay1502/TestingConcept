package objectorientedprogramming;

public class HDFCLoanDepartment extends HDFCbank{

	public static void main(String[] args) {
		
		HDFCLoanDepartment hld = new HDFCLoanDepartment();
		hld.loan();
		hld.deposite();
		hld.withdraw();
		hld.overdraft();
		hld.employee = 999;
		System.out.println(hld.employee);
		
	}
       public void loan() {
    	   System.out.println("this is loan functionality");
       }
}
