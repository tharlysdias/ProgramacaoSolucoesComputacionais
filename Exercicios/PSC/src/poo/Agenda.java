package poo;

public class Agenda {

	private Contato contatos[] = new Contato[5];

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	/**
	 * Metodo irá alterar apenas o nome do {@link Contato}.
	 * 
	 * @param codigo
	 * @param alteracao
	 */
	public void alterar(int codigo, String alteracao) {
		contatos[codigo].setNome(alteracao);
	}

	/**
	 * Exclui um contato a partir do codigo informado.
	 * 
	 * @param codigo
	 */
	public void excluir(int codigo) {
		contatos[codigo] = null;
	}

	/**
	 * Metodo inclui um {@link Contato} na {@link Agenda}.
	 * 
	 * @param codigo
	 * @param nome
	 * @param email
	 * @param empresa
	 * @param telefoneResidencial
	 * @param telefoneCelular
	 */
	public void incluir(int codigo, String nome, String email, String empresa, String telefoneResidencial, String telefoneCelular) {
		contatos[codigo].setCodigo(codigo);
		contatos[codigo].setNome(nome);
		contatos[codigo].setEmail(email);
		contatos[codigo].setEmpresa(empresa);
		contatos[codigo].setTelefoneResidencial(telefoneResidencial);
		contatos[codigo].setTelefoneCelular(telefoneCelular);
	}

	/**
	 * Metodo lista os cantatos salvos na {@link Agenda}.
	 */
	public void listar() {
		for (int i = 0; i < contatos.length; i++) {
			Contato contato = contatos[i];
			if (contato != null) {
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Email: " + contato.getEmail());
				System.out.println("Empresa: " + contato.getEmpresa());
				System.out.println("Telefone Residencial: " + contato.getTelefoneResidencial());
				System.out.println("Telefone Celular: " + contato.getTelefoneCelular());
			}
		}
	}

}
