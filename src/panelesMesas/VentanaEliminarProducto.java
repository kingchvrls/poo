package panelesMesas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEliminarProducto extends JPanel {
	private JTextField textField;
	
	private JButton btnAtrs;
	/**
	 * Create the panel.
	 */
	public VentanaEliminarProducto() {
		setLayout(null);
		
		JLabel lblEliminarProducto = new JLabel("Eliminar producto");
		lblEliminarProducto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEliminarProducto.setBounds(70, 61, 160, 14);
		add(lblEliminarProducto);
		
		JLabel lblIngreseId = new JLabel("Ingrese ID:");
		lblIngreseId.setBounds(70, 135, 93, 14);
		add(lblIngreseId);
		
		textField = new JTextField();
		textField.setBounds(173, 132, 240, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(272, 231, 90, 35);
		add(btnAceptar);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(70, 383, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(485, 383, 90, 35);
		add(btnSalir);

	}
	public JButton getBtnAtrs() {
		return btnAtrs;
	}

}
