package questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtVoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("20 - Maria");
		lblNewLabel.setBounds(20, 63, 58, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("30 - Pedro");
		lblNewLabel_1.setBounds(20, 78, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1 - Nulo");
		lblNewLabel_2.setBounds(20, 118, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2 - Branco");
		lblNewLabel_3.setBounds(20, 137, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		txtVoto = new JTextField();
		txtVoto.setBounds(104, 183, 86, 20);
		contentPane.add(txtVoto);
		txtVoto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Seu Voto");
		lblNewLabel_4.setBounds(20, 186, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Votar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vMaria = 0, vPedro = 0, totalVotos = 0, vBranco = 0, vNulo = 0;
				int voto = Integer.parseInt(txtVoto.getText());
				double perVit, perBranco = 0, perNulo = 0; 
				switch(voto){
					case 20:
						vMaria++;
						totalVotos++;
						break;
					case 30:
						vPedro++;
						totalVotos++;
						break;
					case 1:
						vNulo++;
						totalVotos++;
						perNulo = (vNulo/totalVotos) * 100;
						break;
					case 2:
						vBranco++;
						totalVotos++;
						perBranco = (vBranco/totalVotos) * 100;
						break;
					default:
						
						break;
				}
				if (vMaria > vPedro) {
					perVit = (vMaria / totalVotos) * 100; 
					JOptionPane.showMessageDialog(null,"Maria venceu com " + perVit );
					
				}
				if (vMaria < vPedro) {
					perVit = (vPedro / totalVotos) * 100; 
					JOptionPane.showMessageDialog(null,"Pedro venceu com " + perVit );
					
				}
				JOptionPane.showMessageDialog(null,"Porcentagem de votos brancos: " + perBranco );
				JOptionPane.showMessageDialog(null,"Porcentagem de votos nulos: " + perNulo );
				JOptionPane.showMessageDialog(null,"Número total de votos:" + totalVotos );
			}
			
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(51, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Fechando o programa");
				System.exit(0);
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(167, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}