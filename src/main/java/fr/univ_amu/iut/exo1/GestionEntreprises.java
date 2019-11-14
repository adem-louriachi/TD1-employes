package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {
        Entreprise e1 = new Entreprise("MaBoiteInfo");
        Employes m1 = new Employes(
                1,
                269054,
                "LOURIACHI",
                "Adem",
                12,
                LocalDate.of(1998, Month.FEBRUARY, 23),
                LocalDate.of(2019, Month.NOVEMBER, 13),
                11,
                140);
        System.out.println(e1);
        System.out.println(e1.ToString());
        System.out.println(m1.toString());
    }
}