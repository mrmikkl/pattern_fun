package de.mrmikkl.visitor.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.mrmikkl.visitor.domain.AsciiDoc;
import de.mrmikkl.visitor.domain.Html;
import de.mrmikkl.visitor.domain.Markdown;
import de.mrmikkl.visitor.dto.XmlResponseDocument;

class XmlConverterTest
{
    private XmlConverter converter;

    @BeforeEach
    void provideConverter()
    {
        this.converter = new XmlConverter();
    }

    @Test
    @DisplayName("GIVEN a XmlConverter WHEN converting to Markdown THEN you receive a properly converted Json")
    void convertMarkdown()
    {
        final XmlResponseDocument json = this.converter.convert(new Markdown("testMarkdown"));
        assertEquals("testMarkdown", json.xmlField());
    }

    @Test
    @DisplayName("GIVEN a XmlConverter WHEN converting to Html THEN you receive a properly converted Json")
    void convertHtml()
    {
        final XmlResponseDocument json = this.converter.convert(new Html("testHtml"));
        assertEquals("testHtml", json.xmlField());
    }

    @Test
    @DisplayName("GIVEN a XmlConverter WHEN converting to AsciiDoc THEN you receive a properly converted Json")
    void convertAsciiDoc()
    {
        final XmlResponseDocument json = this.converter.convert(new AsciiDoc("testAsciiDoc"));
        assertEquals("testAsciiDoc", json.xmlField());
    }
}
