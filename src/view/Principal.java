package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.JogarController;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField tfNiquel1;
	private JTextField tfNiquel2;
	private JTextField tfNiquel3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNiquel1 = new JTextField();
		tfNiquel1.setBounds(53, 58, 80, 47);
		contentPane.add(tfNiquel1);
		tfNiquel1.setEditable(false);
		tfNiquel1.setHorizontalAlignment(tfNiquel1.CENTER);
		tfNiquel1.setFont(new java.awt.Font("sansserif", 1, 20));
		
		tfNiquel2 = new JTextField();
		tfNiquel2.setColumns(10);
		tfNiquel2.setBounds(173, 58, 80, 47);
		contentPane.add(tfNiquel2);
		tfNiquel2.setEditable(false);
		tfNiquel2.setHorizontalAlignment(tfNiquel2.CENTER);
		tfNiquel2.setFont(new java.awt.Font("sansserif", 1, 20));
		
		tfNiquel3 = new JTextField();
		tfNiquel3.setColumns(10);
		tfNiquel3.setBounds(294, 58, 80, 47);
		contentPane.add(tfNiquel3);
		tfNiquel3.setEditable(false);
		tfNiquel3.setHorizontalAlignment(tfNiquel3.CENTER);
		tfNiquel3.setFont(new java.awt.Font("sansserif", 1, 20));
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBounds(294, 205, 117, 25);
		contentPane.add(btnJogar);
		JogarController jc = new JogarController(tfNiquel1, tfNiquel2, tfNiquel3, btnJogar);
		btnJogar.addActionListener(jc);
		
		
	}
}
