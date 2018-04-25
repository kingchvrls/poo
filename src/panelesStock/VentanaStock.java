package panelesStock;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaStock extends JPanel {

	
	private JButton btnAtrs;
	private JButton btnAgregarProductoStock;
	/**
	 * Create the panel.
	 */
	public VentanaStock() {
		setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(581, 208, 17, 135);
		add(scrollBar);
		
		btnAgregarProductoStock = new JButton("Agregar Producto");
		btnAgregarProductoStock.setBounds(243, 102, 147, 40);
		add(btnAgregarProductoStock);
		
		JList list = new JList();
		list.setBounds(51, 208, 540, 135);
		add(list);
		
		JLabel lblProductos = new JLabel("Productos");
		lblProductos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProductos.setBounds(51, 177, 77, 14);
		add(lblProductos);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(51, 394, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(501, 394, 90, 35);
		add(btnSalir);

	}
	
	public JButton getBtnAtrs() {
		return btnAtrs;
	}

	public JButton getBtnAgregarProductoStock() {
		return btnAgregarProductoStock;
	}
	
	
	
}
