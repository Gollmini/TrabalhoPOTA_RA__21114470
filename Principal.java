import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

//Classe Principal
public class Principal {
	protected static File arquivo = new File("C://Users//Cliente//Desktop//POTA//arquivoDados.csv");
	protected static ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	protected static String nomeDaPessoa = "k";
	protected static String line;
	protected static int contador = 0;

	public static ArrayList lerArquivo() {
		try (BufferedReader bufferReader = new BufferedReader(
				new InputStreamReader(new FileInputStream(arquivo), "UTF-8"))) {
			while ((line = bufferReader.readLine()) != null) {
				String[] vect = line.split(",");
				Pessoa pessoa = new Pessoa(vect[0], vect[1], vect[2], vect[3], vect[4], vect[5], vect[6]);

				lista.add(pessoa);
			}
		} catch (Exception exc) {
			System.out.println("erro");
		}

		return lista;
	}

	private static String buscaBinaria(ArrayList<Pessoa> list, String chave) {
		int meio, inicio = 0, fim = list.size() - 1;
		int res = 0;
		int contador = 0;

		while (inicio <= fim) {
			contador++;
			meio = (inicio + fim) / 2;

			if (list.get(meio).nome.equals(chave)) {
				System.out.println("quantidade de comparacoes: " + contador);
				return list.get(meio).toString();
			} else if (list.get(meio).nome.compareToIgnoreCase(chave) < 0) {
				inicio = meio + 1;
			} else if (list.get(meio).nome.compareToIgnoreCase(chave) > 0) {
				fim = meio - 1;
			}
		}
		System.out.println("Quantidade de comparacoes: " + contador );
		
		return null;
	}

	public static void main(String[] args) {
		boolean sistemaRodando = true;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome da Pessoa OU para sair digite: exit");
		String nome = scanner.nextLine();
		if(nome != "exit") {
			String resultado = buscaBinaria(lerArquivo(), nome);
			if (null != resultado) {
				System.out.println(resultado);
			} else {
				System.out.println("Dados nao localizados: " + nome);
			}

		}else {
			System.out.println("obrigado por utilizar nosso serviços");
		}

			//Manuela Melo
			// Efren York
		//Christopher Sloan
		
	}
}