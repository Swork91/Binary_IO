package TestingSteam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class TestFileStream {

	public static void main(String[] args) throws FileNotFoundException {
		String file = "tempOutput.txt";
		
		PrintWriter output = new PrintWriter(file);
		output.print("test1234 I slammed my elbow in a door");
		
		output.close();
		Scanner input = new Scanner(file);//(new File(file));
		System.out.println(input.nextLine());
		
	}

}
