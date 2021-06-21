package sistema_de_banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		System.out.println("Conta corrente criada com sucesso. \nAgencia: " + super.getAgencia() + "  Conta: " + super.getNumero()+"\n");
	}


}
