package panelesMesas;

import javax.swing.JPanel;

import ventana.VentanaJFrame;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VentanaMesas extends JPanel {

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btnAtrs;
	
	public VentanaMesas() {
		setLayout(null);
		
		
		JLabel lblMesas = new JLabel("Mesas");
		lblMesas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMesas.setBounds(25, 29, 73, 31);
		add(lblMesas);
		
		JLabel lblSaln = new JLabel("Sal\u00F3n: ");
		lblSaln.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSaln.setBounds(34, 111, 64, 23);
		add(lblSaln);
		
		btn1 = new JButton("1");
		btn1.setBounds(52, 171, 60, 35);
		add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(174, 171, 60, 35);
		add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(292, 171, 60, 35);
		add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(410, 171, 60, 35);
		add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(529, 171, 60, 35);
		add(btn5);
		
		JLabel lblTerraza = new JLabel("Terraza: ");
		lblTerraza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTerraza.setBounds(34, 250, 64, 31);
		add(lblTerraza);
		
		btn6 = new JButton("6");
		btn6.setBounds(52, 320, 60, 35);
		add(btn6);
		
		btn7 = new JButton("7");
		btn7.setBounds(174, 320, 60, 35);
		add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(292, 320, 60, 35);
		add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(410, 320, 60, 35);
		add(btn9);
		
		btn10 = new JButton("10");
		btn10.setBounds(529, 320, 60, 35);
		add(btn10);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnAtrs.setBounds(144, 404, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(407, 404, 90, 35);
		add(btnSalir);

	}

	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public JButton getBtn6() {
		return btn6;
	}

	public JButton getBtn7() {
		return btn7;
	}

	public JButton getBtn8() {
		return btn8;
	}

	public JButton getBtn9() {
		return btn9;
	}

	public JButton getBtn10() {
		return btn10;
	}	
	
	public JButton getBtnAtrs()
	{
		return btnAtrs;
	}
}
