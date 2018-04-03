package Resource;

/**
 * The classes in this package implement the AbstractFactory design pattern. The AbstractFactory decides which
 * type of resource to build based on the type of resource passed to getResource.
 */
public abstract class AbstractFactory {

    public abstract Resource getResource(String resource);
}
