package clases;
import java.util.*;

public class PedidosTotales {
    private ArrayList<PedidoMesa> pedidosListos;
    
    
    public PedidosTotales() {
   	 pedidosListos = new ArrayList <PedidoMesa>();
    }
    
    public void agregarPedidoListo(PedidoMesa pedidoAgregar) {
   	 pedidosListos.add(pedidoAgregar);
    }
}
