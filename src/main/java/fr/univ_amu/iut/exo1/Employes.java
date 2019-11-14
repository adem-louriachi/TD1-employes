package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

public class Employes {

    private int numEmployes;
    private int numSS;
    private String lastName;
    private String firstName;
    private int grade;
    private LocalDate birthDate;
    private LocalDate hiringDate;
    protected double base;
    protected double nbHeures;

    public Employes(int numEmployes, int numSS, String lastName, String firstName, int grade, LocalDate birthDate, LocalDate hiringDate, double base, double nbHeures) {
        this.numEmployes = numEmployes;
        this.numSS = numSS;
        this.lastName = lastName;
        this.firstName = firstName;
        this.grade = grade;
        this.birthDate = birthDate;
        this.hiringDate = hiringDate;
        this.base = base;
        this.nbHeures = nbHeures;
    }

    public double calcGrossSalary() {
        return this.base * this.nbHeures;
    }

    public double calcNetSalary() {
        return 0.8 * (calcGrossSalary());
    }

    public void showEmployes()
    {
        System.out.println(this.numEmployes + " : "
                +this.numSS +", "
                +this.lastName +", "
                +this.firstName +", "
                +this.birthDate +", "
                +this.hiringDate +" --  "
                +this.grade);
    }

    public int getNumEmployes() {
        return numEmployes;
    }
    public int getNumSS() {
        return numSS;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getGrade() {
        return grade;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public LocalDate getHiringDate() {
        return hiringDate;
    }
    public double getBase() {
        return base;
    }
    public double getNbHeures() {
        return nbHeures;
    }

    public void setNumEmployes(int numEmployes) {
        this.numEmployes = numEmployes;
    }

    public void setNumSS(int numSS) {
        this.numSS = numSS;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setNbHeures(double nbHeures) {
    this.nbHeures = nbHeures;
    }

    public String toString() {
        return "Employe{" +
                "Num_employe=" + numEmployes +
                ", Numero Secu='" + numSS + '\'' +
                ", Nom_='" + lastName + '\'' +
                ", Prenom_='" + firstName + '\'' +
                ", Echelon=" + grade +
                ", Date de naissance=" + birthDate +
                ", Date embauche=" + hiringDate +
                ", Salaire brut ="+ calcGrossSalary()+
                ", Salaire net ="+ calcNetSalary()+
                '}';
    }
}
