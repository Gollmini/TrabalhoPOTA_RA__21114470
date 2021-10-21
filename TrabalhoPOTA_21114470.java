import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TrabalhoPOTA_21114470{
	Scanner scanner = new Scanner(System.in);

	
	public void buscaBinaria(){
		int inicio = 0;
		int meio = 0;
		//	ArrayQueue arquivo =  = new ArrayQueue();
	}

	public static void lerArquivo(){
			//Reader reader = Files.newBufferedReader(Paths.get("arquivoDados.csv"));
			//CSVReader  csv = new CSVReaderBuilder(reader).wikiSkipLines(1).build();
		try{
			File arquivo = new File("C://Users//Cliente//Desktop//POTA//arquivoDados.txt");
			FileReader fileReader = new FileReader(arquivo);
			BufferedReader bufferReader = new BufferedReader(fileReader);
		//	Scanner sc = new Scanner(arquivo);
			String str;
			System.out.println(arquivo);
			while((str = bufferReader.readLine()) != null){
				System.out.println(str);
			}
			sc.close();
		}catch(Exception exc){
			System.out.println("fsfdsfdss");
		}


	}

	public static void main(String[] args) {
		lerArquivo();

	}

}
