package clases;
import java.util.*;

public class ListaProducto {
	private ArrayList<Producto> productos;
    
	public ListaProducto() {
     	productos= new ArrayList<Producto>();
	}
    
	public Producto getProducto(int id) {
    	for(int i=0;i<productos.size();i++) {
        	if(productos.get(i).getIdProducto()==id) {
            	return productos.get(i);
        	}
    	}
    	return null;
	}
    
	public boolean deleteProducto(int id) {
    	for(int i=0;i<productos.size();i++) {
        	if(productos.get(i).getIdProducto()==id) {
            	productos.remove(i);
            	return true;
        	}
    	}
   	 
    	return false;
	}
    
	public int sizeProductos() {
    	int i,cont=0;
    	for(i=0;i<productos.size();i++) {
        	if(productos.get(i)!=null) {
            	cont++;
        	}
    	}
    	return cont;
	}


	public boolean setNombreProducto(String nombre,int id) {
    	int i;
    	for(i=0;i<productos.size();i++) {
        	if(productos.get(i).getIdProducto()==id) {
            	productos.get(i).setNombreProducto(nombre);
            	return true;
        	}
    	}
    	return false;
	}
    
	public boolean setPrecioProducto(int precio,int id) {
    	int i;
    	for(i=0;i<productos.size();i++) {
        	if(productos.get(i).getIdProducto()==id) {
            	productos.get(i).setPrecioProducto(precio);
            	return true;
        	}
    	}
    	return false;
	}
    
	public boolean setComerciableProducto(boolean comerciable,int id) {
    	int i;
    	for(i=0;i<productos.size();i++) {
        	if(productos.get(i).getIdProducto()==id) {
            	productos.get(i).setComerciableProducto(comerciable);
                   	return true;
                	}
       	}
       	return false;
	}

	public String getNombreProducto(int id) {
    	int i;
       	for(i=0;i<productos.size();i++) {
           	if(productos.get(i).getIdProducto()==id) {
               	return productos.get(i).getNombreProducto();
           	}
       	}
       	return null;
	}
    
	public int getPrecioProducto(int id) {
    	int i;
    	for(i=0;i<productos.size();i++) {
        	if(productos.get(i).getIdProducto()==id) {
            	return productos.get(i).getPrecioProducto();
        	}
    	}
    	return -1;
	}
    
	public boolean getComerciableProducto(int id) {
    	int i;
    	for(i=0;i<productos.size();i++) {
        	if(productos.get(i).getIdProducto()==id) {
            	return productos.get(i).getComerciableProducto();
        	}
    	}
    	return false;
	}
    
	public int getIdProducto(int id) {
    	for(int i=0;i<productos.size();i++) {
        	if(productos.get(i).getIdProducto()==id) {
            	return productos.get(i).getIdProducto();
        	}
    	}
    	return 0;
	}
	public boolean addProducto(Producto p) {
    	int i;
    	for(i=0;i<productos.size();i++) {
        	if(p.getNombreProducto()==productos.get(i).getNombreProducto()) {
            	return false;
        	}
    	}
    	for(i=0;i<productos.size();i++) {
        	if(p.getIdProducto()==productos.get(i).getIdProducto()||p.getIdProducto()==-1) {
            	p.setIdProducto(productos.size()+1);
        	}
    	}
    	productos.add(p);
    	return true;
	}
}





