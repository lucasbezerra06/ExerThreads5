package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class JogarController implements ActionListener{

	private JTextField tfNiquel1;
	private JTextField tfNiquel2;
	private JTextField tfNiquel3;
	private JButton btnJogar;
	
	
	public JogarController(JTextField tfNiquel1, JTextField tfNiquel2, JTextField tfNiquel3, JButton btnJogar) {
		this.tfNiquel1 = tfNiquel1;
		this.tfNiquel2 = tfNiquel2;
		this.tfNiquel3 = tfNiquel3;
		this.btnJogar = btnJogar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		corrida();
		
	}
	
	public void corrida(){
		btnJogar.setEnabled(false);
		Thread t1 = new ThreadNiquel(tfNiquel1,btnJogar);
		Thread t2 = new ThreadNiquel(tfNiquel2,btnJogar);
		Thread t3 = new ThreadNiquel(tfNiquel3,btnJogar);
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	

}
