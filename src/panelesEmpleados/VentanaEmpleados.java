package panelesEmpleados;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEmpleados extends JPanel {
	
	private JButton btnAgregarEmpleado;
	private JButton btnEliminarEmpleado;
	private JButton btnVerEmpleados;
	
	private JButton btnAtrs;
	/**
	 * Create the panel.
	 */
	public VentanaEmpleados() {
		setLayout(null);
		
		btnAgregarEmpleado = new JButton("Agregar Empleado");
		btnAgregarEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregarEmpleado.setBounds(225, 72, 180, 70);
		add(btnAgregarEmpleado);
		
		btnEliminarEmpleado = new JButton("Eliminar Empleado");
		btnEliminarEmpleado.setBounds(225, 192, 180, 70);
		add(btnEliminarEmpleado);
		
		btnVerEmpleados = new JButton("Ver Empleados");
		btnVerEmpleados.setBounds(225, 313, 180, 70);
		add(btnVerEmpleados);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtrs.setBounds(45, 391, 90, 35);
		add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(510, 391, 90, 35);
		add(btnSalir);

	}
	public JButton getBtnAtrs() {
		return btnAtrs;
	}
	
	public JButton getBtnAgregarEmpleado() {
		return btnAgregarEmpleado;
	}
	public JButton getBtnEliminarEmpleado() {
		return btnEliminarEmpleado;
	}
	public JButton getBtnVerEmpleados() {
		return btnVerEmpleados;
	}
}
