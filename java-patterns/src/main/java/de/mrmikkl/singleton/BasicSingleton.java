package de.mrmikkl.singleton;

/**
 * Standard pattern to create a Singleton.
 */
public class BasicSingleton
{
    private static final BasicSingleton instance = new BasicSingleton();

    private BasicSingleton()
    {
    }

    public static BasicSingleton instance()
    {
        return instance;
    }
}
