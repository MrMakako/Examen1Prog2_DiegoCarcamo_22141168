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
public class Alien extends Extraterrestre {

    public Alien(String nombre, String debilad, String HeroeVilano) {
        super(nombre, debilad, HeroeVilano);
    }

    public void Final_Chance(Persona p) {

        Random r = new Random();
        int i = r.nextInt(3);

      
        int C = 0;
        while (C < 2) {

            switch (i + 1) {

                case 0: {
                    p.setFuerza(p.getFuerza() / 2);
                    break;
                }
                case 1: {
                    p.setHabiliad_Fisica(p.getHabiliad_Fisica() / 2);

                }
                case 3: {
                    p.setHabilidad_Mental(p.getHabilidad_Mental() / 2);
                    break;

                }

            }

            C++;

        }

    }

}
