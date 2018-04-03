package Bee.Decoration;

import Bee.Species.Bee;

public class HarvestBeeDecorator extends BeeDecorator {

    public HarvestBeeDecorator(Bee decoratedBee) {
        super(decoratedBee);
    }

    @Override
    public void setAbility() {
        beeToBeDecorated.setAbility();
    }


}
