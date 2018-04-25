package clases;
public class Almacen {
    
	private String nombre;
	private int id;
	private ListaProducto  listaProducto;
    
	public Almacen(String nombre, int id) {
    	this.nombre = nombre;
    	this.id = id;
    	listaProducto= new ListaProducto();   	 
	}
	public Almacen() {
       	nombre = "NULL";
       	id = 0;
       	listaProducto= new ListaProducto();
	}
    
	public String getNombre() {
    	return nombre;
	}
	public int getId() {
    	return id;
	}
    
	public void setNombre(String nombre) {
    	this.nombre = nombre;
	}
	public void setId(int id) {
    	this.id = id;
	}

	public int sizeProductos() {
    	if(listaProducto!=null) {
        	return listaProducto.sizeProductos();
    	}
    	return 0;
	}
 //agrego a ArrayList <Producto> listaProducto un tipo producto
	public boolean addProducto(Producto p) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==p.getIdProducto()) {
            	return false;
        	}
    	}
    	listaProducto.addProducto(p);
    	return true;
   }
   
	public boolean deleteProducto(int id) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==id) {
            	listaProducto.deleteProducto(i);
            	return true;
        	}
    	}
    	return false;
	}



	public Producto getProducto(int id) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==id) {
            	return listaProducto.getProducto(i);
        	}
    	}
    	return null;
	}



	public int getIdProducto(int id) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==id) {
            	return listaProducto.getIdProducto(i);
        	}
    	}
    	return 0;
	}

	public boolean setNombreProducto(String nombre,int id) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==id) {
            	listaProducto.setNombreProducto(nombre, id);
            	return true;
        	}
    	}
    	return false;
	}
    
	public boolean setPrecioProducto(int precio,int id) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==id) {
            	listaProducto.setPrecioProducto(precio, id);
            	return true;
        	}
    	}
    	return false;
	}
    
	public boolean setComerciableProducto(boolean c,int id) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==id) {
            	listaProducto.setComerciableProducto(c, id);
            	return true;
        	}
    	}
    	return false;
	}

	public String getNombreProducto(int id) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==id) {
            	return listaProducto.getNombreProducto(id);
        	}
    	}
    	return null;
	}
    
	public int getPrecioProducto(int id) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==id) {
            	return listaProducto.getPrecioProducto(i);
        	}
    	}
   	 
    	return 0;
	}
    
	public boolean getComerciableProducto(int id) {
    	for(int i=0;i<listaProducto.sizeProductos();i++) {
        	if(listaProducto.getProducto(i).getIdProducto()==id) {
            	return listaProducto.getComerciableProducto(id);
        	}
    	}
    	return false;
	}   
}



