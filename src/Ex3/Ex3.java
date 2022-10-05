package Ex3;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		String precoLitro = JOptionPane.showInputDialog(null, "Digite o preco do litro: ");
		String quantidadeLitro = JOptionPane.showInputDialog(null, "Digite a quantidade de litros: ");
		
		Double precoLitro1 = Double.valueOf(precoLitro);
		Integer quantidadeLitro1 = Integer.valueOf(quantidadeLitro);
		
		JOptionPane.showMessageDialog(null,"Valor a pagar ="+ quantidadeLitro1 * precoLitro1);
	}

}
