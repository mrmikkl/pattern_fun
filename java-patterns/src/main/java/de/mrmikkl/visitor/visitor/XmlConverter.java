package de.mrmikkl.visitor.visitor;

import de.mrmikkl.visitor.domain.AsciiDoc;
import de.mrmikkl.visitor.domain.Html;
import de.mrmikkl.visitor.domain.Markdown;
import de.mrmikkl.visitor.dto.XmlResponseDocument;

public class XmlConverter implements Converter<XmlResponseDocument>
{
    public XmlResponseDocument convert(final Markdown pMarkdown)
    {
        return new XmlResponseDocument(pMarkdown.markdownField);
    }

    public XmlResponseDocument convert(final Html pHtml)
    {
        return new XmlResponseDocument(pHtml.htmlField);
    }

    public XmlResponseDocument convert(final AsciiDoc pAsciiDoc)
    {
        return new XmlResponseDocument(pAsciiDoc.asciiDocField);
    }
}
