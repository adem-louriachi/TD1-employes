package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employes;

import java.time.LocalDate;

public class Commercial extends Employes {

    public Commercial(int numEmployes, int numSS, String lastName, String firstName, int grade, LocalDate birthDate, LocalDate hiringDate, double base, double nbHeures) {
        super(numEmployes, numSS, lastName, firstName, grade, birthDate, hiringDate, base, nbHeures);
    }

    public void negoTransac(){
        System.out.print("Je négocie une transaction.");
    }
}
