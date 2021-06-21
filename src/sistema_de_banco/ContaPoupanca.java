package sistema_de_banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		System.out.println("Conta poupança criada com sucesso. \nAgencia: " + super.getAgencia() + "  Conta: " + super.getNumero()+"\n");

	}


}
