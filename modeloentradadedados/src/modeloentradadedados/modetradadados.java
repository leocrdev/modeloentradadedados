package modeloentradadedados;

import javax.swing.JOptionPane;

public class modetradadados {
	
	/* Main � um metodo auto execut�vel em Java */
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Qual a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Qual a quantidade de pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		System.out.println(resposta);
		
		JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu " + divisao + " carros e sobrou " + resto + " carros ");
		
	}

}
