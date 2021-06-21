package sistema_de_banco;

public abstract class Validador {
	
	private Administrador adm;
	private int codigo = 1533;
	
	public int getCodigo() {
		return this.codigo;
	}

	public Administrador getAdm() {
		return adm;
	}

	public void setAdm(Administrador adm) {
		this.adm = adm;
	}
	
	public boolean validarSenha(Administrador adm) {
		if(adm.getCodigo1() == this.codigo) {
			 System.out.println("Conta de administrador validade com sucesso!");
			return true;
		}
		System.out.println("Erro na validação, senha errada");
		return false;
	}
	
}
