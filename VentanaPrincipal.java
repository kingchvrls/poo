package ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import panelesMesas.VentanaMesas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class VentanaPrincipal extends JFrame{

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	
	private Ventanamesas panelMesas;
	private VentanaOpciones ventanaOpciones;
	
	public VentanaPrincipal() 
	{
		inicializar();		
	}
	
	private void inicializar() {
		
		panelMesas = new VentanaMesas();
		
		setTitle("Café?Café!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMesas = new JButton("Mesas");
		btnMesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				contentPane.setVisible(false);
				setLayout(new BorderLayout());
				add(panelMesas);
			}
		});
		btnMesas.setBounds(54, 223, 130, 63);
		contentPane.add(btnMesas);
		
		JButton btnStock = new JButton("Stock");
		btnStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnStock.setBounds(252, 223, 130, 63);
		contentPane.add(btnStock);
		
		JButton btnEmpleados = new JButton("Empleados");
		btnEmpleados.setBounds(447, 223, 130, 63);
		contentPane.add(btnEmpleados);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(487, 387, 89, 23);
		contentPane.add(btnSalir);
	}
}
