package Bee.Species;

import java.util.ArrayList;

/**
 * Implementation of the Bee interface. The basic bee with no attributes, ready to be decorated.
 */

public class BeeBase implements Bee {

    public ArrayList<String> abilities;
    public int attackPower = 0;
    public int fertility = 0;
    public int workSpeed = 0;

    @Override
    public void setAbility() {}

    public void tickAction() {}

}
