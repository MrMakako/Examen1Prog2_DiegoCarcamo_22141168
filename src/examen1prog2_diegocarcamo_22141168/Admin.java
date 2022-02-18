/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1prog2_diegocarcamo_22141168;

import com.sun.source.tree.ContinueTree;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Carcamo
 */
public class Admin {

    ArrayList<Universo> Universos;

    ArrayList<Persona> SuperHeroes;

    ArrayList<Escuadron> EscuadronesMultiverso = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public Admin() {
        Universos = new ArrayList<>();

        SuperHeroes = new ArrayList<>();

        CrearUniverso();

        while (true) {

            menu();

        }

    }

    public String leerTxT(String msg, String Error) {

        try {
            System.out.print(msg + ">>");
            return sc.next();
        } catch (Exception e) {
            System.out.println(Error);
            return leerTxT(msg, Error);
        }

    }

    public int leerInt(String msg, String Error) {

        try {
            System.out.print(msg + ">>");
            return sc.nextInt();
        } catch (Exception e) {
            System.out.println(Error);
            return leerInt(msg, Error);
        }

    }

    public void MostrarUniversos() {
        for (int u = 0; u < Universos.size(); u++) {
            System.out.println(u + "--" + Universos.get(u).getNombre());

        }

    }

    public Universo BuscarUniverso(String nombre) {
        for (Universo u : Universos) {
            if (u.getNombre().toUpperCase().contentEquals(nombre.toUpperCase())) {
                return u;

            }

        }

        return null;

    }

    public boolean CrearUniverso() {

        System.out.println("-------Crear universo-------");

        String nombre = leerTxT("nombre de universo", "");

        if (BuscarUniverso(nombre) == null) {
            Universos.add(new Universo(nombre));
            return true;

        } else {
            System.out.println("Error este univer ya existe");
            return false;

        }

    }

    public void EliminarUniversos() {
        System.out.println("Eliminar");

        MostrarUniversos();

        int index = leerInt("Inidice del univero que desea eliminar", "Error solo enteros");

        Universos.remove(index);

    }

    public void menu() {

        System.out.println("1.Opciones Universo"
                + "\n2.Opciones Escuadron"
                + "\n3.Opciones Persona");

        int opcion = leerInt("Opcion>>", "");

        switch (opcion) {

            case 1: {

                System.out.println("Opciones de universo");
                System.out.println("1.1 Crear\n"
                        + "1.2 Modificar\n"
                        + "1.3 Eliminar\n"
                        + "1.4 Listar");
                OpcionesUniverso(leerInt("Opcion>>", "solo enteros"));
                    break;
            }

            case 2: {

                System.out.println("Opciones de Escuadron");
                System.out.println("2.1 Crear\n"
                        + "2.2 Modificar\n"
                        + "2.3 Eliminar\n"
                        + "2.4 Listar\n"
                        + "2.5 Agregar personas\n"
                        + "2.6 Simular Batalla");

                OpcionesEscuadron(leerInt("Opcion>>", "solo enteros"));
                break;
            }

            case 3: {

                System.out.println("Opciones de persona");

                System.out.println("3.1 Crear\n"
                        + "3.2 Modificar\n"
                        + "3.3 Eliminar\n"
                        + "3.4 Listar");

                OpcionesPersona(leerInt("Opcion>>", "solo enteros"));
                break;
            }

        }

    }

    public void OpcionesUniverso(int opciones) {
        switch (opciones) {

            case 1: {

                CrearUniverso();

                break;

            }
            case 2: {

                System.out.println("Modificar universo");

                break;

            }

            case 3: {

                EliminarUniversos();

                break;

            }
            case 4: {
                MostrarUniversos();

                break;

            }

        }

    }

    public void OpcionesEscuadron(int opcion) {
        switch (opcion) {

            case 1: {

                CrearEscuadron();
                break;

            }
            case 2: {

            }
            case 3: {

                EliminarEscuadron();

            }

            case 4: {
                if(EscuadronesMultiverso!=null){
                    
                        AsignarHeroeEscuadron();
                        
                
                } 

            
                break;

            }
            case 5: {

                System.out.println("Simular Batalla");
                 Escuadron Perdedor= ElejirDuelo();
                 
                 if(Perdedor!=null){
                     System.out.println("Perdedores "+ Perdedor.getNombre());
                     
                     
                     System.out.println("");
                 
                 
                 }
               break;
                

            }

        }

    }

    public void OpcionesPersona(int opcion) {

        switch (opcion) {

            case 1: {

                System.out.println("Crear Supers");

                CrearSuper();

                break;

            }
            case 2: {

                System.out.println("Modificar");

                break;
            }
            case 3: {

                System.out.println("Eliminar Herores");
                EliminarHeroe();

                break;
            }

        }

    }

    public void BorrarPersona(Persona p) {
        if (p != null) {
            Persona Delete = BuscarSuper(p.getNombre());

            if (Delete != null) {
                Universo u = BuscarUniverso(p.getUniverso());

                Escuadron squad = u.BuscarEscuadron(p.getEscuadron());

                squad.getMiembros().remove(p);

            }

        }

    }

    public void EliminarHeroe() {

        MostrarHeroes();

        String nombre = leerTxT("Nombre de Heroe>>", "");

        BorrarPersona(BuscarSuper(nombre));

    }

    public void EliminarEscuadron() {

        System.out.println("Elimnar escuadron ");

        MostrarUniversos();

        //Squad es unvisero se me paso
        String nombre = leerTxT("Nombre del univero", "sololetras");
        Universo squad = BuscarUniverso(nombre);
        if (squad == null) {

            squad.MostrarEscuadrones();

            String nombreSquad = leerTxT("Nombre del escuadron que desea elimianr", "");
            Escuadron delete = squad.BuscarEscuadron(nombreSquad);

            if (delete != null) {
                squad.getEscuadrones().remove(delete);

            }

        }

    }

    public void CrearEscuadron() {

        String nombre = leerTxT("Nombre de escuadron>>", "");

        String UbicacionBase = leerTxT("Ubicacion de la base", "");

        if (BuscarSuper(nombre) == null) {

            MostrarUniversos();
            int index = leerInt("Intrduzca el indce del univero del escuadron", "Dato invalido solo int");

            Universos.get(index).AddEscuadron(new Escuadron(nombre, UbicacionBase));

        }

    }

    public Persona BuscarSuper(String name) {

        for (Persona p : SuperHeroes) {
            if (p.getNombre().toUpperCase().equals(name.toUpperCase())) {
                return p;

            }

        }
        return null;

    }

    public boolean PudeSerSuper(Persona p) {
        int suma = p.getFuerza() + p.getHabiliad_Fisica() + p.getHabilidad_Mental();

        if (suma >= 100 && suma <= 150) {

            System.out.println("Extra ordinario");
            return true;

        }

        System.out.println("No cumplio");
        return false;

    }

    public void AsignarAtributosHeroes(Persona p) {

        p.setFuerza(leerInt("Fuerza>>", "Solo enteros"));
        p.setHabiliad_Fisica(leerInt("Habilidad Fisica>>", ""));
        p.setHabilidad_Mental(leerInt("Habilida Mental>>", ""));

        if (p instanceof Extraterrestre) {

            String R = leerTxT("Tiene Creyentes y/n", "");

            if (R.toUpperCase().equals("Y")) {
                ((Extraterrestre) p).setCreyentes(true);

            } else {
                ((Extraterrestre) p).setCreyentes(false);
            }

        } else if (p instanceof PorAccidenteRadioActivo) {
            ((PorAccidenteRadioActivo) p).setEdad_en_Accidente(leerInt("Edad qeu tenia cuando ocurrio el acciidente>>", "Error solo enteros"));
            ((PorAccidenteRadioActivo) p).setTipoAccidente(leerTxT("Tipo de Accidente>>", ""));
        }

        //Atributos extra
    }

    public void CrearSuper() {

        String nombre = leerTxT("Nombre de Super:", "");

        String poder = leerTxT("Poder:", "");

        String debilidad = leerTxT("Debilidad:", "");

        String Heroe_Villano = leerTxT("Es heroes o villano>>>", "");

        if (BuscarSuper(nombre) == null) {

            for (TipoSuper s : TipoSuper.values()) {
                System.out.println(s);

            }

            Persona HeroeCreado = ElegirTipo(leerTxT("Tipo>>", ""), nombre, debilidad, Heroe_Villano);
            AsignarAtributosHeroes(HeroeCreado);

        }

    }
    
    public Escuadron ElejirEscuadron(){
        MostrarUniversos();
        
        Universo busqueda=BuscarUniverso(leerTxT("Nombre de universso>>",""));
        
        if(busqueda!=null){
           busqueda.MostrarEscuadrones();
           
           Escuadron deseado= busqueda.BuscarEscuadron(leerTxT("Nombde del escuadron", ""));
           if(deseado!=null){
               return deseado;
           
           }
        
        
        
        
        }
        
        return null;
        
        
        
    
    
    }
    
    public Escuadron ElejirDuelo(){
        
        
        Escuadron e1= ElejirEscuadron();
        Escuadron e2= ElejirEscuadron();
        if(e1==null || e2==null){
            System.out.println("Error");
           return null;
        
        }
        
        
        
        
        System.out.println("Elije un duelo\n"
                + "1Fuerza\n"
                + "2.Duelo de Habiliad Mental\n"
                + "3.Duelo de habilidad fisica");
        
        
        int opcion = leerInt("Opcion>>", "solo enterps");
        
        
        
        switch (opcion) {
            
            case 1:{
               
                
                return DueloFuerza(e1, e2);
            
               
            }case 2:{
                
                return DueloHabiliad_Mental(e1, e2);
            
              
            }case 3:{
                
                return DueloHabiliad_Fisica(e1, e2);
            
            
                
            }
            
            
            
            
        }
        
        return null;
 
    
    
    
    }
    
    public Escuadron DueloHabiliad_Fisica(Escuadron e1,Escuadron e2){
        if(e1.getSumaHabilidiad_Fisica()>e2.getSumaHabilidiad_Fisica()){
            System.out.println(e1.getNombre()+" Gano el duelo de Habiliad fisica");
            return e2;
        //Retorna  al perdedor
        
        }else if(e1.getSumaHabilidiad_Fisica()<e2.getSumaHabilidiad_Fisica()){
            return e1;
        
        }
        
        return null;
        
    
    
    
    
    }
    
    public Escuadron DueloHabiliad_Mental(Escuadron e1,Escuadron e2){
        if(e1.getSumaHabilidad_Mental()>e2.getSumaHabilidad_Mental()){
            System.out.println(e1.getNombre()+" Gano el duelo de Habiliad fisica");
            return e2;
        //Retorna  al perdedor
        
        }else if(e1.getSumaHabilidad_Mental()<e2.getSumaHabilidad_Mental()){
            return e1;
        
        }
        
        return null;
        
    
    
    
    
    }
    
    
    public Escuadron DueloFuerza(Escuadron e1,Escuadron e2){
        
        if(e1.getSumaFuerza()>e2.getSumaFuerza()){
            System.out.println(e1.getNombre()+" Gano el duelo de fuerza");
            return e2;
        
        
        }else if (e1.getSumaFuerza()<e2.getSumaFuerza()){
            
            System.out.println(e2.getNombre()+" Gano el duelo de fuerza");
            return e1;
        }
        
        
        
        
        return null;
        
        
        
        
        
        
        
        
        
    
        
    
    
    
    
    
    
    }

    public void MostrarHeroes() {
        System.out.println("Heroes");

        for (Persona p : SuperHeroes) {
            System.out.println(p);
            System.out.println();

        }

    }

    public void AsignarHeroeEscuadron() {

        MostrarUniversos();

        Universo add = Universos.get(leerInt("indice>>", "solo enteros"));

        if (add != null) {

            add.MostrarEscuadrones();

            int i = leerInt("Indice", "solo enteros");

            if (add.getEscuadrones().get(i) != null) {

                MostrarHeroes();
                String nombre = leerTxT("Nombre de super>>", "");
                if (BuscarSuper(nombre) != null) {
                    
                    add.getEscuadrones().get(i).AddMiembro(BuscarSuper(nombre));
                    BuscarSuper(nombre).setEscuadron(add.getEscuadrones().get(i).getNombre());
                    BuscarSuper(nombre).setUniverso(add.getNombre());
                    //Setea el escuadron 
                    
                    

                    String R = leerTxT("Desea que sea el lider Y/N", "").toUpperCase();

                    if (R.equals("Y")) {
                        add.getEscuadrones().get(i).SetLider(BuscarSuper(nombre));

                    }

                }

            }

        }

    }

    //Simumlacion de Batallla
    public Persona ElegirTipo(String s, String nombre, String debilidad, String HeroeVillano) {

        switch (TipoSuper.valueOf(s.toUpperCase())) {

            case MUTANTE: {

                return new Mutante(nombre, debilidad, HeroeVillano);
                

            }
            case ALIEN: {
                return new Alien(nombre, debilidad, HeroeVillano);

            }
            case DEIDAD: {
                return new Deidad(nombre, debilidad, HeroeVillano);

            }
            case PERSONA_NORMAL: {
                return new PersonaNormal(nombre, debilidad, HeroeVillano);
            }
            case SUPER_HUMANO: {
                return new SuperHumano(nombre, debilidad, HeroeVillano);

            }

            case POR_ACCIDENTE_RADIOACTIVO: {
                return new PorAccidenteRadioActivo(nombre, debilidad, HeroeVillano);

            }

        }
        System.out.println("Error tipo no existen");
        return ElegirTipo(s, nombre, debilidad, HeroeVillano);

    }

}
