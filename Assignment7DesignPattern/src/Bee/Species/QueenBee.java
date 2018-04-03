package Bee.Species;

public class QueenBee extends BeeBase implements Bee {

    @Override
    public void setAbility() {
        ability = "Fertile";
        fertility = 5;
        workSpeed = 0;
        attackPower = 0;

    }
}
