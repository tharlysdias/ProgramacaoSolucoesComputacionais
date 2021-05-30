package poo;

public class Animal {

	private Long id;
	private String nome;
	private String sobreNome;
	private String dataNascimento;
	private char sexo;
	private double peso;
	private boolean carnivoro;
	private String especie;
	private String raca;
	private int qtdePatas;

	public void andar() {
		System.out.println("Animal andou!  ->  " + this.toString());
	}

	public void dormir() {
		System.out.println("Animal dormiu");
	}

	public void comer() {
		System.out.println("Animal comeu");
	}

	public String respirar() {
		return "Animal respirou";
	}

	public void brincar() {
		System.out.println("Animal brincou!");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isCarnivoro() {
		return carnivoro;
	}

	public void setCarnivoro(boolean carnivoro) {
		this.carnivoro = carnivoro;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getQtdePatas() {
		return qtdePatas;
	}

	public void setQtdePatas(int qtdePatas) {
		this.qtdePatas = qtdePatas;
	}

}
