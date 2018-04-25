package panelesMesas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaOpciones extends JPanel {

	
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnPagar;
	private JButton btnAtrs;
	
	public VentanaOpciones() {
		setLayout(null);
		
		btnAgregar = new JButton("Agregar Producto");
		btnAgregar.setBounds(245, 107, 151, 36);
		add(btnAgregar);
		
		btnModificar = new JButton("Modificar Producto");
		btnModificar.setBounds(245, 184, 151, 40);
		add(btnModificar);
		
		btnEliminar = new JButton("Eliminar Producto");
		btnEliminar.setBounds(245, 259, 151, 37);
		add(btnEliminar);
		
		btnPagar = new JButton("Pagar Producto(s)");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPagar.setBounds(245, 328, 151, 37);
		add(btnPagar);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(64, 389, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(495, 389, 90, 35);
		add(btnSalir);

	}
	public JButton getBtnAtrs()
	{
		return btnAtrs;
	}
	
	public JButton getBtnAgregar() {
		return btnAgregar;
	}
	public JButton getBtnModificar() {
		return btnModificar;
	}
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	public JButton getBtnPagar() {
		return btnPagar;
	}
	
	
}
