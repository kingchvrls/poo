package clases;
import java.util.*;
import java.text.*;

public class PedidoMesa{
    SimpleDateFormat bufferFecha;
    int idPedido;
    int total;
   	 
    private Date date;
    private String stringFecha;
    private ListaPedidos listaPedidos;
    
    public PedidoMesa(int contadorPedido) {
   	 idPedido = contadorPedido;
   	 total = -1;
   	 listaPedidos = new ListaPedidos();
   	 
   	 
   	 date = new Date();
   	 bufferFecha = new SimpleDateFormat("dd/MM/YYYY");
   	 stringFecha = bufferFecha.format(date);
    }
    public void setIdPedido(int idPedido) {
   	 this.idPedido = idPedido;
    }
    public void setTotal(int total) {
   	 this.total = total;
    }
    public int getIdPedido() {
   	 return this.idPedido;
    }
    public int getTotal() {
   	 return this.total;
    }
    public String getFecha() {
   	 return this.stringFecha;
    }
    public void agregarPedidoListaPedidos(Producto productoNuevo) {
   	 listaPedidos.agregarProductoPedido(productoNuevo);
    }
    public void eliminarPedidoListaPedidos(int idProducto,Producto productoRemover) {
   	 listaPedidos.eliminarProductoPedido(idProducto, productoRemover);
    }
    /*
    	public ListaPedidos eliminarPedidos(){//implementar eliminar
           	 
    	}
    	*/
}


