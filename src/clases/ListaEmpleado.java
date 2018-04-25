package clases;
import java.util.*;
public class ListaEmpleado {
	private ArrayList <Empleado> empleados;
	private int cantidadEmpleados;
	
	public ListaEmpleado() {
		setCantidadEmpleados('0');
		empleados= new ArrayList<Empleado>();
	}
	
	public boolean addEmpleado(Empleado e) {
		if(empleados.isEmpty()==true) {
			empleados.add(e);
			return true;
		}
		else {
			if(empleados.contains(e)==false) {
				empleados.add(e);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteEmpleado(String rut) {
		for(int i=0;i<empleados.size();i++) {
			if(empleados.get(i).getRut().equals(rut)) {
				empleados.remove(i);
				setCantidadEmpleados(getCantidadEmpleados() - 1);
				return true;
			}
		}
		return false;
	}
	
	public String getRutEmpleado(String rut) {
		for(int i=0;i<empleados.size();i++) {
			if(empleados.get(i).getRut()==rut) {
				return empleados.get(i).getRut();
			}
		}
		return null;
	}
	
	public boolean setNombreEmpleado(String rut,String nombre) {
		for(int i=0;i<empleados.size();i++) {
			if(empleados.get(i).getRut()==rut) {
				empleados.get(i).setNombre(nombre);
				return true;
			}
		}
		return false;
	}
	
	public boolean setPasswordEmpleado(String rut,String password) {
		for(int i=0;i<empleados.size();i++) {
			if(empleados.get(i).getRut()==rut) {
				empleados.get(i).setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public String getNombreEmpleado(String rut) {
		for(int i=0;i<empleados.size();i++) {
			if(empleados.get(i).getRut()==rut) {
				return empleados.get(i).getNombre();
			}
		}
		return null;
	}
	
	public String getPasswordEmpleado(String rut) {
		for(int i=0;i<empleados.size();i++) {
			if(empleados.get(i).getRut()==rut) {
				return empleados.get(i).getPassword();
			}
		}
		return null;
	}
	
	public Empleado getEmpleado(String rut) {
		int i;
		for(i=0;i<empleados.size();i++) {
			if(empleados.get(i).getRut()==rut) {
				return empleados.get(i);
			}
		}
		return null;
	}
	
	
	
	
	

	public int size() {
		int i,cont=0;
		for(i=0;i<empleados.size();i++) {
			cont++;
		}
		return cont;
	}
	
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}
	
}


