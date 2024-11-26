/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._4id_amayo_verifica;

/**
 *
 * @author ospite
 */
public class insegnanti {

    private String[] cognome_i = {"castriotta", "tagliabue", "infante"};
    private String[] materie_i = {"italiano", "matematica", "informatica"};

    public void visualizzazione_i() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            System.out.print("prof " + cognome_i[i]);
            System.out.println(" si occupa di insegnare " + materie_i[i]);
        }
    }
}
