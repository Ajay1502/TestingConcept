package objectorientedprogramming;

public class ParentEncapsulation {

	  //data members is called Variable
	  //Access level will be within a class
	 private String username ="ajay";
	 private String password ="ajaypande";
	 
	 //Getter method
	 public void getdata() {
		 System.out.println(username);
		 System.out.println(password);
	 }
	 
	 //setter method
	 public void setdata(String un,String pwd) {
		 username = un;
		 password = pwd;
	 }
}
