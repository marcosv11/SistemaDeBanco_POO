package sistema_de_banco;

public class Administrador extends Validador {

	private int codigo1;
	private String nome;

	public Administrador(int codigo1) {
		if (codigo1 != super.getCodigo()) {
			throw new IllegalArgumentException("\nO código coloca é invalido");

		} else {
			this.codigo1 = codigo1;
			
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo1() {
		return codigo1;
	}

	// public void setCodigo1(int codigo1) {
	// if (codigo1 != super.getCodigo()) {
	// System.out.println("Senha errada");
	// throw new IllegalArgumentException("O código coloca é invalido");

	// } else {
	// this.codigo1 = super.getCodigo();
	// System.out.println("senha correta");
	// }

}
