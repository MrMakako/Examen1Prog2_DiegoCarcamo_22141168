/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1prog2_diegocarcamo_22141168;

import java.util.Random;

/**
 *
 * @author Diego Carcamo
 */
public class SuperHumano extends  Persona{
    
    String SuperPoder;

    public SuperHumano(String nombre,String debilad,String HeroeVilano) {
        super(nombre, debilad, HeroeVilano);
        
        
    
    }
    
    public void Final_Chance(){
         Random r= new Random();
       
        int i = r.nextInt(3);
        switch (i) {
            
            case 0:{
                setFuerza(((int)getFuerza()+(getFuerza()*4)));
                break;
            }case 1:{
                setHabiliad_Fisica(getHabiliad_Fisica()+(getHabiliad_Fisica()*4));
                
            
            }case 3:{
                setHabilidad_Mental(getHabilidad_Mental()+(getHabilidad_Mental()*4));
                break;
            
            
            }
        }
        i =i+1;
        
         switch (i) {
            
            case 0:{
                setFuerza(getFuerza()/2);
                break;
            }case 1:{
                setHabiliad_Fisica(getHabiliad_Fisica()+(getHabiliad_Fisica()*4));
                
            
            }case 3:{
                setHabilidad_Mental(getHabilidad_Mental()+(getHabilidad_Mental()*4));
                break;
            
            
            }case 4:{
                
                setHabilidad_Mental(getHabilidad_Mental()+(getHabilidad_Mental()*4));
                break;
            
            
            }
        }
        
    
    
    
    }
    
    
    
    
    
}
