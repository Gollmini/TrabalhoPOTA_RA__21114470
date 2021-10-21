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
			File arquivo = new File("C:/Users/Cliente/Desktop/POTA/arquivoDados.csv");
			Scanner sc = new Scanner(arquivo);
			System.out.println(sc.nextLine());
			while(sc.hasNext()){
				System.out.println(sc.nextLine());
			}
			sc.close();
		}catch(Exception exc){
			System.out.println(exc.getCause());
		}


	}

	public static void main(String[] args) {
		lerArquivo();

	}

}
