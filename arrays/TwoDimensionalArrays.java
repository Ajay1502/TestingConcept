package arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		int rooms [][]= {{11,21,31,41,51},{12,22,32,42,52},{13,23,33,43,53},{14,24,34,44,54}};
            for(int i=0; i<4;i++) {
               for(int j=4; j>=0;j--) {

            		System.out.printf("%5d",rooms[i][j]);
            	}
               System.out.println();
            }
        System.out.println("***************************************************");
         String name[][] = {{"Ajay  ","Deepak ","Abhay"},{"Abhi  ","Mahesh ","Rushi"},{"Nilesh","Pratik ","Gopal"},{"akash ","Sushant","Parag"}};
         for(int i=0; i<4;i++) {
        	 for(int j=0;j<3;j++) {
        		 System.out.print(name[i][j]);
        		 System.out.printf("       ");
        	 } 
        	 System.out.println();
         }
         System.out.println("***************************************************");
         int num [][] = new int [2][3];
         num [0][0] = 1001;
         num [0][1] = 1002;
         num [0][2] = 1003;
         num [1][0] = 2001;
         num [1][1] = 2002;
         num [1][2] = 2003;
       
         for(int i=0; i<num.length;i++) {
        	 for(int j=0;j<num[i].length;j++) {
        		 System.out.printf("%5d",num[i][j]);
        		 } 
        	 System.out.println();
         }
	}

}
