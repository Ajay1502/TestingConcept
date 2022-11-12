package objectorientedprogramming;

public class ChildEncapsulation extends ParentEncapsulation {

	public static void main(String[] args) {
		ChildEncapsulation cc = new ChildEncapsulation();
           cc.getdata();
           System.out.println("-----------------------------------");
           cc.setdata("pande", "pandeajay");
		   cc.getdata();
	}

}
