package TestingSteam;
import java.io.*;

public class TestDataStream {

	public static void main(String[] args) throws IOException {
		try {
		// out
			DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("temp.dat")));
			
			//output.writeUTF("John");
			output.writeDouble(85.5);
			//output.writeUTF("Jim");
			output.writeDouble(185.5);
			//output.writeUTF("George");
			output.writeDouble(105.25);
			
			output.close();
			
			// in
			DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("temp.dat")));
			/*
			System.out.println(input.readUTF()+' '+input.readDouble());
			System.out.println(input.readUTF()+' '+input.readDouble());
			System.out.println(input.readUTF()+' '+input.readDouble());
			*/
			
			while (true) {
				System.out.println(input.readDouble());
			}
		}
		catch (EOFException ex) {
			System.out.println("EOFFFFFFF");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
