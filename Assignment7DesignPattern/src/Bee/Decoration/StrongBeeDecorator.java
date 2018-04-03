package Bee.Decoration;

import Bee.Species.Bee;

/**
 * StrongBee decoration given to a bee. Example of the DECORATOR pattern. Increases a bee's attack power to 5.
 *
 * @author Bailey Garner
 */

public class StrongBeeDecorator extends BeeDecorator {

    public StrongBeeDecorator(Bee decoratedBee) {
        super(decoratedBee);
    }

    @Override
    public void setAbility() {
        attackPower = 5;


    }

}
