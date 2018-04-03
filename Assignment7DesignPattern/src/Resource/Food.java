package Resource;

/**
 * Basic implementation of a type of resource that the resource factory can build - food.
 */

public class Food implements Resource {

    int quantity;

    @Override
    public void defineResource() {
        quantity = 100;

    }
}
