import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
		try (BufferedReader bufferReader = new BufferedReader(new FileReader(arquivo))) {
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

	public static void buscaBinaria(ArrayList lista, String nomeDaPessoa) {
		Scanner scan = new Scanner(System.in);
		int inicio = 0;
		System.out.println(lista.size());
		int fim = lista.size() - 1;
		int meio = 0;
		int resultado = -1;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (lista.get(meio).toString() != nomeDaPessoa) {
				inicio = meio + 1;
			} else if (lista.get(meio).toString() != nomeDaPessoa) {
				fim = meio - 1;
			} else if (lista.get(meio).toString() == nomeDaPessoa) {
				System.out.println("succcccccccccesso");
				break;
			}
		}
		if (resultado < 0) {
			System.err.println("Nome nao localizado");
		} else {
			System.out.println("Nome> " + nomeDaPessoa);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean programaRodando;
		System.out.println("Digite o nome: ");
		String nomeBuscado = scan.next();

		if (nomeBuscado != "exit") {
			buscaBinaria(lerArquivo(), nomeBuscado);
			programaRodando = true;
		} else {
			System.out.println("thank you");
			programaRodando = false;
		}

	}
}