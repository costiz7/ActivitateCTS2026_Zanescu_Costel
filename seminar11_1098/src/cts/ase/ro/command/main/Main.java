package cts.ase.ro.command.main;

import cts.ase.ro.command.clase.Autobuz;
import cts.ase.ro.command.clase.Command;
import cts.ase.ro.command.clase.Operator;
import cts.ase.ro.command.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Command comanda1 = new Plecare(new Autobuz("Mercedes"), 233);
        Command comanda2 = new Plecare(new Autobuz("Audi"), 123);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new Plecare(new Autobuz("BEMVE"), 007));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
