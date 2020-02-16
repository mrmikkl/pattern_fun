package de.mrmikkl.singleton;

import java.io.Serializable;

/**
 * The implementation of readResolve is important to ensure that after deserialization, when a new
 * instance of this Singleton is created, the instances of the pre-serialization and after-deserialization
 * Singleton are the same (see hashcode method, which prints different values when readResolve-method
 * is missing).
 */
public class SerializedSingleton implements Serializable
{
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton()
    {
    }

    private static class InstanceHolder
    {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton instance()
    {
        return InstanceHolder.instance;
    }

    protected Object readResolve()
    {
        return instance();
    }
}
