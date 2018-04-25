package panelesEmpleados;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaVerEmpleados extends JPanel {
	
	private JButton btnAtrs;
	/**
	 * Create the panel.
	 */
	public VentanaVerEmpleados() {
		setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(556, 134, 17, 223);
		add(scrollBar);
		
		JLabel lblEmpleadosRegistrados = new JLabel("Empleados registrados");
		lblEmpleadosRegistrados.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmpleadosRegistrados.setBounds(60, 64, 168, 25);
		add(lblEmpleadosRegistrados);
		
		JList list = new JList();
		list.setBounds(60, 134, 513, 223);
		add(list);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(60, 396, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(483, 396, 90, 35);
		add(btnSalir);

	}
	public JButton getBtnAtrs() {
		return btnAtrs;
	}
}
