package panelesEmpleados;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAgregarEmpleado extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	
	
	private JButton btnAtrs;
	/**
	 * Create the panel.
	 */
	public VentanaAgregarEmpleado() {
		setLayout(null);
		
		JLabel lblAgregarEmpleado = new JLabel("Agregar Empleado");
		lblAgregarEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAgregarEmpleado.setBounds(43, 70, 139, 43);
		add(lblAgregarEmpleado);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(58, 164, 105, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(191, 161, 214, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblRut = new JLabel("Rut: ");
		lblRut.setBounds(58, 220, 105, 14);
		add(lblRut);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 217, 214, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(43, 403, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(505, 403, 90, 35);
		add(btnSalir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAceptar.setBounds(505, 349, 90, 35);
		add(btnAceptar);
		
		JLabel lblDasATrabajar = new JLabel("D\u00EDas a trabajar: ");
		lblDasATrabajar.setBounds(58, 290, 109, 14);
		add(lblDasATrabajar);
		
		textField_3 = new JTextField();
		textField_3.setBounds(191, 287, 181, 20);
		add(textField_3);
		textField_3.setColumns(10);

	}
	/**
	 * @return the btnAtrs
	 */
	public JButton getBtnAtrs() {
		return btnAtrs;
	}
}
