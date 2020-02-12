package de.mrmikkl.visitor.domain;

import de.mrmikkl.visitor.dto.ResponseDocument;
import de.mrmikkl.visitor.visitor.Converter;

public class AsciiDoc implements Document
{
    public String asciiDocField;

    public AsciiDoc(final String pAsciiDocField)
    {
        asciiDocField = pAsciiDocField;
    }

    public <T extends ResponseDocument> T convert(final Converter<T> pConverter)
    {
        return pConverter.convert(this);
    }
}
