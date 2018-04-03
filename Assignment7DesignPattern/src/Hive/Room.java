package Hive;

import Bee.Decoration.BeeDecorator;
import Bee.Decoration.FertileBeeDecorator;
import Bee.Decoration.HarvestBeeDecorator;
import Bee.Decoration.StrongBeeDecorator;
import Bee.Species.*;

import java.util.ArrayList;

/**
 * The Room class is an implementation of the BUILDER pattern. Instead of a public constructor, it uses a private
 * construction that takes as a paramater a RoomBuilder object. The static RoomBuilder class handles the building
 * of the object and returns a Room object using its build() method.
 *
 * @author Bailey Garner
 */

public class Room {
    private int roomSize;
    private ArrayList<Bee> bees;

    private Room(RoomBuilder builder) {
        this.roomSize = builder.roomSize;
        this.bees = builder.bees;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public ArrayList<Bee> getBees() {
        return bees;
    }

    /**
     * Static BUILDER class that creates the Room object.
     *
     * @author Bailey Garner
     */

    public static class RoomBuilder {
        private int roomSize;
        private ArrayList<Bee> bees;

        public RoomBuilder(int roomSize) {
            this.roomSize = roomSize;
            this.bees = new ArrayList<Bee>();
        }

        public RoomBuilder addBees(String species) {
            switch (species.toLowerCase()) {
                case "killer":
                    for (int i = 0; i < roomSize - 1; i++) {
                        this.bees.add(new StrongBeeDecorator(new BeeBase()));
                    }
                    break;
                case "honey":
                    for (int i = 0; i < roomSize - 1; i++) {
                        this.bees.add(new HarvestBeeDecorator(new BeeBase()));
                    }
                    break;
                default:
                    for (int i = 0; i < roomSize - 1; i++) {
                        this.bees.add(new BeeBase());
                    }
            }

            this.bees.add(new FertileBeeDecorator(new BeeBase()));

            return this;
        }

        public Room build() {
            return new Room(this);
        }

    }
}
