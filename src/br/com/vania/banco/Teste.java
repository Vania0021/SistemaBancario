package br.com.vania.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta ();
		cc.saldo = 100.0;
		cc.agencia = 129;
		cc.numero = 3939;
		
		cc.depositar(1500);
		
		 System.out.println(cc.verificarSaldo());
		 
		 Conta poupanca = new Conta(111, 222, 1045);
		 poupanca.retirar(23.0);
		 
		 System.out.println(poupanca.verificarSaldo());
			 
		 
	}

}
