package Bee.Decoration;

import Bee.Species.Bee;

public abstract class BeeDecorator implements Bee {

    Bee beeToBeDecorated;

    public BeeDecorator(Bee beeToBeDecorated) {
        this.beeToBeDecorated = beeToBeDecorated;
    }


}
