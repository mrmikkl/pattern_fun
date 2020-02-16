package de.mrmikkl.singleton;

import java.util.Objects;

/**
 * Allows Singletons in multi-thread environment.
 * Has problems when lots of threads try to call the instance method the same time.
 * For that have a look at BillPughSingleton.
 */
public class ThreadSafeSingleton
{
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton()
    {
    }

    /**
     * Takes more time of course then basic Singleton.
     * Can be improved with double locking.
     */
    public static synchronized ThreadSafeSingleton instance()
    {
        if (Objects.isNull(instance))
        {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * A bit more efficient than the synchronized at method level, that
     * immediately blocks the threads.
     */
    public static ThreadSafeSingleton instanceUsingDoubleLocking()
    {
        if (instance == null)
        {
            synchronized (ThreadSafeSingleton.class)
            {
                if (instance == null)
                {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
