package Media;

import javax.swing.JOptionPane;

public class Media1 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Insira a primeria nota: ");
		String n2 = JOptionPane.showInputDialog("Insira a segunda nota: ");
		String n3 = JOptionPane.showInputDialog("Insira a terceira nota: ");
		
		Double n11 = Double.valueOf(n1);
		Double n22 = Double.valueOf(n2);
		Double n33 = Double.valueOf(n3);

		Double media = (n11 + n22 + n33)/3;
		
		if(media > 7) {
			JOptionPane.showMessageDialog(null,"Sua media = " +  Math.round(media) + "\n Voce esta Aprovado!");
			}
		
		if (media > 4 && media < 7) {
			JOptionPane.showMessageDialog(null, "Sua media = "+  Math.round(media) + "\n Voce esta em Recuperacao!");
			
		}
		if (media <4) {
			JOptionPane.showMessageDialog(null,"Sua media =  " + Math.round(media) + " \n Voce esta Reprovado!");
			
		}
		}
}
