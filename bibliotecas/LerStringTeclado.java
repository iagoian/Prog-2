package bibliotecas;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerStringTeclado {

	public static void main(String[] args) {
		
		System.out.println("Digite uma mensagem: ");
		InputStream is = System.in; //This is a class which gets an input byte
		InputStreamReader isr = new InputStreamReader(is);
		//char c = 0;
		BufferedReader br = new BufferedReader(isr);
		String s = "";
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Você digitou a tecla: "+s);
		
	}
	
}