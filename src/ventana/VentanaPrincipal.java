package ventana;

import javax.swing.JButton;
import logo.LogoCafeteria;

import javax.swing.JPanel;

import logo.*;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import logo.LogoCafeteria;

public class VentanaPrincipal extends JPanel {

	/**
	 * Esta es la ventana Principal del Programa, en donde se inicializa junto a los botones principales
	 */
	private JButton btnMesas;
	private JButton btnStock;
	private JButton btnEmpleados;
	private JButton btnSalir;
	
	public VentanaPrincipal() {
		inicializar();
	}
	
	public void inicializar() {
		
		setLayout(null);
				
		btnMesas = new JButton("Mesas");
		btnMesas.setBounds(54, 223, 130, 63);
		add(btnMesas);
		
		btnStock = new JButton("Stock");
		btnStock.setBounds(252, 223, 130, 63);
		add(btnStock);
		
		btnEmpleados = new JButton("Empleados");
		btnEmpleados.setBounds(447, 223, 130, 63);
		add(btnEmpleados);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(487, 387, 89, 23);
		add(btnSalir);
		
	}

	public JButton getBtnMesas() {
		return btnMesas;
	}

	public JButton getBtnStock() {
		return btnStock;
	}

	public JButton getBtnEmpleados() {
		return btnEmpleados;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnMesas(JButton btnMesas) {
		this.btnMesas = btnMesas;
	}

	public void setBtnStock(JButton btnStock) {
		this.btnStock = btnStock;
	}

	public void setBtnEmpleados(JButton btnEmpleados) {
		this.btnEmpleados = btnEmpleados;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
}
