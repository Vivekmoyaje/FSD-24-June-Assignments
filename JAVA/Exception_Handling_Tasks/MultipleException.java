package Exception_Handling_Tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Exercise 7: Multiple Exceptions

//Write a Java program that demonstrates the handling of multiple exceptions, including both checked and unchecked exceptions.

public class MultipleException {

	public static void main(String[] args) throws IOException{

		FileInputStream fileInputStream = null;

		try {

			fileInputStream = new FileInputStream("file.txt");
			int data = fileInputStream.read();
			System.out.println("Read data : " + data);
		} 
		catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException caught: " + e.getMessage());
		} 
		catch (ArithmeticException e) {
			System.err.println("IOException caught: " + e.getMessage());

		}
		finally {
			try {
				if(fileInputStream != null) {
					fileInputStream.close();
				}
			}
			catch(IOException e) {
				System.err.println("Error closing the file : "+e.getMessage());
			}
		}
	}

}
