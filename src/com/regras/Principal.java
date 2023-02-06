package com.regras;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos 
		Conta conta = new Conta("8470","2398",0);
		
		// Declaração de ariaveis
		String valor;
		
		// Declaração de array
		Object[] opcao = {"Consultar Dados", "Consultar saldo", "Depositar", "Sacar", "Sair"};
		Object opcaoEscolhida;
	
		//Algoritmo
		conta.setNumeroTitular(JOptionPane.showInputDialog("Informe o nome do titular da conta"));
		
		do {
			
			
			
			opcaoEscolhida = JOptionPane.showInputDialog(null,"Escolha a ação desejada","ação",JOptionPane.INFORMATION_MESSAGE,null,opcao,opcao[0]);
			
			
			if(opcaoEscolhida == "Consultar Dados")
				JOptionPane.showMessageDialog(null, conta.contultarDados());
			else if(opcaoEscolhida == "Consultar saldo")
				JOptionPane.showMessageDialog(null, conta.consultarSaldo());
			else if(opcaoEscolhida == "Depositar") {
				valor = JOptionPane.showInputDialog(null, "Informe o valor a ser depositado");
				valor = valor.replace(",", ".");
				conta.depositarValor(Double.parseDouble(valor));
			}
			else if (opcaoEscolhida == "Sacar") {
				valor = JOptionPane.showInputDialog("Informe o valor que deseja sacar");
				valor = valor.replace(",", ".");
				conta.sacarValor(Double.parseDouble(valor));
			}
			else
				JOptionPane.showMessageDialog(null, "Obrigado! Tenha um bom dia");
			
		}while(opcaoEscolhida != "Sair");
		
		// Encerra o programa
		System.exit(0);
		
	}

}
