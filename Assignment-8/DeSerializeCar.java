package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeCar {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("Cardataser.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Car car = (Car) ois.readObject();
			ois.close();
			fis.close();
			System.out.println(car.toString());
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
