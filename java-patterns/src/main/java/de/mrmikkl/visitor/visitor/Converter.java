package de.mrmikkl.visitor.visitor;

import de.mrmikkl.visitor.domain.AsciiDoc;
import de.mrmikkl.visitor.domain.Html;
import de.mrmikkl.visitor.domain.Markdown;
import de.mrmikkl.visitor.dto.ResponseDocument;

public interface Converter<TResponseDocument extends ResponseDocument>
{
    TResponseDocument convert(Markdown pMarkdown);

    TResponseDocument convert(Html pHtml);

    TResponseDocument convert(AsciiDoc pAsciiDoc);
}
