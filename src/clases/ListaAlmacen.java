package clases;
import java.util.*;
public class ListaAlmacen {
	private ArrayList<Almacen> almacenes;
	private int cantidadAlmacenes;
    
	public ListaAlmacen() {
    	setCantidadAlmacenes('0');
    	almacenes= new ArrayList<Almacen>();
	}
    
	public boolean addAlmacen(Almacen a) {
    	if(almacenes.isEmpty()==true) {
        	almacenes.add(a);
        	setCantidadAlmacenes(getCantidadAlmacenes() + 1);
        	return true;
    	}
    	else {
        	if(almacenes.contains(a)==false) {
            	almacenes.add(a);
            	setCantidadAlmacenes(getCantidadAlmacenes() + 1);
            	return true;
        	}
    	}
    	return false;
	}
	//eliminar almacen si se encuentra el objeto almacen entero ijiijji(en alpja, no se si dejar esto o el otro)
	public boolean deleteAlmacen(Almacen a) {
    	if(almacenes.contains(a)==true) {
        	almacenes.remove(a);
        	setCantidadAlmacenes(getCantidadAlmacenes() - 1);
        	return true;
    	}
    	return false;
	}
	//eliminar almacen entregada su id
	public boolean deleteAlmacen(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	if(almacenes.get(i).getId()==id) {
            	almacenes.remove(i);
            	setCantidadAlmacenes(getCantidadAlmacenes() - 1);
            	return true;
        	}
    	}
    	return false;
	}
    
	public Almacen getAlmacen(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	if(almacenes.get(i).getId()==id) {
            	return almacenes.get(i);
        	}
    	}
    	return null;
	}

	public String getNombreAlmacen(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	if(almacenes.get(i).getId()==id) {
            	return almacenes.get(i).getNombre();
        	}
    	}
    	return null;
	}
    
	public int getIdAlmacen(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	if(almacenes.get(i).getId()==id) {
            	return almacenes.get(i).getId();
        	}
    	}
    	return -1;
	}
    
	public int getCantidadAlmacenes() {
    	return cantidadAlmacenes;
	}

	public boolean setNombreAlmacen(String nombre,int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	if(almacenes.get(i).getId()==id) {
            	almacenes.get(i).setNombre(nombre);
        	}
    	}
    	return false;
	}
    
	public void setCantidadAlmacenes(int cantidadAlmacenes) {
    	this.cantidadAlmacenes = cantidadAlmacenes;
	}

	public boolean addProducto(Producto p) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i)!=null) {    
                	if(almacenes.get(i).getNombreProducto(j)==p.getNombreProducto()) {
                    	return false;
                	}
            	}
        	}
    	}
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==p.getIdProducto() || p.getIdProducto()==-1) {
                	p.setIdProducto(almacenes.get(i).sizeProductos()+1);;
                	almacenes.get(i).addProducto(p);
                	return true;
            	}
        	}
    	}
    	return false;
	}
    
	public boolean deleteProducto(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==id){
                	almacenes.get(i).deleteProducto(j);
            	}
        	}
    	}
    	return false;
	}
    
	public Producto getProducto(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==id){
                	almacenes.get(i).getProducto(j);
            	}
        	}
    	}
    	return null;
	}
    
	public int getidProducto(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==id){
                	return almacenes.get(i).getIdProducto(j);
            	}
        	}
    	}
    	return -1;
	}
    
	public boolean setNombreProducto(String nombre,int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==id){
                	almacenes.get(i).setNombreProducto(nombre, j);
                	return true;
            	}
        	}
    	}
    	return false;
	}
    
	public boolean setPrecioProducto(int precio,int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==id){
                	almacenes.get(i).setPrecioProducto(precio, id);
                	return true;
            	}
        	}
    	}
    	return false;
	}
    
	public boolean setComerciableProducto(boolean comerciable,int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==id){
                	almacenes.get(i).setComerciableProducto(comerciable,j);
            	}
        	}
    	}
    	return false;
	}
    
	public String getNombreProducto(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==id){
                	almacenes.get(i).deleteProducto(j);
            	}
        	}
    	}
    	return null;
	}
    
	public int getPrecioProducto(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==id){
                	return almacenes.get(i).getPrecioProducto(j);
            	}
        	}
    	}
    	return 0;
	}
    
	public boolean getComerciableProducto(int id) {
    	for(int i=0;i<almacenes.size();i++) {
        	for(int j=0;j<almacenes.get(i).sizeProductos();j++) {
            	if(almacenes.get(i).getIdProducto(j)==id){
                	return almacenes.get(i).getComerciableProducto(j);
            	}
        	}
    	}
    	return false;
	}
}

