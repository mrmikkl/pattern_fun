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

@DisplayName("Document: Html")
class HtmlTest
{
    @Nested
    @DisplayName("GIVEN new instance needed")
    public class InstantiatingHtml
    {
        @Test
        @DisplayName("WHEN calling the constructor THEN you receive a proper Html")
        void testHtmlConstructor()
        {
            final Html html = new Html("testHtml");
            assertEquals("testHtml", html.htmlField);
        }
    }

    @Nested
    @DisplayName("GIVEN Html exists")
    public class ConvertHtml
    {
        private Html html;

        @BeforeEach
        void setup()
        {
            html = new Html("Html Test");
        }

        @Test
        @DisplayName("WHEN converting to Json THEN you receive a JsonResponseDocument")
        public void testConversionFromHtmlToJson()
        {
            final JsonResponseDocument responseDocument = html.convert(new JsonConverter());
            assertThat(responseDocument, instanceOf(JsonResponseDocument.class));
        }

        @Test
        @DisplayName("WHEN converting to Xml THEN you receive a XmlResponseDocument")
        public void testConversionFromHtmlToXml()
        {
            final XmlResponseDocument responseDocument = html.convert(new XmlConverter());
            assertThat(responseDocument, instanceOf(XmlResponseDocument.class));
        }
    }
}
