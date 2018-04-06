package TestingSteam;
import java.io.*;

public class TestObjectSreamForArray {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		int[] numbers = {1,2,3,4,5};
		String[] strings = {"John", "Jim", "George"};
		
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat", true));
		
		output.writeObject(numbers);
		output.writeObject(strings);
		
		output.close();
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));
		
		int[] newNumbers = (int[]) input.readObject();
		String[] newString = (String[]) input.readObject();
		
		for (int i=0; i<newNumbers.length; i++) {
			System.out.println(newNumbers[i]);
		}
		for (int i=0; i<newString.length; i++) {
			System.out.println(newString[i]);
		}
	}//end throws/main
}
