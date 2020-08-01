package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine("52WVC10338", 1000);
		Car car = new Car("AP 16 CD 1990", "MarutiSuzuki", engine);
		try {
			FileOutputStream fos = new FileOutputStream("Cardataser.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(car);
			System.out.println("Serialization done successfully");
			oos.close();
			fos.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
