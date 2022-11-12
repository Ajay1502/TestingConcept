 package loopingstatement;

public class ForLoopingStatement {  //1
         //int num;
	public static void main(String[] args) {
		ForLoopingStatement fl = new ForLoopingStatement();
		fl.even();
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter number");
         //fl.num = sc.nextInt();
         System.out.println("print odd number");
        for(int i=0 ; i<=3 ; i++) {
        	System.out.println(2*i+1);
        }

	}
        public void even () {
        	System.out.println("print even number");
        	 for(int i=0 ; i<=3 ; i++) {
             	System.out.println(2*i);
        }
        }
}
