package Bee.Decoration;

import Bee.Species.Bee;

/**
 * Harvest ability given to a bee, increasing workSpeed to 5. Example of the DECORATOR pattern.
 */

public class HarvestBeeDecorator extends BeeDecorator {

    public HarvestBeeDecorator(Bee decoratedBee) {
        super(decoratedBee);
    }

    @Override
    public void setAbility() {
        beeToBeDecorated.setAbility();
        workSpeed = 5;
    }


}
