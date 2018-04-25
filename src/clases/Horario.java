package clases;

public class Horario {
	private	int id;
	private String dia;
	private boolean ma�ana;
	private boolean tarde;
	//sin parametros
	public Horario() {
		id=0;
		dia=null;
		ma�ana=false;
		tarde=false;
	}
	//con parametros
	public Horario(int id,String dia,boolean ma�ana,boolean tarde) {
		this.id=id;
		this.dia=dia;
		this.ma�ana=ma�ana;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreDia() {
		return dia;
	}

	public void setNombreDia(String dia) {
		this.dia = dia;
	}

	public boolean getMa�ana() {
		return ma�ana;
	}

	public void setMa�ana(boolean ma�ana) {
		this.ma�ana = ma�ana;
	}

	public boolean getTarde() {
		return tarde;
	}

	public void setTarde(boolean tarde) {
		this.tarde = tarde;
	}
	
}


