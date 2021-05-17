package excecoes;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteException4 {
	public static void Metodo1() throws FileNotFoundException{
		
			new FileReader("C:\\Arquivodeteste.txt");
		
	}
}