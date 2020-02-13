package de.mrmikkl.visitor.domain;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import de.mrmikkl.visitor.dto.JsonResponseDocument;
import de.mrmikkl.visitor.dto.XmlResponseDocument;
import de.mrmikkl.visitor.visitor.JsonConverter;
import de.mrmikkl.visitor.visitor.XmlConverter;

@DisplayName("Document: AsciiDoc")
class AsciiDocTest
{
    @Nested
    @DisplayName("GIVEN new instance needed")
    public class InstantiatingHtml
    {
        @Test
        @DisplayName("WHEN calling the constructor THEN you receive a proper AsciiDoc")
        void testAsciiDocConstructor()
        {
            final AsciiDoc asciiDoc = new AsciiDoc("testAsciiDoc");
            assertEquals("testAsciiDoc", asciiDoc.asciiDocField);
        }
    }

    @Nested
    @DisplayName("GIVEN AsciiDoc exists")
    public class ConvertAsciiDoc
    {
        private AsciiDoc asciiDoc;

        @BeforeEach
        void setup()
        {
            asciiDoc = new AsciiDoc("AsciiDoc Test");
        }

        @Test
        @DisplayName("WHEN converting to Json THEN you receive a JsonResponseDocument")
        public void testConversionFromAsciiDocToJson()
        {
            final JsonResponseDocument responseDocument = this.asciiDoc.convert(new JsonConverter());
            assertThat(responseDocument, instanceOf(JsonResponseDocument.class));
        }

        @Test
        @DisplayName("WHEN converting to Xml THEN you receive a XmlResponseDocument")
        public void testConversionFromAsciiDocToXml()
        {
            final XmlResponseDocument responseDocument = this.asciiDoc.convert(new XmlConverter());
            assertThat(responseDocument, instanceOf(XmlResponseDocument.class));
        }
    }
}
