package de.mrmikkl.visitor.domain;

import de.mrmikkl.visitor.dto.ResponseDocument;
import de.mrmikkl.visitor.visitor.Converter;

public class Markdown implements Document
{
    public String markdownField;

    public Markdown(final String pMarkdownField)
    {
        markdownField = pMarkdownField;
    }

    public <T extends ResponseDocument> T convert(final Converter<T> pConverter)
    {
        return pConverter.convert(this);
    }
}
