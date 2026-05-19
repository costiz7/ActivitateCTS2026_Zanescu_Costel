package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlataAbstract;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlataAbstract) {
        this.notaDePlataAbstract = notaDePlataAbstract;
    }

    @Override
    public void printeaza() {
        notaDePlataAbstract.printeaza();
    }

    public abstract void printeazaFelicitare();
}
