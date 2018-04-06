package TestingSteam;

import java.io.*;

public abstract class TestFileStream {

	public static void main(String[] args) throws IOException {
		String textfile = "tempOutput.txt";
		String datafile = "tempOutput.dat";
		
		FileOutputStream output = new FileOutputStream(datafile);
		for (int i=0; i<10; i++) {
			output.write(i);
		}
		output.close();
		
		FileInputStream input = new FileInputStream(datafile);
		int foo;
		while ((foo = input.read()) != -1) {
			System.out.println(foo+" ");
		}
		input.close();
	}
}
