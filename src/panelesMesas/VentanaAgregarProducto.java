package panelesMesas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAgregarProducto extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	private JButton btnAtrs;
	
	
	public VentanaAgregarProducto() {
		setLayout(null);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProducto.setBounds(55, 58, 93, 14);
		add(lblProducto);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(55, 118, 93, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(178, 115, 262, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(55, 174, 93, 14);
		add(lblPrecio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(178, 171, 262, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(55, 240, 93, 14);
		add(lblId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(178, 237, 262, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtrs.setBounds(55, 384, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(490, 390, 90, 35);
		add(btnSalir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(490, 329, 90, 35);
		add(btnAceptar);

	}
	/**
	 * @return the btnAtrs
	 */
	public JButton getBtnAtrs() {
		return btnAtrs;
	}
	
	
	
	
}
