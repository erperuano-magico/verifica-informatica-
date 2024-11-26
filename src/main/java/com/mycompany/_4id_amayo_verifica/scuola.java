/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany._4id_amayo_verifica;

/**
 *
 * @author ospite
 */
public class scuola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//creo un oggetto per la classe studenti che gestira la stampa di nome, cognome, calcolo per la media dei voti e verificare se il voto e sufficente o meno 
        studenti stu1 = new studenti();
// richiamo del metodo stampa_voti_studente presente nella classe studenti tramite l'oggetto stu1
        stu1.stampa_voti_studente();
//creo un oggetto per la classe insegnanti che gestira la stampa di cognome e materia di cui si occdupa ogni insegnante 
    insegnanti inse1 = new insegnanti();
    
    // richiamo del metodo visualizzazione_i presente nella classe insegnanti tramite l'oggetto stu1
        inse1.visualizzazione_i();
    }

}
