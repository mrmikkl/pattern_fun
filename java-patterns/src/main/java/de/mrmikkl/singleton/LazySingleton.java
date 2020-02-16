package de.mrmikkl.singleton;

import java.util.Objects;

/**
 * As basic Singleton, but initializes the instance only once the instance()-method is called.
 * Nice in a 1-thread environment.
 * If you have lots of threads look at ThreadSafeSingleton.
 */
public class LazySingleton
{
    private static LazySingleton instance;

    private LazySingleton()
    {
    }

    public static LazySingleton instance()
    {
        if (Objects.isNull(instance))
        {
            instance = new LazySingleton();
        }
        return instance;
    }
}
