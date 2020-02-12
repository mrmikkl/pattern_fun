package de.mrmikkl.visitor.domain;

import de.mrmikkl.visitor.dto.ResponseDocument;
import de.mrmikkl.visitor.visitor.Converter;

public interface Document
{
    <T extends ResponseDocument> T convert(Converter<T> pConverter);
}
