package fr.univ_amu.iut.exo3;

import fr.univ_amu.iut.exo1.Employes;
import fr.univ_amu.iut.exo1.Entreprise;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {
        Employes m2 = new Employes(
                2,
                269054,
                "LOURIACHI",
                "Adem",
                12,
                LocalDate.of(1998, Month.FEBRUARY, 23),
                LocalDate.of(2019, Month.AUGUST, 13),
                10,
                40);
        Employes m3 = new Employes(
                3,
                269053,
                "BOULOU",
                "Abra",
                10,
                LocalDate.of(2007, Month.JANUARY, 02),
                LocalDate.of(2019, Month.AUGUST, 13),
                10,
                40);
        System.out.println(m2.calcAnciennete());

        Entreprise e2 = new Entreprise("MaBoiteInfo");
        e2.hire(m2);
        e2.hire(m3);
        System.out.println(e2.ToString());
        e2.distribuerBonus(25.800);
        System.out.println(e2.ToString());

    }
}