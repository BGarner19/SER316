package Simulation;

/**
 * The Apiary class is built using the SINGLETON design pattern. It handles the creation of the Apiary.
 *
 * @author Bailey Garner
 */

public final class Apiary {
    private static final Apiary apiaryInstance = new Apiary();

    private Apiary() {}

    public static Apiary getApiaryInstance() {
        return apiaryInstance;
    }


}
