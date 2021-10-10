package Ejercicio;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class VentanaNueva extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNueva frame = new VentanaNueva();
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
	public VentanaNueva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(304, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JRadioButton radMasculino = new JRadioButton("Masculino");
		radMasculino.setBounds(76, 76, 109, 23);
		contentPane.add(radMasculino);
		
		JRadioButton radFemenino = new JRadioButton("Femenino");
		radFemenino.setBounds(76, 115, 109, 23);
		contentPane.add(radFemenino);
		
		ButtonGroup radSexo = new ButtonGroup();
		radSexo.add(radMasculino);
		radSexo.add(radFemenino);
		
		JLabel lblNewLabel = new JLabel("Sexo");
		lblNewLabel.setBounds(50, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(radMasculino.isSelected()) {
					
					JOptionPane.showMessageDialog(contentPane, radMasculino.getText());
				}else if(radFemenino.isSelected()) {
					JOptionPane.showMessageDialog(contentPane, radFemenino.getText());
				}
				
			}
		});
		btnAceptar.setBounds(205, 227, 89, 23);
		contentPane.add(btnAceptar);
	}
}
