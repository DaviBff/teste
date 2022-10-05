package EX;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("Digite o numero");
		String num2 = JOptionPane.showInputDialog("Digite o segundo numero:");
		Integer num11 = Integer.valueOf(num1);
		Integer num22 = Integer.valueOf(num2);
		Integer soma = somaMain(num11, num22);
		JOptionPane.showMessageDialog(null, soma);

	}

	static int somaMain(Integer num11, Integer num22) {
		int soma = 0;

		soma = num11 + num22;
		return soma;

	}
}
