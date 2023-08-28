package oppgaverTilVariabler1;

import javax.swing.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgavertilvariabler1 {
    public static void main(String[] args){

        String navn = JOptionPane.showInputDialog("Hva heter du?");
        String adresse = JOptionPane.showInputDialog("Hva er adressen din?");
        String postNr = JOptionPane.showInputDialog("Hva er postnummeret ditt?");
        String alder = JOptionPane.showInputDialog("Hvor gammel er du?");
        String ut = navn + " er " + alder +  " år gammel og bor i " + adresse + " som har postnummer " + postNr;
        // printer en setning med alle variablene

        String ut2 = "Navn: " + navn + "\n" + "Adresse: " + adresse + "\n" + "Postnummer: " + postNr + "\n" + "Alder: " + alder ;
        showMessageDialog(null,
                navn + " er " + alder +  " år gammel og bor i " + adresse + " som har postnummer " + postNr);
        System.out.println(ut2);
    }
}

