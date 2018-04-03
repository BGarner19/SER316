package Hive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import Bee.Species.Bee;
import Resource.*;

/**
 * This is the Beehive class. The beehive class is an example of the use of the BUILDER pattern as seen in the way
 * that rooms are added to the beehive. The addRoom() method calls a build function to build rooms. Implementation
 * of BUILDER pattern can bee seen in the Room class.
 *
 * A Beehive is built with a number of rooms that increases as ticks occur. A beehive can only hold a specific species
 * of bee.
 *
 * @author Bailey Garner
 */

public class Beehive {

    private int xLocation;
    private int yLocation;
    private String species;
    private int numBees;
    private ArrayList<Room> rooms;
    private int ticksAlive;
    private Map<String, ArrayList<Resource>> resources;


    public Beehive(int xLocation, int yLocation, String species) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.species = species;
        this.rooms = new ArrayList<Room>();
        this.resources = new HashMap<String, ArrayList<Resource>>();
    }

    public void addRoom() {
        rooms.add(new Room.RoomBuilder(10).addBees(species).build());
        numBees += rooms.get(rooms.size() - 1).getBees().size();
    }

    public void tick(int ticks) {
        ticksAlive += ticks;
        for (int i = 0; i < ticks; i++) {
            int index = new Random().nextInt(rooms.size());

            for (Bee bee : rooms.get(index).getBees()) {
                //Perform tick action
            }
        }

        while (ticksAlive / 50 > rooms.size()) {
            addRoom();
        }

    }

    public void receiveResources(String resourceType) {
        AbstractFactory resourceFactory = FactoryProducer.getFactory("Resource");
        Resource resource = resourceFactory.getResource(resourceType);

        resource.defineResource();
        if (resources.containsKey(resourceType)) {
            resources.get(resourceType).add(resource);

        }
        else {
            resources.put(resourceType, new ArrayList<>()).add(resource);
        }
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public int getNumBees() {
        return numBees;
    }

    public int getTicksAlive() {
        return ticksAlive;
    }

    public String getSpecies() {
        return species;
    }

    public int getFood() {
        return resources.get("food").size()*100;
    }

    public int getWarriors() {
        return resources.get("warrior").size();
    }




}
