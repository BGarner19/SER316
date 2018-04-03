package Bee.Species;

public class KillerBee extends BeeBase implements Bee {

    @Override
    public void setAbility() {
        ability = "Strong";
        attackPower = 5;
        workSpeed = 1;
        fertility = 0;

    }

}
