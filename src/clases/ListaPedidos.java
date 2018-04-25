package clases;
import java.util.*;


public class ListaPedidos {
	private int cantidadPedidos;
    private ArrayList <Producto> listaPedidos;
    
    public ListaPedidos() {
    	cantidadPedidos=0;
    	listaPedidos = new ArrayList<Producto>();
    }
    
    public void agregarProductoPedido(Producto productoNuevo) {
   		 listaPedidos.add(productoNuevo);
   		setCantidadPedidos(getCantidadPedidos()+1);
    }
    
    public void eliminarProductoPedido(int idProducto,Producto productoRemover) {
   	 int i;
   	 for(i=0;i<listaPedidos.size();i++) {
   		 if(cantidadPedidos>0) {
   			 if((listaPedidos.get(i)).getIdProducto()==idProducto) {
   				 listaPedidos.remove(productoRemover);
   				 setCantidadPedidos(getCantidadPedidos()-1);
   			 }
   		 }
   	 }
    }
    
    public void eliminarTodoProductoPedido(int cantidadPedidos) {
    	while(getCantidadPedidos()>0) {
    		listaPedidos.remove(getCantidadPedidos());
    		setCantidadPedidos(getCantidadPedidos()-1);
    	}
    }
    
    
    public int getCantidadPedidos() {
		return cantidadPedidos;
	}

	public void setCantidadPedidos(int cantidadPedidos) {
		this.cantidadPedidos = cantidadPedidos;
	}

	public ArrayList<Producto> pedirProductos() {
		ArrayList <Producto> listaProductos;
   		listaProductos = listaPedidos;
   		return listaProductos;
    }

	public ArrayList<Producto> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(ArrayList<Producto> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	

}



