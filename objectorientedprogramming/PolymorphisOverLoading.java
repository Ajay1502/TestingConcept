package objectorientedprogramming;

public class PolymorphisOverLoading {

	public static void main(String[] args) {
		PolymorphisOverLoading pol =new PolymorphisOverLoading();
		System.out.println("NR of arguments are different");
		pol.add(20, 40);
		pol.add(20, 30, 40);
		
		
		System.out.println("Sequnce of arguments are different");
		pol.employee("jack", 12345);
        pol.employee(54321, "atrox");
        
        
        System.out.println("DataTypes of arguments different");
        pol.compony("6STR TUNER");
        pol.compony(85548);
        pol.compony(18.32);
        
	}
/*	  Compile time Polymorphis
	  1.method overloading 
	  The class comtain more than one method with same name and different argument
	  Overloading method are four types  
    1.NR of arguments*/
    public void add(int a,int b) {
    	int c = a+b;
    	System.out.println(c);
    }
    public void add(int x,int y, int z) {
    	int k =x+y+z;
    	System.out.println(k);
    }
    
    
//  2.Sequnce of arguments
    public void employee(String name,int empId) {
       System.out.println("Employee name :"+name+"employee no :"+empId);	
    }
    public void employee(int empId,String name) {
    	System.out.println("employee no :"+empId+"Employee name :"+name);
    }
    
   
//  3. DataTypes of arguments
    public void compony(String name) {
    	System.out.println(name);
    }
    public void compony(int no) {
    	System.out.println(no);
    }
    public void compony(double revenue) {
    	System.out.println("Compony revenue in million :"+revenue);
    }
}









