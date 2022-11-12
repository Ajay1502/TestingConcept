package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchBlock {

	public static void main(String[] args) throws IOException {
		/*1.Application(program) without try catch block.
		  2.
		 * */
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		try {
			File file = new File("C:\\Users\\ajay pande\\Downloads");
			FileInputStream fl =new FileInputStream(file);
			fl.close();
		}
		catch(FileNotFoundException f) {
			System.out.println("File hae been remove directory please add file! ");
		}
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");

	}

}
