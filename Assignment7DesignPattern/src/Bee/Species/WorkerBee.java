package Bee.Species;

public class WorkerBee extends BeeBase implements Bee  {

    @Override
    public void setAbility() {
        ability = "Harvest";
        workSpeed = 5;
        fertility = 1;
        attackPower = 0;
    }
}
