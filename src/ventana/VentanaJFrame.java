package ventana;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import logo.LogoCafeteria;
import panelesEmpleados.VentanaAgregarEmpleado;
import panelesEmpleados.VentanaEmpleados;
import panelesMesas.VentanaAgregarProducto;
import panelesMesas.VentanaEliminarProducto;
import panelesMesas.VentanaPagar;
import panelesMesas.VentanaMesas;
import panelesMesas.VentanaOpciones;
import panelesMesas.VentanaModificarProducto;
import panelesStock.VentanaStock;
import panelesStock.VentanaAgregarProductoStock;
import panelesEmpleados.*;







/**
 * Esta es la ventana que llama a todos los paneles de la interfaz y los hace visibles,
 * además de accionar cada uno de los eventos que compone cada panel (menos los salir).
 * 
 * 
 *  
 * 
 * Dimensiona la ventana principal y el logo dentro de ella.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author Benjamin Herrera
 * 
 */



public class VentanaJFrame extends JFrame{
	
	
	private static final long serialVersionUID = 1L;

	private VentanaMesas ventanaMesas;
	private VentanaOpciones ventanaOpciones;
	private VentanaAgregarProducto ventanaAgregarProducto;
	private VentanaModificarProducto ventanaModificarProducto;
	private VentanaEliminarProducto ventanaEliminarProducto;
	private VentanaPagar ventanaPagar;
	
	private VentanaStock ventanaStock;
	private VentanaAgregarProductoStock ventanaAgregarProductoStock;
	
	private VentanaEmpleados ventanaEmpleados;
	private VentanaAgregarEmpleado ventanaAgregarEmpleado;
	private VentanaEliminarEmpleado ventanaEliminarEmpleado;
	private VentanaVerEmpleados ventanaVerEmpleados;
	
	
	public VentanaJFrame() 
	{
		inicializar();	
	}
	
	private void inicializar() 
	{
		
		ventanaMesas = new VentanaMesas();
		ventanaOpciones = new VentanaOpciones();
		ventanaAgregarProducto = new VentanaAgregarProducto();
		ventanaModificarProducto = new VentanaModificarProducto();
		ventanaEliminarProducto = new VentanaEliminarProducto();
		ventanaPagar = new VentanaPagar();
		
		ventanaStock = new VentanaStock();
		ventanaAgregarProductoStock = new VentanaAgregarProductoStock();
		
		ventanaEmpleados = new VentanaEmpleados();
		ventanaAgregarEmpleado = new VentanaAgregarEmpleado();
		ventanaEliminarEmpleado = new VentanaEliminarEmpleado();
		ventanaVerEmpleados = new VentanaVerEmpleados();
		
		
		VentanaPrincipal panelPrincipal = new VentanaPrincipal();
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(panelPrincipal);
		panelPrincipal.setVisible(true);
		
		setTitle("Café?Café!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		LogoCafeteria logoCafeteria = new LogoCafeteria("/logo/logoC.png");
		logoCafeteria.setSize(250,250);
		logoCafeteria.setLocation(190, 0);
		logoCafeteria.setVisible(true);
		panelPrincipal.add(logoCafeteria);
		
		
		
		/**
		 * 
		 * En esta sección se accionarán los eventos de los botones correspondientes a panelesMesa
		 * y a sus paneles siguientes
		 * 
		 * 
		 * 
		 */
		panelPrincipal.getBtnMesas().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(false);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaMesas);
				ventanaMesas.setVisible(true);
				
			}
		});
		ventanaOpciones.getBtnAtrs().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaOpciones.setVisible(false);
				ventanaMesas.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaMesas);			
			}
		});
		
		ventanaOpciones.getBtnAgregar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaOpciones.setVisible(false);
				ventanaAgregarProducto.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaAgregarProducto);
			}
		});
		
		ventanaAgregarProducto.getBtnAtrs().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaAgregarProducto.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn1().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn2().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn3().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn4().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn5().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn6().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn7().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn8().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn9().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtn10().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ventanaMesas.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
			}
		});
		ventanaMesas.getBtnAtrs().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaMesas.setVisible(false);
				panelPrincipal.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(panelPrincipal);
				
			}
		});
		ventanaOpciones.getBtnModificar().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ventanaOpciones.setVisible(false);
				ventanaModificarProducto.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaModificarProducto);
				
			}
		});
		ventanaModificarProducto.getBtnAtrs().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ventanaModificarProducto.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
				
			}
		});
		ventanaOpciones.getBtnEliminar().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ventanaOpciones.setVisible(false);
				ventanaEliminarProducto.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaEliminarProducto);
				
			}
		});
		
		ventanaOpciones.getBtnPagar().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ventanaOpciones.setVisible(false);
				ventanaPagar.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaPagar);
				
			}
		});
		ventanaPagar.getBtnAtrs().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ventanaPagar.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
				
			}
		});
		ventanaEliminarProducto.getBtnAtrs().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ventanaEliminarProducto.setVisible(false);
				ventanaOpciones.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaOpciones);
				
			}
		});
		
		
		
		
		/** 
		 * 
		 * En esta sección se accionarán los eventos de los botones correspondientes a panelStock
		 * y a sus paneles siguientes
		 * 
		 * 
		 * 
		 */
		
		panelPrincipal.getBtnStock().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(false);
				ventanaStock.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaStock);
			}
		});
		ventanaStock.getBtnAtrs().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaStock.setVisible(false);
				panelPrincipal.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(panelPrincipal);			
			}
		});
		ventanaStock.getBtnAgregarProductoStock().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaStock.setVisible(false);
				ventanaAgregarProductoStock.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaAgregarProductoStock);			
			}
		});
		ventanaAgregarProductoStock.getBtnAtrs().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaAgregarProductoStock.setVisible(false);
				ventanaStock.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaStock);			
			}
		});
		
		
		/**
		 * 
		 * En esta sección se accionarán los eventos de los botones correspondientes a panelEmpleados
		 * y a sus paneles siguientes.
		 *
		 * 
		 * 
		 */
		
		panelPrincipal.getBtnEmpleados().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(false);
				ventanaEmpleados.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaEmpleados);
			}
		});
		
		ventanaEmpleados.getBtnAgregarEmpleado().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaEmpleados.setVisible(false);
				ventanaAgregarEmpleado.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaAgregarEmpleado);			
			}
		});
		ventanaEmpleados.getBtnAtrs().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaEmpleados.setVisible(false);
				panelPrincipal.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(panelPrincipal);			
			}
		});
		ventanaEmpleados.getBtnEliminarEmpleado().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaEmpleados.setVisible(false);
				ventanaEliminarEmpleado.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaEliminarEmpleado);			
			}
		});
		ventanaEliminarEmpleado.getBtnAtrs().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaEliminarEmpleado.setVisible(false);
				ventanaEmpleados.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaEmpleados);			
			}
		});
		ventanaEmpleados.getBtnVerEmpleados().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaEmpleados.setVisible(false);
				ventanaVerEmpleados.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaVerEmpleados);			
			}
		});
		ventanaVerEmpleados.getBtnAtrs().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaVerEmpleados.setVisible(false);
				ventanaEmpleados.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaEmpleados);			
			}
		});
		
		
		
		
		
		
		
		
		
		
		ventanaAgregarEmpleado.getBtnAtrs().addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				ventanaAgregarEmpleado.setVisible(false);
				ventanaEmpleados.setVisible(true);
				getContentPane().setLayout(new BorderLayout());
				setContentPane(ventanaEmpleados);			
			}
		});
	
		
		/** 
		 * 
		 * En esta sección se accionarán los eventos del botón Salir de la ventana principal
		 * 
		 */
		
		panelPrincipal.getBtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
	}
}

