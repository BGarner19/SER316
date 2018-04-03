package Bee.Decoration;

import Bee.Species.Bee;

/**
 * The BeeDecorator class and its extensions are built using the DECORATOR pattern, where a basic bee can be
 * decorated to have higher attack power, fertility, or workSpeed depending on the type of bee.
 *
 * @author Bailey Garner
 */

public abstract class BeeDecorator implements Bee {

    Bee beeToBeDecorated;
    int attackPower = 0;
    int fertility = 0;
    int workSpeed = 0;

    public BeeDecorator(Bee beeToBeDecorated) {
        this.beeToBeDecorated = beeToBeDecorated;
    }

    @Override
    public void setAbility() {
        beeToBeDecorated.setAbility();
    }


}
