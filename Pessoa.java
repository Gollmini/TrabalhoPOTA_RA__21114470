//Classe que vai receber os dados do arquivo
class Pessoa {
	String nome;
	String sexo;
	String endereco;
	String estado;
	String email;
	String telefone;
	String idade;

//Construtor utilizando todos os campos 
	public Pessoa(String nome, String sexo, String endereco, String estado, String email, String telefone, String idade){
		this.nome = nome;
		this.endereco = endereco;
		this.sexo=sexo;
		this.estado = estado;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", endereco=" + endereco + ", estado=" + estado + ", email="
				+ email + ", telefone=" + telefone + ", idade=" + idade + "]";
	}

}