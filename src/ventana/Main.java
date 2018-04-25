package ventana;

import java.awt.EventQueue;
import logo.*;

public class Main {


	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					VentanaJFrame frame = new VentanaJFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
