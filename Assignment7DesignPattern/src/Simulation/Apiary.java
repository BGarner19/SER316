package Simulation;

import Hive.Beehive;

import java.util.HashMap;
import java.util.Map;

/**
 * The Apiary class is built using the SINGLETON design pattern. It handles the creation of the Apiary. It contains
 * methods that are called by the runner to perform different actions required to control the Apiary.
 *
 * @author Bailey Garner
 */

public final class Apiary {
    private static final Apiary apiaryInstance = new Apiary();
    private int numHives = 0;
    private Map<Integer, Beehive> beehives = new HashMap<Integer, Beehive>();

    private Apiary() {
        spawnBeehive(0, 0, "Killer");
        spawnBeehive(100, 100, "Honey");
    }

    public static Apiary getApiaryInstance() {
        return apiaryInstance;
    }

    public void spawnBeehive(int x, int y, String species) {

        numHives++;
        Beehive newHive = new Beehive(x, y, species);
        newHive.addRoom();

        beehives.put(numHives, newHive);

        System.out.printf("\nBeehive spawned at %d, %d identified as beehive number %d of species %s", x, y, numHives, species);
    }

    public void summarize(int hive) {
        String species = beehives.get(hive).getSpecies();
        int ticksAlive = beehives.get(hive).getTicksAlive();
        int xLocation = beehives.get(hive).getxLocation();
        int yLocation = beehives.get(hive).getyLocation();
        int numBees = beehives.get(hive).getNumBees();


        System.out.printf("\n=Summary of Beehive %d=" +
                            "\nLocation: %d, %d" +
                            "\nSpecies: %s" +
                            "\nHive size (Number of bees): %d" +
                            "\nResources: %d Food, %d Warriors" +
                            "\nTicks alive: %d" , hive, xLocation, yLocation, species, numBees, 0, 0, ticksAlive);

    }

    public void updateTicks(int ticks) {
        for (int key : beehives.keySet()) {
            beehives.get(key).tick(ticks);
        }
    }

    public void updateTicks() {
        for (int key : beehives.keySet()) {
            beehives.get(key).tick(1);
        }
    }

    public void giveResource(int hive, String resourceType, int quantity) {
        //beehives.get(hive).receiveResources(resourceType);
    }

    public int getNumHives() {
        return numHives;
    }





}
