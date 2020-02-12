package de.mrmikkl.visitor.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HtmlTest
{
    @Test
    @DisplayName("GIVEN you need a proper Html WHEN creating a new instance THEN you receive a proper Html")
    void testHtmlConstructor()
    {
        final Html html = new Html("testHtml");
        assertEquals("testHtml", html.htmlField);
    }
}
