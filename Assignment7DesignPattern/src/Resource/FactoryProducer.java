package Resource;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Resource")) {
            return new ResourceFactory();
        }

        return null;
    }
}
