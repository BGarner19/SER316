package Resource;

/**
 * Uses the ABSTRACTFACTORY design pattern to build a Resource Factory that decides which type of resource to
 * build and return.
 *
 * @author Bailey Garner
 */

public class ResourceFactory extends AbstractFactory {

    @Override
    public Resource getResource(String resource) {

        if (resource == null) {
            return null;
        }

        if (resource.equalsIgnoreCase("food")) {
            return new Food();
        }
        else if (resource.equalsIgnoreCase("warrior")) {
            return new Warrior();
        }

        return null;
    }
}
