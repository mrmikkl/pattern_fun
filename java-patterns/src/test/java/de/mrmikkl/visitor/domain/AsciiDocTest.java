package de.mrmikkl.visitor.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AsciiDocTest
{
    @Test
    @DisplayName("GIVEN you need a proper AsciiDoc WHEN creating a new instance THEN you receive a proper AsciiDoc")
    void testAsciiDocConstructor()
    {
        final AsciiDoc asciiDoc = new AsciiDoc("testAsciiDoc");
        assertEquals("testAsciiDoc", asciiDoc.asciiDocField);
    }
}
