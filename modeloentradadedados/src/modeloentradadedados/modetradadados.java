package modeloentradadedados;

import javax.swing.JOptionPane;

public class modetradadados {
	
	/* Main é um metodo auto executável em Java */
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Qual a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Qual a quantidade de pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros ");
		
	}

}
