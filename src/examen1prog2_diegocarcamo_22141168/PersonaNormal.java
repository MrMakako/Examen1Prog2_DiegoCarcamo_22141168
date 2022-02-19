/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1prog2_diegocarcamo_22141168;

/**
 *
 * @author Diego Carcamo
 */
public class PersonaNormal extends Persona{

    public PersonaNormal(String nombre,String debilad,String HeroeVilano) {
        super(nombre, debilad, HeroeVilano);
    }
    public void Final_Chance(Persona p){
        
        this.setFuerza((int) (getFuerza()+(getFuerza()*0.5)));
        this.setHabiliad_Fisica((int) (this.getHabiliad_Fisica()+(getHabiliad_Fisica()*0.05)));
        this.setHabilidad_Mental((int)(this.getHabilidad_Mental()+(this.getHabilidad_Mental()*0.05)));
        
        
        
        
        
        
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
