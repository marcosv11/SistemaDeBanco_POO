package sistema_de_banco;

public abstract class Conta {

	private Cliente titular;
	private Administrador adm;
	protected double saldo;
	private int agencia;
	private int numero;
	private static int total = 0;
	private static int totalDinheiro = 0;

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		
	}

	public void depositar(double valor) {
		this.saldo += valor;
		Conta.totalDinheiro += valor;
		System.out.println("Foi depositado: " + valor + "\n");
	}

	public void sacar(double valor) {
		if (valor >= this.saldo) {
			this.saldo = -valor;
			Conta.totalDinheiro += this.saldo;
		}
	}

	public void transfere(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Foi transferido: " + valor + " para a conta " + destino.getNumero() + " agencia "
				+ destino.getAgencia() + ".\n");
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		//Conta.totalDinheiro += this.saldo;
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valores negativos");
			return;
		}
		this.numero = numero;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}

	public Administrador getAdm() {
		return adm;
	}

	public void setAdm(Administrador adm) {
		this.adm = adm;
	}

	public void dadosBanco(Administrador adm) {
		if (adm.validarSenha(adm)) {
			System.out.println("O total de contas cridas até agora são: " + total);
			System.out.println("Total de dinheiro do banco é: " + totalDinheiro);
		}
	}

	public static int getTotalDinheiro() {
		return totalDinheiro;
	}

	

}
