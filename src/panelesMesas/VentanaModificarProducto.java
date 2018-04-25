package panelesMesas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaModificarProducto extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	
	private JButton btnAtrs;

	/**
	 * Create the panel.
	 */
	public VentanaModificarProducto() {
		setLayout(null);
		
		JLabel lblModificarProducto = new JLabel("Modificar producto");
		lblModificarProducto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblModificarProducto.setBounds(55, 61, 191, 14);
		add(lblModificarProducto);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(55, 124, 72, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(137, 121, 261, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(55, 168, 72, 14);
		add(lblPrecio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 165, 261, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(55, 393, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(493, 393, 90, 35);
		add(btnSalir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(494, 341, 90, 35);
		add(btnAceptar);

	}

	public JButton getBtnAtrs() {
		return btnAtrs;
	}

}
