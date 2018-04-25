package clases;
public class Zona {
	private String nombre;
	private int id;
	private ListaMesa listaMesas;
	
	public Zona(String nombre,int id) {
		this.nombre=nombre;
		this.id=id;
		listaMesas= new ListaMesa();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ListaMesa getListaMesas() {
		return listaMesas;
	}

	public void setListaMesas(ListaMesa listaMesas) {
		this.listaMesas = listaMesas;
	}
	
	public int sizeMesas() {
		if(listaMesas!=null) {
			return listaMesas.sizeMesas();
		}
		return 0;
	}	
	public boolean addMesa(Mesa m) {
		for(int i=0;i<listaMesas.sizeMesas();i++) {
			if(listaMesas.getMesa(i).getId()==m.getId()){
				return false;
			}
		}
		listaMesas.addMesa(m);
		return true;
	}
	
	public boolean deleteMesa(int id) {
		for(int i=0;i<listaMesas.sizeMesas();i++) {
			if(listaMesas.getMesa(i).getId()==id) {
				listaMesas.deleteMesa(i);
				return true;
			}
		}
		return false;
	}
	
	public Mesa getMesa(int id) {
		for(int i=0;i<listaMesas.sizeMesas();i++) {
			if(listaMesas.getMesa(i).getId()==id) {
				return listaMesas.getMesa(i);
			}
		}
		return null;
	}
	
	public int getIdMesa(int id) {
		for(int i=0;i<listaMesas.sizeMesas();i++) {
			if(listaMesas.getMesa(i).getId()==id) {
				return listaMesas.getIdMesa(i);
			}
		}
		return -1;
	}
	
	public boolean setEstadoMesa(boolean estado,int id) {
		for(int i=0;i<listaMesas.sizeMesas();i++) {
			if(listaMesas.getMesa(i).getId()==id) {
				listaMesas.setEstadoMesa(estado, id);
				return true;
			}
		}
		return false;
	}
	
	public boolean getEstadoMesa(int id) {
		for(int i=0;i<listaMesas.sizeMesas();i++) {
			if(listaMesas.getMesa(i).getId()==id) {
				return listaMesas.getEstadoMesa(i);
			}
		}
		return false;
	}
}


