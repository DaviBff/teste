package Prova;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Prova1 {

	public static void main(String[] args) {
		Integer vet[] = new Integer[5];

		for (int i = 0; i < vet.length; i++) {
			String num = JOptionPane.showInputDialog("Insira um numero: ");
			Integer num1 = Integer.valueOf(num);
			 vet[i] = num1;
			Integer soma = somaMain( num1, vet[]);

		}
			 JOptionPane.showMessageDialog(null, soma);

		}

	static int somaMain(Integer vet[], Integer soma) {
		soma = 0;
		for (int i = 0; i < vet.length; i++) {

			soma += vet[i];
		}

		return soma;

	}

}
