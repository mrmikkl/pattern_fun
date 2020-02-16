package de.mrmikkl.singleton;

/**
 * Best practice for creating a Singleton.
 * <p>
 * Works with lots of threads.
 * Doesn't need synchronization.
 */
public class BillPughSingleton
{
    private BillPughSingleton()
    {
    }

    private static class InstanceHolder
    {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton instance()
    {
        return InstanceHolder.INSTANCE;
    }
}
