package Bee.Decoration;

import Bee.Species.Bee;

public class StrongBeeDecorator extends BeeDecorator {

    public StrongBeeDecorator(Bee decoratedBee) {
        super(decoratedBee);
    }

    @Override
    public void setAbility() {
        beeToBeDecorated.setAbility();
    }

}
