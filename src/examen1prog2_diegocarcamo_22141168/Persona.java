/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1prog2_diegocarcamo_22141168;

/**
 *
 * @author Diego Carcamo
 */
public class Persona {
    
    private String nombre,poder,debilidad,HeroreVillano;
    
    private int Fuerza,Habilidad_Mental, Habiliad_Fisica;
    
    boolean Tiene_Escuadron;
            
    
    
    
   

    public Persona(String nombre,String debilad,String HeroeVilano){
        
        this.nombre=nombre;
        this.debilidad=debilad;
        this.HeroreVillano=HeroeVilano;
        
        
        
        
    }//HAcer meotodo to string 
    
    public String toString(){
        return "Nombre: "+nombre+"--"+"debilidad:"+debilidad+"--"+"Es un :"+HeroreVillano+
              "\nFuerza:"+Fuerza+"--"+"Habilidad Mental:" +Habilidad_Mental+"--Habilidad Fisica:"+Habiliad_Fisica ;
        
        
        
    
    
    
    
    
    }

    public String Tipo() {
        return "Persona";
        
        
    }
    
    
    //polifmorfico
    public void Find_Chance(){
    
    
    
    }
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public int getHabiliad_Fisica() {
        return Habiliad_Fisica;
    }

    public int getHabilidad_Mental() {
        return Habilidad_Mental;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public String getHeroreVillano() {
        return HeroreVillano;
    }

    public String getPoder() {
        return poder;
    }
   //SETTERS

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public void setFuerza(int Fuerza) {
        this.Fuerza = Fuerza;
    }

    public void setHeroreVillano(String HeroreVillano) {
        this.HeroreVillano = HeroreVillano;
    }

    public void setTiene_Escuadron(boolean Tiene_Escuadron) {
        this.Tiene_Escuadron = Tiene_Escuadron;
    }

    public void setHabilidad_Mental(int Habilidad_Mental) {
        this.Habilidad_Mental = Habilidad_Mental;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setHabiliad_Fisica(int Habiliad_Fisica) {
        this.Habiliad_Fisica = Habiliad_Fisica;
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
