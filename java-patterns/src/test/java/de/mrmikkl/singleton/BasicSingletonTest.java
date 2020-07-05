package de.mrmikkl.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for BasicSingleton")
class BasicSingletonTest
{
    @Test
    @DisplayName("GIVEN one needs a Singleton WHEN get instance is called THEN one receives a Singleton")
    void testInstanceRetrieval()
    {
        Assertions.assertNotNull(BasicSingleton.instance());
    }
}
