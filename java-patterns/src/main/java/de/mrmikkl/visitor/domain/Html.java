package de.mrmikkl.visitor.domain;

import de.mrmikkl.visitor.dto.ResponseDocument;
import de.mrmikkl.visitor.visitor.Converter;

public class Html implements Document
{
    public String htmlField;

    public Html(final String pHtmlField)
    {
        htmlField = pHtmlField;
    }

    public <T extends ResponseDocument> T convert(final Converter<T> pConverter)
    {
        return pConverter.convert(this);
    }
}
