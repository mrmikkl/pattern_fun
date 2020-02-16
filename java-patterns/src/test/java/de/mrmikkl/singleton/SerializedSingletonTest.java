package de.mrmikkl.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.Test;

class SerializedSingletonTest
{
    @Test
    void testSerialization()
    {
        try (
                ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
                ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser")))
        {
            // serailize from object to file
            SerializedSingleton instanceOne = SerializedSingleton.instance();
            out.writeObject(instanceOne);

            // deserailize from file to object
            SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();

            System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
            System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
        }
        catch (IOException | ClassNotFoundException pE)
        {
            pE.printStackTrace();
        }
    }
}
