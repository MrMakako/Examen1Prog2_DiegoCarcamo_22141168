/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1prog2_diegocarcamo_22141168;

import java.util.ArrayList;

/**
 *
 * @author Diego Carcamo
 */
public class Universo {
    
   
    private String nombre;
    
    ArrayList<Escuadron>Escuadrones;
    
   

    public Universo(String nombre) {
        Escuadrones=new ArrayList<>();
        
        this.nombre=nombre;
      
        
    }

    public String getNombre() {
        return nombre;
    }
    
    public String toString(){
        return "Nombre"+nombre;
    
    }
    
    
    
    public void MostrarEscuadrones(){
        
        for(int e=0;e<Escuadrones.size();e++){
            System.out.println(e+"--"+Escuadrones.get(e));
            
            
        }
        
    
    
    }
    
    
    
    public Escuadron BuscarEscuadron(String nombre){
        
        for(Escuadron e:Escuadrones){
            if(e.getNombre().toUpperCase().equals(nombre.toUpperCase())){
                return e;
            
            }
            
            
            
        }
        
        return null;
        
        
        
    
    
    }
    
    public void EliminarEscuadron(String nombre){
        
        if(BuscarEscuadron(nombre)!=null){
            int index= Escuadrones.indexOf(BuscarEscuadron(nombre));
            Escuadrones.remove(index);
        
        }else{
            System.out.println("No se pudo eliminar");
        }
    
    
    
    }

    public ArrayList<Escuadron> getEscuadrones() {
        return Escuadrones;
    }

    public  void AddEscuadron( Escuadron e) {
        Escuadrones.add(e);
    
    }
    
    
    
    
    
    
    
    

  }
        
    
  