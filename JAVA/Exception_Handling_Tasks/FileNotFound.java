package Exception_Handling_Tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Write a Java program that attempts to open a file that does not exist and handles the "FileNotFoundException."

public class FileNotFound {

	public static void main(String[] args) {

		String fileName = "file.txt";

		try {
			File file = new File(fileName);
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {

			System.err.println("Exception caught : " + e.getMessage());
			System.err.println("File not found : " + fileName);

		}

	}

}
