package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Panel extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel frame = new Panel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNum1 = new JLabel("Digite um numero");
		lblNum1.setBounds(27, 73, 82, 13);
		contentPane.add(lblNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(119, 70, 96, 19);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite outro numero");
		lblNewLabel.setBounds(27, 114, 96, 13);
		contentPane.add(lblNewLabel);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(131, 111, 96, 19);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		JButton btnSoma = new JButton("New button");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = txtNum1.getText();
				String texto2 = txtNum2.getText();
				Integer num1 = Integer.valueOf(texto1);
				Integer num2 = Integer.valueOf(texto2);
				
				int soma = num1 + num2;
				
				if (!texto1.isEmpty() && !texto2.isEmpty()) {
					
				}
			}
		});
		btnSoma.setBounds(119, 163, 85, 21);
		contentPane.add(btnSoma);
		
		JLabel lblSoma = new JLabel("");
		lblSoma.setBounds(141, 214, 45, 13);
		contentPane.add(lblSoma);
	}
}
