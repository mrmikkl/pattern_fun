package de.mrmikkl.visitor.domain;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.mrmikkl.visitor.dto.JsonResponseDocument;
import de.mrmikkl.visitor.dto.XmlResponseDocument;
import de.mrmikkl.visitor.visitor.JsonConverter;
import de.mrmikkl.visitor.visitor.XmlConverter;

class AsciiDocTest
{
    @Test
    @DisplayName("GIVEN you need a proper AsciiDoc WHEN creating a new instance THEN you receive a proper AsciiDoc")
    void testAsciiDocConstructor()
    {
        final AsciiDoc asciiDoc = new AsciiDoc("testAsciiDoc");
        assertEquals("testAsciiDoc", asciiDoc.asciiDocField);
    }

    @Test
    @DisplayName("GIVEN a AsciiDoc WHEN converting to Json THEN you receive a JsonResponseDocument")
    public void testConversionFromAsciiDocToJson()
    {
        final AsciiDoc asciiDoc = new AsciiDoc("AsciiDoc Test");
        final JsonResponseDocument responseDocument = asciiDoc.convert(new JsonConverter());
        assertThat(responseDocument, instanceOf(JsonResponseDocument.class));
    }

    @Test
    @DisplayName("GIVEN a AsciiDoc WHEN converting to Xml THEN you receive a XmlResponseDocument")
    public void testConversionFromAsciiDocToXml()
    {
        final AsciiDoc asciiDoc = new AsciiDoc("AsciiDoc Test");
        final XmlResponseDocument responseDocument = asciiDoc.convert(new XmlConverter());
        assertThat(responseDocument, instanceOf(XmlResponseDocument.class));
    }
}
