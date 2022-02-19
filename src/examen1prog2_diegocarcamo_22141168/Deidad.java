/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1prog2_diegocarcamo_22141168;

/**
 *
 * @author Diego Carcamo
 */
public class Deidad extends Extraterrestre{
    
    boolean Creyentes;

    public Deidad(String nombre,String debilad,String HeroeVilano) {
        super(nombre, debilad, HeroeVilano);
    }
    
    public void  Final_Chance(Persona p ){
        this.setFuerza((int) (getFuerza()+(getFuerza()*4)));
        this.setHabiliad_Fisica((int) (this.getHabiliad_Fisica()+(getHabiliad_Fisica()*4)));
        this.setHabilidad_Mental((int)(this.getHabilidad_Mental()+(this.getHabilidad_Mental()*4)));
        
        
        p.setFuerza((int) (getFuerza()/2));
        p.setHabiliad_Fisica((int) (p.getHabiliad_Fisica()+(getHabiliad_Fisica()/2)));
        p.setHabilidad_Mental((int)(p.getHabilidad_Mental()/2));
        
        
        
    
    
    
    }
    
    
    
    
    
    
}
