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

class MarkdownTest
{
    @Test
    @DisplayName("GIVEN you need a proper Markdown WHEN creating a new instance THEN you receive a proper Markdown")
    void testMarkdownConstructor()
    {
        final Markdown markdown = new Markdown("testMarkdown");
        assertEquals("testMarkdown", markdown.markdownField);
    }

    @Test
    @DisplayName("GIVEN a Markdown WHEN converting to Json THEN you receive a JsonResponseDocument")
    public void testConversionFromMarkdownToJson()
    {
        final Markdown markdown = new Markdown("Html Test");
        final JsonResponseDocument responseDocument = markdown.convert(new JsonConverter());
        assertThat(responseDocument, instanceOf(JsonResponseDocument.class));
    }

    @Test
    @DisplayName("GIVEN a Markdown WHEN converting to Xml THEN you receive a XmlResponseDocument")
    public void testConversionFromMarkdownToXml()
    {
        final Markdown markdown = new Markdown("Html Test");
        final XmlResponseDocument responseDocument = markdown.convert(new XmlConverter());
        assertThat(responseDocument, instanceOf(XmlResponseDocument.class));
    }
}
