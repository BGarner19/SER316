package Bee.Decoration;

import Bee.Species.Bee;

/**
 * Fertile ability is added to a bee using this class. Increases their fertility value to 5. Example of the DECORATOR
 * pattern.
 *
 * @author Bailey Garner
 */
public class FertileBeeDecorator extends BeeDecorator {

    public FertileBeeDecorator(Bee decoratedBee) {
        super(decoratedBee);
    }

    @Override
    public void setAbility() {
        beeToBeDecorated.setAbility();
        fertility = 5;
    }
}
