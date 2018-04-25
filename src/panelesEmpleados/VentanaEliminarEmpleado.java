package panelesEmpleados;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEliminarEmpleado extends JPanel {
	private JTextField textField;
	
	private JButton btnAtrs;
	/**
	 * Create the panel.
	 */
	public VentanaEliminarEmpleado() {
		setLayout(null);
		
		JLabel lblEliminarEmpleado = new JLabel("Eliminar empleado");
		lblEliminarEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEliminarEmpleado.setBounds(60, 68, 164, 44);
		add(lblEliminarEmpleado);
		
		JLabel lblIngreseRutA = new JLabel("Ingrese Rut a eliminar:");
		lblIngreseRutA.setBounds(60, 157, 139, 14);
		add(lblIngreseRutA);
		
		textField = new JTextField();
		textField.setBounds(209, 154, 199, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(277, 273, 90, 35);
		add(btnEliminar);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(60, 399, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnSalir.setBounds(487, 399, 90, 35);
		add(btnSalir);

	}
	public JButton getBtnAtrs() {
		return btnAtrs;
	}

}
