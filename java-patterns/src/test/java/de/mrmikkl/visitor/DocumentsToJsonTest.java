package de.mrmikkl.visitor;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.mrmikkl.visitor.domain.AsciiDoc;
import de.mrmikkl.visitor.domain.Html;
import de.mrmikkl.visitor.domain.Markdown;
import de.mrmikkl.visitor.dto.JsonResponseDocument;
import de.mrmikkl.visitor.visitor.JsonConverter;

public class DocumentsToJsonTest
{
    @Test
    @DisplayName("GIVEN a AsciiDoc WHEN converting to Json THEN you receive a JsonResponseDocument")
    public void testConversionFromAsciiDocToJson()
    {
        final AsciiDoc asciiDoc = new AsciiDoc("AsciiDoc Test");
        final JsonResponseDocument responseDocument = asciiDoc.convert(new JsonConverter());
        assertThat(responseDocument, instanceOf(JsonResponseDocument.class));
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
    @DisplayName("GIVEN a Markdown WHEN converting to Json THEN you receive a JsonResponseDocument")
    public void testConversionFromMarkdownToJson()
    {
        final Markdown markdown = new Markdown("Html Test");
        final JsonResponseDocument responseDocument = markdown.convert(new JsonConverter());
        assertThat(responseDocument, instanceOf(JsonResponseDocument.class));
    }
}
