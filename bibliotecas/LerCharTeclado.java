package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerCharTeclado {

	public static void main(String[] args) {
		
		System.out.println("Digite uma única tecla: ");
		InputStream is = System.in; //This is a class which gets an input byte
		InputStreamReader isr = new InputStreamReader(is);
		char c = 0;
		try {
			c = (char) isr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Você digitou a tecla: "+c);
		
	}
	
}