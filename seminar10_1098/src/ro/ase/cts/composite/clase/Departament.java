package ro.ase.cts.composite.clase;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Departament implements  Structura{
    private String numeDep;
    private List<Structura> subStructuri;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.subStructuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura) {
        subStructuri.add(structura);
    }

    public void stergereStructura(Structura structura) {
        subStructuri.remove(structura);
    }

    public Structura getStructura(int pozitie) {
        return subStructuri.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Departament" + this.numeDep);
        for(Structura structura : this.subStructuri) {
            structura.afiseazaDetaliiStructura();
        }
    }
}
