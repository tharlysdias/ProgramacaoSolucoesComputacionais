package poo;

public class Pessoa {

	private Long id;
	private String nome;
	private String sobreNome;
	private String cpf;
	private String telefone;
	private String email;
	private String endereco;
	private String dataNascimento;
	private char sexo;
	private double peso;

	public void andar() {
		System.out.println("Pessoa andou!  ->  " + this.toString());
	}

	public void dormir() {
		System.out.println("Pessoa dormiu");
	}

	public void comer() {
		System.out.println("Pessoa comeu");
	}

	public String respirar() {
		return "Pessoa respirou";
	}

	public void pagarImposto() {
		System.out.println("Pessoa pagou o imposto!");
	}

	protected final Long getId() {
		return id;
	}

	protected final void setId(Long id) {
		this.id = id;
	}

	protected final String getNome() {
		return nome;
	}

	protected final void setNome(String nome) {
		this.nome = nome;
	}

	protected final String getSobreNome() {
		return sobreNome;
	}

	protected final void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	protected final String getCpf() {
		return cpf;
	}

	protected final void setCpf(String cpf) {
		this.cpf = cpf;
	}

	protected final String getTelefone() {
		return telefone;
	}

	protected final void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	protected final String getEmail() {
		return email;
	}

	protected final void setEmail(String email) {
		this.email = email;
	}

	protected final String getEndereco() {
		return endereco;
	}

	protected final void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	protected final String getDataNascimento() {
		return dataNascimento;
	}

	protected final void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	protected final char getSexo() {
		return sexo;
	}

	protected final void setSexo(char sexo) {
		try {
			if (sexo == 'F' || sexo == 'M' || sexo == 'O') {
				this.sexo = sexo;
			}
		} catch (Exception e) {
			System.out.println("Sexo inexistente!" + e.getMessage());
		}
	}

	protected final double getPeso() {
		return peso;
	}

	protected final void setPeso(double peso) {
		this.peso = peso;
	}

}
