package Simulation;

/**
 * The Apiary class is built using the SINGLETON design pattern. It handles the creation of the Apiary.
 *
 * @author Bailey Garner
 */

public final class Apiary {
    private static final Apiary apiaryInstance = new Apiary();
    private int numHives = 0;

    private Apiary() {}

    public static Apiary getApiaryInstance() {
        return apiaryInstance;
    }

    public void spawnBeehive(int x, int y, String species) {

        numHives++;


        System.out.printf("Beehive spawned at %d, %d identified as beehive number %d of species %s", x, y, numHives, species);
    }

    public int getNumHives() {
        return numHives;
    }





}
