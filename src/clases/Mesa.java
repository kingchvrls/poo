package clases;

public class Mesa {
	private int id;
	private boolean estado;
	private PedidoMesa pedidosMesa;
    
	public Mesa(int id,boolean estado,int contadorPedido) {
    	this.id=id;
    	this.estado=estado;
    	pedidosMesa= new PedidoMesa(contadorPedido);
	}
    
    
	public Mesa(int contadorPedido) {
    	id=-1;
    	estado=false;
    	pedidosMesa= new PedidoMesa(contadorPedido);
	}
	public void setId(int id) {
    	this.id=id;
	}
    
	public void setEstado(boolean estado) {
    	this.estado=estado;
	}

	public void setPedidosMesas(PedidoMesa pedidosMesas) {
    	this.pedidosMesa = pedidosMesas;
	}


	public int getId() {
    	return id;
	}


	public boolean getEstado() {
    	return estado;
	}
    
	public PedidoMesa getPedidosMesa() {
    	return pedidosMesa;
	}
	/*
	public boolean pagarMesa(){//implementar el eliminar
	}
    */
}



