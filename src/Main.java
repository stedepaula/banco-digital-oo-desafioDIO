
public class Main {

	public static void main(String[] args) {
		Cliente stef = new Cliente();
		stef.setNome("Sfef");
		
		Conta cc = new ContaCorrente(stef);
		Conta poupanca = new ContaPoupanca(stef);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
