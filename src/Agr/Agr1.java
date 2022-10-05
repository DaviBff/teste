package Agr;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Agr1 {

	public static void main(String[] args) {
		Integer vet[] = new Integer[5];
		Integer maior = Integer.MIN_VALUE;
		Integer menor = Integer.MAX_VALUE;

		for (int i = 0; i < vet.length; i++) {
			String num = JOptionPane.showInputDialog("Insira um numero: ");
			Integer num1 = Integer.valueOf(num);
			vet[i] = num1;
			if (num1 > maior) {
				maior = vet[i];

			}
			if (num1 < menor) {
				menor = vet[i];
			}

		}

		JOptionPane.showInternalConfirmDialog(null, " Maior sendo = " + maior + "\n"
				+ " Menor sendo = " + menor);

	}

}
