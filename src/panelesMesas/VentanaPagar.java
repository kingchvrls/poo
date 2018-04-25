package panelesMesas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPagar extends JPanel {
	private JTable table;
	
	private JButton btnAtrs;
	/**
	 * Create the panel.
	 */
	public VentanaPagar() {
		setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(457, 128, 17, 152);
		add(scrollBar);
		
		JLabel lblPagar = new JLabel("Pagar");
		lblPagar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPagar.setBounds(68, 60, 69, 20);
		add(lblPagar);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(68, 128, 46, 14);
		add(lblTotal);
		
		table = new JTable();
		table.addComponentListener(new ComponentAdapter() {
			
		});
		table.setBounds(149, 128, 325, 152);
		add(table);
		
		JLabel lblPropinaSugerida = new JLabel("Propina sugerida:");
		lblPropinaSugerida.setBounds(68, 320, 133, 14);
		add(lblPropinaSugerida);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(68, 389, 90, 35);
		add(btnAtrs);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(487, 333, 90, 35);
		add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		btnSalir.setBounds(487, 389, 90, 35);
		add(btnSalir);

	}
	public JButton getBtnAtrs() {
		return btnAtrs;
	}
}
