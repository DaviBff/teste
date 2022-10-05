package ex1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {

			String num1 = JOptionPane.showInputDialog(null, "Digite o primeira nota: ");
			String num2 = JOptionPane.showInputDialog(null, "Digite o segunda nota: ");
			String num3 = JOptionPane.showInputDialog(null, "Digite o terceira nota: ");

			Integer num11 = Integer.valueOf(num1);
			Integer num22 = Integer.valueOf(num2);
			Integer num33 = Integer.valueOf(num3);

			float media = calcMedia(num11, num22, num33);
			if (media > 7) {
				JOptionPane.showMessageDialog(null, "Media = " + media + "\nAprovado!");

			} else if (media >= 4 && media < 6) {
				JOptionPane.showMessageDialog(null, "Media = " + media + "\nRecuperacao!");

			} else {
				JOptionPane.showMessageDialog(null, "Media = " + media + "\nRecuperacao!");
			}

		}
	}

	static int calcMedia(int num11, int num22, int num33) {
		float media = (num11 + num22 + num33) / 3;
		return (int) media;

	}

}
