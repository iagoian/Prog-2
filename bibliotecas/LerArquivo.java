package bibliotecas;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("teste3.txt"); // This is a class that gets a file
			InputStreamReader isr = new InputStreamReader(is);
			//char c = 0;
			BufferedReader br = new BufferedReader(isr);
			String s = null;
			// try {
			
			while(s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			
			br.close();
			isr.close();
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}