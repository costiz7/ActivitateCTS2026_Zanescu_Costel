package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

public class NotaDePlataPrintatNoulAn extends NotaDePlataDecorator{

    public NotaDePlataPrintatNoulAn(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("E ziua ta, ziua ta, ziua taAAaa. Eu iti ofer, dragostea, dragosteaa... ESTE ZIUA TA!");
    }
}
