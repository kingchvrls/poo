package clases;

public class Horario {
	private	int id;
	private String dia;
	private boolean mañana;
	private boolean tarde;
	//sin parametros
	public Horario() {
		id=0;
		dia=null;
		mañana=false;
		tarde=false;
	}
	//con parametros
	public Horario(int id,String dia,boolean mañana,boolean tarde) {
		this.id=id;
		this.dia=dia;
		this.mañana=mañana;
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

	public boolean getMañana() {
		return mañana;
	}

	public void setMañana(boolean mañana) {
		this.mañana = mañana;
	}

	public boolean getTarde() {
		return tarde;
	}

	public void setTarde(boolean tarde) {
		this.tarde = tarde;
	}
	
}


