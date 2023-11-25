package hust.soict.hedspi.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "D:\\java\\Demo_bf_lab\\src\\hust\\soict\\hedspi\\garbage\\Git-2.42.0-64-bit.exe";
		byte[] inputBytes = {0};
		long startTime, endTime;
		
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b : inputBytes) {
			outputString += (char)b;
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}
