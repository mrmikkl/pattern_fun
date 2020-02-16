package de.mrmikkl.singleton;

/**
 * As basic Singleton, but the static code is executed once the classloader loads this class.
 * More efficient is to use LazySingleton.
 */
public class StaticBlockSingleton
{
    private static StaticBlockSingleton instance;

    static
    {
        instance = new StaticBlockSingleton();
    }

    private StaticBlockSingleton()
    {
    }

    public static StaticBlockSingleton instance()
    {
        return instance;
    }
}
