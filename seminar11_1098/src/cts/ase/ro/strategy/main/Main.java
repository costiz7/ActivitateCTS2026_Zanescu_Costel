package cts.ase.ro.strategy.main;

import cts.ase.ro.strategy.clase.ProbaOrala;
import cts.ase.ro.strategy.clase.ProbaScrisa;
import cts.ase.ro.strategy.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Petrisor");
        student1.examinare();

        student1.setModSustinere(new ProbaOrala());
        student1.examinare();

        student1.setModSustinere(new ProbaScrisa());
        student1.examinare();
    }
}
