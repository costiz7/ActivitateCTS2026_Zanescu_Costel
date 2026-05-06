package cts.ase.ro.strategy.clase;

public class Student {
    private String name;
    private ModSustinere modSustinere;

    public Student(String name) {
        this.modSustinere = new Grila();
        this.name = name;
    }

    public Student(ModSustinere modSustinere, String name) {
        this.modSustinere = modSustinere;
        this.name = name;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare() {
        modSustinere.sustinereExamen();
    }
}
