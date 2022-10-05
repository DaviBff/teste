package EX;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		int vet[] = new int[5];
		int cont = 0;
		for (int i = 0; i < vet.length; i++) {
			String num = JOptionPane.showInputDialog("Digite o numero: ");
			Integer impar = Integer.valueOf(num);
			vet[i] = impar;
			if (vet[i] % 2 == 0) {
				cont += 0;

			} else {
				cont += 1;

			}
		}
		JOptionPane.showMessageDialog(null,"Quantidade de impares = "+ cont);

	}

}
