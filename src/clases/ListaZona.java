package clases;
import java.util.*;
public class ListaZona {
	private ArrayList<Zona> zonas;
	
	public ListaZona() {
		zonas= new ArrayList<Zona>();
	}
	
	public int sizeZonas() {
		int i,cont=0;
		for(i=0;i<zonas.size();i++) {
			if(zonas.get(i)!=null) {
				cont++;
			}
		}
		return cont;
	}
	//agregar zona a la lista zonas(lista de zonas :v)
	public boolean addZona(Zona z) {
		if(zonas.isEmpty()==true) {
			zonas.add(z);
			return true;
		}
		else {
			if(zonas.contains(z)==false) {
				zonas.add(z);
				return true;
			}
		}
		return false;
	}
	//remover una zona(si es necesario en algun momento) ingresando el objeto (zona) para buscarlo
	public boolean deleteZona(Zona z) {
		if(zonas.contains(z)==true) {
			zonas.remove(z);
			return true;
		}
		return false;
	}
	
	public boolean deleteZona(int id) {
		for(int i=0;i<zonas.size();i++) {
			if(zonas.get(i).getId()==id) {
				zonas.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public Zona getZona(int id) {
		for(int i=0;i<zonas.size();i++) {
			if(zonas.get(i).getId()==id){
				return zonas.get(i);
			}
		}
		return null;
	}
	
	public String getNombreZona(int id) {
		for(int i=0;i<zonas.size();i++) {
			if(zonas.get(i).getId()==id) {
				return zonas.get(i).getNombre();
			}
		}
		return null;
	}
	
	public int getIdZona(int id) {
		for(int i=0;i<zonas.size();i++) {
			if(zonas.get(i).getId()==id) {
				return zonas.get(i).getId();
			}
		}
		return -1;
	}
	
	public boolean setNombreZona(String nombre,int id) {
		for(int i=0;i<zonas.size();i++) {
			if(zonas.get(i).getId()==id) {
				zonas.get(i).setNombre(nombre);
				return true;
			}
		}
		return false;
	}
	
	public boolean addMesa(Mesa m) {
		for(int i=0;i<zonas.size();i++) {
			for(int j=0;j<zonas.get(i).sizeMesas();j++) {
				if(zonas.get(i)!=null) {
					if(zonas.get(i).getIdMesa(j)==m.getId() || m.getId()==-1) {
						m.setId(zonas.get(i).sizeMesas()+1);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean deleteMesa(int id) {
		for(int i=0;i<zonas.size();i++) {
			for(int j=0;j<zonas.get(i).sizeMesas();j++) {
				if(zonas.get(i).getIdMesa(j)==id){
					zonas.get(i).deleteMesa(j);
					return true;
				}
			}
		}
		return false;
	}
	public Mesa getMesa(int id) {
		for(int i=0;i<zonas.size();i++) {
			for(int j=0;j<zonas.get(i).sizeMesas();j++) {
				if(zonas.get(i).getIdMesa(j)==id){
					return zonas.get(i).getMesa(j);
				}
			}
		}
		return null;
	}
	
	public int getIdMesa(int id) {
		for(int i=0;i<zonas.size();i++) {
			for(int j=0;j<zonas.get(i).sizeMesas();j++) {
				if(zonas.get(i).getIdMesa(j)==id){
					return zonas.get(i).getIdMesa(j);
					
				}
			}
		}
		return -1;
	}
	
	public boolean setEstadoMesa(boolean estado,int id) {
		for(int i=0;i<zonas.size();i++) {
			for(int j=0;j<zonas.get(i).sizeMesas();j++) {
				if(zonas.get(i).getIdMesa(j)==id){
					zonas.get(i).setEstadoMesa(estado,j);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean getEstadoMesa(int id) {
		for(int i=0;i<zonas.size();i++) {
			for(int j=0;j<zonas.get(i).sizeMesas();j++) {
				if(zonas.get(i).getIdMesa(j)==id){
					zonas.get(i).getEstadoMesa(j);
					return true;
				}
			}
		}
		return false;
	}
}

