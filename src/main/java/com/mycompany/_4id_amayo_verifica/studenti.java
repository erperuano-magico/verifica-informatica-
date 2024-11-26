/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._4id_amayo_verifica;

/**
 *
 * @author ospite
 */
public class studenti {

    private String[] nome_s = {"israel", "edward", "sergio"};
    private String[] cognome_s = {"amayo", "gonzaga", "bolivar"};
    private String[] materie = {"italiano", "matematica", "informatica"};
    private int[] voti = {7, 9, 6};
    private int[] voti_2 = {7, 8, 6};
    private int somma = 0;
    private int media;

    public void stampa_voti_studente() {
        for (int i = 0; i < 3; i++) {
            int somma = 0;
            System.out.println(" ");
            System.out.print("studente " + nome_s[i]);
            System.out.println(" " + cognome_s[i]);

            for (int k = 0; k < 3; k++) {
                
                System.out.print("voto in " + materie[k]);
                System.out.println(": " + voti[k]);
                if (voti[k] < 6) {
                    
                    System.out.println("lo studente ha il debito in questa materia");
                     System.out.println(" ");
                }
                somma = somma + voti[k];

            }
            media = somma / 3;
            System.out.println("la media dei voti dello studente: " + media);

            voti[0] = voti[0] - 1;
            voti[1] = voti[1] - 2;
            voti[2] = voti[2] + 1;
        }

    }
}
