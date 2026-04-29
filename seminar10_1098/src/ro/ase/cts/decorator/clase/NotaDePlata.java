package ro.ase.cts.decorator.clase;

public class NotaDePlata implements NotaDePlataAbstract {
    private float suma;
    private String data;

    public NotaDePlata(String data, float suma) {
        this.data = data;
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("La data de " + this.data + " a fost platita suma de " + this.suma + " RON");
    }
}
