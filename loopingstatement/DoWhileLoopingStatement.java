package loopingstatement;

public class DoWhileLoopingStatement {//3

	public static void main(String[] args) {
		DoWhileLoopingStatement dwl = new DoWhileLoopingStatement();
		dwl.table2();
		int i = 1;
		
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=10);
			
		

	}
    public void table2() {
    	int b = 1;
    	do {
    		System.out.println(2*b);
    		b++;
    	}
    	while(b<=10);
    }
}
