package clases;
public class Producto {
	private String nombre;
	private int id;
	private int precio;
	private boolean comerciable;
    
	public Producto(int id,String nombre,int precio,boolean comer) {
    	this.id=id;
    	this.nombre=nombre;
    	this.precio=precio;
    	comerciable=comer;
	}
    
	public Producto() {
    	id=-1;
    	nombre=null;
    	precio=0;
    	comerciable=false;
	}
    
	public void setIdProducto(int id) {
    	this.id=id;
	}
    
	public int getIdProducto() {
    	return id;
	}
    
	public void setNombreProducto(String nombre) {
    	this.nombre=nombre;
	}
    
	public String getNombreProducto() {
    	return nombre;
	}
    
	public void setPrecioProducto(int precio) {
    	this.precio=precio;
	}
    
	public int getPrecioProducto() {
    	return precio;
	}
    
	public void setComerciableProducto(boolean comerciable) {
    	this.comerciable=comerciable;
	}
    
	public boolean getComerciableProducto(){
    	return comerciable;
	}

    
}

