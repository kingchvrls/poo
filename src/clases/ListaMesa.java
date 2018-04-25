package clases;
import java.util.*;

public class ListaMesa {
	private ArrayList<Mesa> mesas;
	
	public ListaMesa() {
		mesas= new ArrayList<Mesa>();
	}
	
	
	public boolean addMesa(Mesa m) {
    	int i;
    	for(i=0;i<mesas.size();i++) {
    		if(m.getId()==mesas.get(i).getId()||m.getId()==-1) {
    			m.setId(mesas.size()+1);
    		}
    	}
    	mesas.add(m);
    	return true;
    }
	
	public boolean deleteMesa(int id) {
		for(int i=0;i<mesas.size();i++) {
			if(mesas.get(i).getId()==id) {
				mesas.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public Mesa getMesa(int id) {
		for(int i=0;i<mesas.size();i++) {
			if(mesas.get(i).getId()==id) {
				return mesas.get(i);
			}
		}
		return null;
	}
	
	public boolean setEstadoMesa(boolean estado,int id) {
		for(int i=0;i<mesas.size();i++) {
			if(mesas.get(i).getId()==id) {
				mesas.get(i).setEstado(estado);
				return true;
			}
		}
		return false;
	}
	
	public int getIdMesa(int id) {
		for(int i=0;i<mesas.size();i++) {
			if(mesas.get(i).getId()==id) {
				return mesas.get(i).getId();
			}
		}
		return -1;
	}
	public boolean getEstadoMesa(int id) {
		for(int i=0;i<mesas.size();i++) {
			if(mesas.get(i).getId()==id) {
				return mesas.get(i).getEstado();
			}
		}
		return false;
	}
	
	public int sizeMesas() {
		int cont=0;
		for(int i=0;i<mesas.size();i++) {
			if(mesas.get(i)!=null) {
				cont++;
			}
		}
		return cont;
	}
	
	
}

