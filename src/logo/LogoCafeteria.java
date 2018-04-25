package logo;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class LogoCafeteria extends JPanel {
	
	
	private ImageIcon imagen;
	private String nombre;
	/**
	 * Create the panel.
	 */
	public LogoCafeteria(String nombre) {
		this.nombre=nombre;
	}
	
	public void paint(Graphics g) {
		Dimension tam = getSize();
		imagen = new ImageIcon(getClass().getResource(nombre));
		g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
		setOpaque(false);
		super.paint(g);
		
	}
	
}
