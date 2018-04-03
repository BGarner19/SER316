package Bee.Decoration;

import Bee.Species.Bee;

public class FertileBeeDecorator extends BeeDecorator {

    public FertileBeeDecorator(Bee decoratedBee) {
        super(decoratedBee);
    }

    @Override
    public void setAbility() {
        beeToBeDecorated.setAbility();
    }
}
