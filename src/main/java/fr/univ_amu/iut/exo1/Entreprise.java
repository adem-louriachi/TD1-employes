package fr.univ_amu.iut.exo1;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private String name;
    private ArrayList<Employes> employesList = new ArrayList<Employes>();

    public Entreprise(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        return this.name = name;
    }

    public ArrayList<Employes> getEmployesList() {
        return employesList;
    }

    public void setEmployesList(ArrayList<Employes> employesList) {
        this.employesList = employesList;
    }

    public void hire(Employes employe)
    {
        this.employesList.add(employe);
    }
    public void fire(Employes employe)
    {
        this.employesList.remove(employe);
    }

    public String ToString() {
        return  "Entreprise{" + "nom='" + name + '\'' + ", liste des employés :" + employesList + "\n" + '}';
    }
}
