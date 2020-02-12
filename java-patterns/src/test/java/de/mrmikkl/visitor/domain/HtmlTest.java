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

class HtmlTest
{
    @Test
    @DisplayName("GIVEN you need a proper Html WHEN creating a new instance THEN you receive a proper Html")
    void testHtmlConstructor()
    {
        final Html html = new Html("testHtml");
        assertEquals("testHtml", html.htmlField);
    }

    @Test
    @DisplayName("GIVEN a Html WHEN converting to Json THEN you receive a JsonResponseDocument")
    public void testConversionFromHtmlToJson()
    {
        final Html html = new Html("Html Test");
        final JsonResponseDocument responseDocument = html.convert(new JsonConverter());
        assertThat(responseDocument, instanceOf(JsonResponseDocument.class));
    }

    @Test
    @DisplayName("GIVEN a Html WHEN converting to Xml THEN you receive a XmlResponseDocument")
    public void testConversionFromHtmlToXml()
    {
        final Html html = new Html("Html Test");
        final XmlResponseDocument responseDocument = html.convert(new XmlConverter());
        assertThat(responseDocument, instanceOf(XmlResponseDocument.class));
    }
}
