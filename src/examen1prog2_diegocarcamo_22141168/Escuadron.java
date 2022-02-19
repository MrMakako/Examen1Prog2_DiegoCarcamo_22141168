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
public class Escuadron {
    
    private String LugarBase,Nombre;
    
    private Persona Lider;
    
    private Boolean Heroes_Villanos;
    
    private ArrayList<Persona>Miembros;

    public Escuadron(String nombre, String lugarBase) {
        
        this.Nombre=nombre;
        this.LugarBase=lugarBase;
        
        
        
        
    }
    
    
    public void SetLider(Persona p){
        
        
        Lider=p;
        
        
       
    
    
    
    }
    
    public void AddMiembro(Persona p){
        
        Miembros.add(p);
    
    }

    public Boolean getHeroes_Villanos() {
        return Heroes_Villanos;
    }

    public Persona getLider() {
        return Lider;
    }

    public String getLugarBase() {
        return LugarBase;
    }

    public String getNombre() {
        return Nombre;
    }

    public ArrayList<Persona> getMiembros() {
        return Miembros;
    }
    public int SumaPoder(){
        int suma=0;
        
        for(Persona p :Miembros){
            suma+=p.getSumaPoder();
        
        
        }
        
        return suma;
        
    
    
    
    }
    
    public int  getSumaFuerza(){
       int  suma =0;
        for(Persona p: Miembros){
            suma+=p.getFuerza();
        
           
        
        }
        
        
        return suma;
    
    
    
    
    
    
    }

    public Persona MiembroDebil() {
        Persona debil= Miembros.get(0);
        
        Persona n;
        for(Persona p : Miembros){
            if(p.getSumaPoder()<debil.getSumaPoder()){
                debil=p;
            }
           
        
        
        }
        
        return debil;
        
        
        
        
        
    }
    
    
    
    
    public int  getSumaHabilidad_Mental(){
       int  suma =0;
        for(Persona p: Miembros){
            suma+=p.getHabilidad_Mental();
        
           
        
        }
        
        
        return suma;
    
    
    
    
    
    
    }
    
    public int  getSumaHabilidiad_Fisica(){
       int  suma =0;
        for(Persona p: Miembros){
            suma+=p.getHabiliad_Fisica();
        
           
        
        }
        
        
        return suma;
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
