package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.Sectie;
import ro.ase.cts.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Departament Administrativ");
        Structura sectieManagement = new Sectie("Management", 14);
        Structura sectieSecretariat = new Sectie("Secretariat", 5);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura();

        ((Departament) depSpital).stergereStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieManagement);
    }
}
