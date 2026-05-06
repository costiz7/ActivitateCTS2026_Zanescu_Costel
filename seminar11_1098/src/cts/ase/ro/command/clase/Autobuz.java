package cts.ase.ro.command.clase;

public class Autobuz {
    private String producator;

    public Autobuz(String producator) {
        this.producator = producator;
    }

    public void pornesteInCursa(int nrLinie) {
        System.out.println("Autobuzul " + this.producator + " porneste pe traseul 381");
    }
}
