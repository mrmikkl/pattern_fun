package de.mrmikkl.visitor.visitor;

import de.mrmikkl.visitor.domain.AsciiDoc;
import de.mrmikkl.visitor.domain.Html;
import de.mrmikkl.visitor.domain.Markdown;
import de.mrmikkl.visitor.dto.JsonResponseDocument;

public class JsonConverter implements Converter<JsonResponseDocument>
{
    public JsonResponseDocument convert(final Markdown pMarkdown)
    {
        return new JsonResponseDocument(pMarkdown.markdownField);
    }

    public JsonResponseDocument convert(final Html pHtml)
    {
        return new JsonResponseDocument(pHtml.htmlField);
    }

    public JsonResponseDocument convert(final AsciiDoc pAsciiDoc)
    {
        return new JsonResponseDocument(pAsciiDoc.asciiDocField);
    }
}
