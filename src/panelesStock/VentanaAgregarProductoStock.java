package panelesStock;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAgregarProductoStock extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	private JButton btnAtrs;
	/**
	 * Create the panel.
	 */
	
	public VentanaAgregarProductoStock() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(51, 133, 46, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(107, 130, 224, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(51, 173, 46, 14);
		add(lblPrecio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 170, 224, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(51, 210, 46, 14);
		add(lblId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(107, 207, 224, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAgregarAStock = new JLabel("Agregar a Stock");
		lblAgregarAStock.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAgregarAStock.setBounds(51, 65, 162, 25);
		add(lblAgregarAStock);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(51, 389, 90, 35);
		add(btnAtrs);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(490, 343, 90, 35);
		add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(490, 389, 90, 35);
		add(btnSalir);

	}
	public JButton getBtnAtrs() {
		return btnAtrs;
	}

}
