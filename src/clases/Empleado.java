package clases;

public class Empleado {
	private String rut;
	private String nombre;
	private String password;
	private ListaDias arrayDias;

    

   	 
   public Empleado(String rut,String nombre,String password) {
		this.rut=rut;
		this.nombre=nombre;
		this.password=password;
		arrayDias= new ListaDias();
	}

   	 
   	 
   	 
    
    public Empleado () {
   	 
   	 rut = null;
   	 nombre =null;
	password=null;
   	 arrayDias =new ListaDias();
   	 
      	 }
   	 
   	 
    //getters y setters de id, rut, nombre y password.
    public String getRut() {
   	 return rut;
    }
    public String getNombre() {
   	 return nombre;
    }
    
    public void setRut(String rut) {
   	 this.rut = rut;
    }
    public void setNombre(String nombre) {
   	 this.nombre = nombre;
    }
    //_--------------------------------_
    
    
    //coloca si trabaja en la mañana o no, si trabaja es true, sino es false OK
    public void setTrabajoMañana(boolean mañana, int dia) {
   	 arrayDias.setMañanaTrabajada(dia,mañana);
    }
    public String getPassword() {
		return password;
	}
    
    
    




	public void setPassword(String password) {
		this.password = password;
	}





	//coloca si trabaja en la tarde o no, si trabaja es true, sino es false OK
    public void setTrabajoTarde(boolean tarde, int dia) {
   	 arrayDias.setTardeTrabajada(dia,tarde);
    }
    //coloca la id del dia en base a los dias que se trabajan a la semana DEFAULTS
    
   
    //obtiene el nombre del dia pedido  OK
    public String getIdDia(int dia) {
   	 return arrayDias.getDia(dia);
    }
    //obtiene un true si trabaja en la mañana del dia pedido o false si no trabaja ese dia. OK
    public boolean getTrabajoMañana(int dia) {
   	 return arrayDias.getMañanaTrabajada(dia);
    }
    //obtiene un true si trabaja en la tarde del dia pedido o false si no trabaja ese dia.
    public boolean getTrabajoTarde(int dia) {
   	 return arrayDias.getTardeTrabajada(dia);
    }

    //obtiene el nombre del dia OK
    public String getNombreDia(int dia) {
   	 return arrayDias.getDia(dia);
    }
    public void setDiasTrabajados(int nuevosDiasTrabajados) {
   	 Horario[] horarioNuevo;
   	 horarioNuevo = new Horario[nuevosDiasTrabajados];
   	 		for (int i = 0; i < nuevosDiasTrabajados; i++) {
   		 horarioNuevo[i].setMañana(false);
   		 horarioNuevo[i].setTarde(false);
   		}
    }
    
    public int getDiasTrabajados() {
		return arrayDias.getDiasTrabajados();
	}
    
    
    
    
    
    
    
    
    
}

