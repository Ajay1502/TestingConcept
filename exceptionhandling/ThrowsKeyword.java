package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
//Throws key word will be used for checked(Compile time) exception
	public static void main(String[] args) {
		ThrowsKeyword tk = new ThrowsKeyword();
		try {
		tk.readfile();}
		catch(FileNotFoundException ff) {
			System.out.println("file has been remove form directory,plz add file");
			try {
				FileInputStream file = new FileInputStream("C:\\Users\\ajay pande\\Downloads");
				System.out.println("we are using defaultfile as original file is not available at director");}
			catch(Exception e) {
				System.out.println("Default file is missing");
			}
		}
	}
    public void readfile() throws FileNotFoundException {
    	FileInputStream fil =new FileInputStream("C:\\Users\\ajay pande\\Download");
    	System.out.println("we are able to read file");
   
    }
}
  