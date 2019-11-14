package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employes;

import java.time.LocalDate;

public class Ordinary extends Employes {

    public Ordinary(int numEmployes, int numSS, String lastName, String firstName, int grade, LocalDate birthDate, LocalDate hiringDate, double base, double nbHeures) {
        super(numEmployes, numSS, lastName, firstName, grade, birthDate, hiringDate, base, nbHeures);
    }

    public void doOrdiTasks() {
        System.out.print("J'exécute des tâches affreusement ordinaires...");
    }
}
