package clases;

import java.util.*;

public class ListaDias {
    private ArrayList <Horario> listaHorario;
    String [] diasSemana;
    
    public ListaDias() {
    	Horario dia=new Horario();
   	 listaHorario = new ArrayList <Horario>();
   	 diasSemana = new String [7];
   	 
   	 diasSemana[0] = "lunes";
   	 diasSemana[1] = "martes";
   	 diasSemana[2] = "miercoles";
   	 diasSemana[3] = "jueves";
   	 diasSemana[4] = "viernes";
   	 diasSemana[5] = "sabado";
   	 diasSemana[6] = "domingo";
   	 for(int i = 0; i < diasSemana.length; i++) {
   	   	 dia.setNombreDia(diasSemana[i]);
   	   	 dia.setId(i);
   	   	 listaHorario.add(dia);
   	 }
    }
    
    
    
    
    public void setMañanaTrabajada(int id, boolean mañana) {
   	 int i;
   	 for(i=0;i<listaHorario.size();i++) {
   		 if(listaHorario.get(i).getId()==i) {
   			listaHorario.get(i).setMañana(mañana);
   		 }
   	 }
    }
    public void setTardeTrabajada(int id, boolean tarde) {
   	 int i;
   	 for(i=0;i<listaHorario.size();i++) {
   		 if(listaHorario.get(i).getId()==i) {
   			listaHorario.get(i).setMañana(tarde);
   		 }
   	 }
    }
    
    public boolean getMañanaTrabajada(int id) {
   	 int i;
   	 for(i=0;i<listaHorario.size();i++) {
   		 if(listaHorario.get(i).getId()==i) {
   			 return listaHorario.get(i).getMañana();
   		 }
   	 }
   	 return false;
    }
    
    public boolean getTardeTrabajada(int id) {
   	 int i;
   	 for(i=0;i<listaHorario.size();i++) {
   		 if(listaHorario.get(i).getId()==id) {
   			 return listaHorario.get(i).getTarde();
   		 }
   	 }
   	 return false;
    }
    public int getDiasTrabajados() {
   	 int cont=0,i;
   	 for(i=0;i<listaHorario.size();i++) {
   		 if((listaHorario.get(i).getMañana()==true)||(listaHorario.get(i).getTarde()==true)) {
   			 cont++;
   		 }
   	 }
   	 return cont;
    }
    
    
    public int lenght() {
    	return diasSemana.length;
    }
    
    public String getDia(int idDia) {
    	return diasSemana[idDia];
    }
    
    
}
