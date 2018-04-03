package Resource;

/**
 * A basic implementation of a type of Resource that could be built by the resource factory - a warrior bee.
 *
 * @author Bailey Garner
 */

public class Warrior implements Resource {

    int quantity;

    @Override
    public void defineResource() {
        quantity = 1;
    }
}
