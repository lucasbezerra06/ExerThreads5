package controller;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ThreadNiquel extends Thread{
	private JTextField tfNiquel;
	static int finalizada = 0;
	JButton btnJogar;
	public ThreadNiquel(JTextField tfNiquel,JButton btnJogar) {
		this.tfNiquel = tfNiquel;
		this.btnJogar = btnJogar;

	}
	
	
	
	@Override
	public void run() {

		girarNiquel();
	}



	private void girarNiquel(){
		int vezes = (int)((Math.random()*150)+1);
		for(int i = 0;i<vezes;i++){
			Integer num = (int)((Math.random()*7)+1);
			tfNiquel.setText(num.toString());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		finalizada++;
		if(finalizada == 3){
			btnJogar.setEnabled(true);
			finalizada = 0;
		}
		
	}

}
