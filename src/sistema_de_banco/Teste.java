package sistema_de_banco;

public class Teste {

	public static void main(String[] args) {

		Conta cp1 = new ContaPoupanca(1885, 4232); // cria uma conta nova
		cp1.depositar(100); // deposita dinheiro

		Conta cc2 = new ContaCorrente(2345, 3455); // cria uma conta nova
		cc2.depositar(300); // deposita o dinheiro na conta

		cp1.transfere(20, cc2); // transfere o dinhehro da conta A para B

		Administrador adm1 = new Administrador(1234); // cria um acesso privelegiado 

		Conta cAdm = new ContaAdminstradora(0, 0); // cria uma conta de administrador  
		 
		cAdm.dadosBanco(adm1); // valida o codigo do administrador 

	}

}
