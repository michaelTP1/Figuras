package co.github.michaeltp1.figuras.pruebas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.github.michaeltp1.figuras.objects.Cuadrado;
import com.github.michaeltp1.figuras.objects.Elipse;
import com.github.michaeltp1.figuras.objects.Rectangulo;

public class Main {
	public static void main(String[] args) {
		
	
		
		try {
			FileInputStream fileIn=new FileInputStream("rectangulo");
			ObjectInputStream objectIn=new ObjectInputStream(fileIn);
			
			Rectangulo r=(Rectangulo) objectIn.readObject();
			objectIn.close();
			fileIn.close();
			System.out.println(r.toString());	
			
			
					
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
