package de.mrmikkl.visitor.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MarkdownTest
{
    @Test
    @DisplayName("GIVEN you need a proper Markdown WHEN creating a new instance THEN you receive a proper Markdown")
    void testMarkdownConstructor()
    {
        final Markdown markdown = new Markdown("testMarkdown");
        assertEquals("testMarkdown", markdown.markdownField);
    }
}
