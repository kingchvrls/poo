package clases;

public class Cafeteria {
	private ListaZona listaZonas ;
	private ListaAlmacen listaAlmacenes;
	private ListaEmpleado listaEmpleados;
	private ListaPedidosTotales listaPedidosTotales;
	private String nombre;
	private int contadorId;
	private int contadorPedido;
	
	public Cafeteria() {
		nombre="CafeCafe";
		contadorId=0;
		contadorPedido=0;
		listaZonas= new ListaZona();
		listaAlmacenes= new ListaAlmacen();
		listaEmpleados= new ListaEmpleado();
		listaPedidosTotales= new ListaPedidosTotales();
	}
	
	public ListaZona getListaZonas() {
		return listaZonas;
	}
	
	public void setListaZonas(ListaZona listaZonas) {
		this.listaZonas = listaZonas;
	}
	
	public ListaAlmacen getListaAlmacenes() {
		return listaAlmacenes;
	}
	
	public void setListaAlmacenes(ListaAlmacen listaAlmacenes) {
		this.listaAlmacenes = listaAlmacenes;
	}
	
	public ListaEmpleado getListaEmpleados() {
		return listaEmpleados;
	}
	
	public void setListaEmpleados(ListaEmpleado listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	public ListaPedidosTotales getListaPedidosTotales() {
		return listaPedidosTotales;
	}
	
	public void setListaPedidosTotales(ListaPedidosTotales listaPedidosTotales) {
		this.listaPedidosTotales = listaPedidosTotales;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getContadorId() {
		return contadorId;
	}
	
	public void setContadorId(int contadorId) {
		this.contadorId = contadorId;
	}
	
	public int getContadorPedido() {
		return contadorPedido;
	}
	
	public void setContadorPedido(int contadorPedido) {
		this.contadorPedido = contadorPedido;
	}
	
	public boolean addZona(Zona z) {	
		if(listaZonas.getZona(z.getId())==null) {
			listaZonas.addZona(z);
			return true;
		}
		return false;
	}
	
	public boolean deleteZona(Zona z) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			if(listaZonas.getZona(i)==z) {
				listaZonas.deleteZona(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteZona(int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			if(listaZonas.getZona(i).getId()==id) {
				listaZonas.deleteZona(i);
				return true;
			}
		}
		return false;
	}
	
	public Zona getZona(int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			if(listaZonas.getZona(i).getId()==id) {
				return listaZonas.getZona(i);
			}
		}
		return null;
	}
	
	public String getNombreZona(int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			if(listaZonas.getZona(i).getId()==id) {
				return listaZonas.getZona(i).getNombre();
			}
		}
		return null;
	}
	
	public int getIdZona(int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			if(listaZonas.getZona(i).getId()==id) {
				return listaZonas.getZona(i).getId();
			}
		}
		return -1;
	}
	
	public Boolean setNombreZona(String nombre,int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			if(listaZonas.getZona(i).getId()==id) {
				listaZonas.getZona(i).setNombre(nombre);;
			}
		}
		return false;
	}
	
	public boolean addMesa(Mesa m) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			for(int j=0;j<listaZonas.getZona(i).sizeMesas();j++) {
				if(listaZonas.getZona(i).getIdMesa(j)==m.getId()) {
					listaZonas.addMesa(m);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean deleteMesa(int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			for(int j=0;j<listaZonas.getZona(i).sizeMesas();j++) {
				if(listaZonas.getZona(i).getIdMesa(j)==id) {
					listaZonas.deleteMesa(i);
					return true;
				}
			}
		}
		return false;
	}
	
	public Mesa getMesa(int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			for(int j=0;j<listaZonas.getZona(i).sizeMesas();j++) {
				if(listaZonas.getZona(i).getIdMesa(j)==id) {
					listaZonas.getMesa(i);
				}
			}
		}
		return null;
	}
	
	public int getIdMesa(int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			for(int j=0;j<listaZonas.getZona(i).sizeMesas();j++) {
				if(listaZonas.getZona(i).getIdMesa(j)==id) {
					return listaZonas.getMesa(j).getId();
				}
			}
		}
		return -1;
	}
	
	public boolean setEstadoMesa(boolean estado,int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			for(int j=0;j<listaZonas.getZona(i).sizeMesas();j++) {
				if(listaZonas.getZona(i).getIdMesa(j)==id) {
					listaZonas.getMesa(j).setEstado(estado);;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean getEstadoMesa(int id) {
		for(int i=0;i<listaZonas.sizeZonas();i++) {
			for(int j=0;j<listaZonas.getZona(i).sizeMesas();j++) {
				if(listaZonas.getZona(i).getIdMesa(j)==id) {
					listaZonas.getMesa(j).getEstado();
				}
			}
		}
		return false;
	}
	
	
	
	//metodos Almacenes
	
	public boolean addAlmacen(Almacen a) {
		if(listaAlmacenes.getAlmacen(a.getId())==null) {
			listaAlmacenes.addAlmacen(a);
			return true;
		}
		return false;
	}
	public boolean deleteAlmacen(Almacen a) {
		if(listaAlmacenes.getAlmacen(a.getId())!=null){
			listaAlmacenes.deleteAlmacen(a);
		}
		return false;
	}
	
	public boolean deleteAlmacen(int id) {
		if(listaAlmacenes.getAlmacen(id).getId()==id){
			listaAlmacenes.deleteAlmacen(id);
		}
		return false;
	}
	
	public Almacen getAlmacen(int id) {
		if(listaAlmacenes.getAlmacen(id).getId()==id) {
			return listaAlmacenes.getAlmacen(id);
		}
		return null;
	}
	
	public String getNombreAlmacen(int id) {
		if(listaAlmacenes.getAlmacen(id).getId()==id) {
			return listaAlmacenes.getAlmacen(id).getNombre();
		}
		return null;
	}
	
	public int getIdAlmacen(int id) {
		if(listaAlmacenes.getAlmacen(id).getId()==id) {
			return listaAlmacenes.getAlmacen(id).getId();
		}
		return -1;
	}
	
	public int getCantidadAlmacenes(){
		if(listaAlmacenes!=null) {
			return listaAlmacenes.getCantidadAlmacenes();
		}
		return 0;
	}
	
	public boolean setNombreAlmacen(String nombre,int id) {
		if(listaAlmacenes.getAlmacen(id).getId()==id) {
			listaAlmacenes.getAlmacen(id).setNombre(nombre);;
			return true;
		}
		return false;
	}
	
	public boolean addProducto(Producto productoAgregar) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==productoAgregar.getIdProducto()) {
					listaAlmacenes.addProducto(productoAgregar);
					return true;
				}
			}
		}
		return false;
	}

	public boolean deleteProducto(int id) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==id) {
					listaAlmacenes.deleteProducto(id);
					return true;
				}
			}
		}
		return false;
	}

	
	public Producto getPRoducto(int id) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==id) {
					return listaAlmacenes.getProducto(id);
				}
			}
		}
		return null;
	}
	
	public int getIdProducto(int id) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==id) {
					return listaAlmacenes.getAlmacen(i).getIdProducto(j);
				}
			}
		}
		return -1;
	}
	
	public String getNombreProducto(int id) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==id) {
					return listaAlmacenes.getAlmacen(i).getNombreProducto(j);
				}
			}
		}
		return null;	
	}
	
	public int getPrecioProducto(int id) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==id) {
					return listaAlmacenes.getAlmacen(i).getPrecioProducto(j);
				}
			}
		}
		return 0;
	}
	
	public boolean getComerciableProducto(int id) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==id) {
					return listaAlmacenes.getAlmacen(i).getComerciableProducto(j);
				}
			}
		}
		return false;
	}
	
	public boolean setNombreProducto(String nombre, int id) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==id) {
					listaAlmacenes.getAlmacen(i).setNombreProducto(nombre,j);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean setPrecioProducto(int precio,int id) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==id) {
					listaAlmacenes.getAlmacen(i).setPrecioProducto(precio,j);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean setComerciableProducto(boolean comerciable,int id) {
		for(int i=0;i<listaAlmacenes.getCantidadAlmacenes();i++) {
			for(int j=0;j<listaAlmacenes.getAlmacen(i).sizeProductos();j++) {
				if(listaAlmacenes.getAlmacen(i).getIdProducto(j)==id) {
					listaAlmacenes.getAlmacen(i).setComerciableProducto(comerciable,j);
					return true;
				}
			}
		}
		return false;
	}
	
	//metodos Empleados
	public boolean addEmpleado(Empleado e) {
		if(listaEmpleados.getEmpleado(e.getRut())==null) {
			listaEmpleados.addEmpleado(e);
			return true;
		}
		return false;
	}
	
	public boolean deleteEmpleado(String rut) {
		for(int i=0;i<listaEmpleados.size();i++) {
			if(listaEmpleados.getEmpleado(rut).getRut()==rut) {
				listaEmpleados.deleteEmpleado(rut);
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public String getNombreEmpleado(String rut) {
		if(listaEmpleados.getEmpleado(rut).getRut()==rut) {
			return listaEmpleados.getEmpleado(rut).getNombre();
		}
		return null;
	}
	
	public String getRutEmpleado(String rut) {
		if(listaEmpleados.getEmpleado(rut).getRut()==rut) {
			return listaEmpleados.getEmpleado(rut).getRut();
		}
		return null;
	}
	
	public String getPasswordEmpleado(String rut) {
		if(listaEmpleados.getEmpleado(rut).getRut()==rut) {
			return listaEmpleados.getEmpleado(rut).getPassword();
		}
		return null;
	}
	
	public int getDiasTrabajadosEmpleado(String rut) {
		if(listaEmpleados.getEmpleado(rut).getRut()==rut) {
			return listaEmpleados.getEmpleado(rut).getDiasTrabajados();
		}
		return 0;
	}
	
	public int getCantidadEmpleados(){
		if(listaEmpleados!=null) {
			return listaEmpleados.getCantidadEmpleados();
		}
		return 0;
	}
	
	public boolean setNombreEmpleado(String nombre,String rut) {
		if(listaEmpleados.getEmpleado(rut).getRut()==rut) {
			listaEmpleados.getEmpleado(rut).setNombre(nombre);
			return true;
		}
		return false;
	}
	
	public boolean setPasswordEmpleado(String password,String rut) {
		if(listaEmpleados.getEmpleado(rut).getRut()==rut) {
			listaEmpleados.getEmpleado(rut).setPassword(password);
			return true;
		}
		return false;
	}

}


