package de.mrmikkl.visitor;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.mrmikkl.visitor.domain.AsciiDoc;
import de.mrmikkl.visitor.domain.Html;
import de.mrmikkl.visitor.domain.Markdown;
import de.mrmikkl.visitor.dto.XmlResponseDocument;
import de.mrmikkl.visitor.visitor.XmlConverter;

public class DocumentsToXmlTest
{
    @Test
    @DisplayName("GIVEN a AsciiDoc WHEN converting to Xml THEN you receive a XmlResponseDocument")
    public void testConversionFromAsciiDocToXml()
    {
        final AsciiDoc asciiDoc = new AsciiDoc("AsciiDoc Test");
        final XmlResponseDocument responseDocument = asciiDoc.convert(new XmlConverter());
        assertThat(responseDocument, instanceOf(XmlResponseDocument.class));
    }

    @Test
    @DisplayName("GIVEN a Html WHEN converting to Xml THEN you receive a XmlResponseDocument")
    public void testConversionFromHtmlToXml()
    {
        final Html html = new Html("Html Test");
        final XmlResponseDocument responseDocument = html.convert(new XmlConverter());
        assertThat(responseDocument, instanceOf(XmlResponseDocument.class));
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
