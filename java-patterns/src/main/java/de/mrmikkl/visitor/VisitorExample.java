package de.mrmikkl.visitor;

import de.mrmikkl.visitor.domain.AsciiDoc;
import de.mrmikkl.visitor.dto.JsonResponseDocument;
import de.mrmikkl.visitor.visitor.JsonConverter;

public class VisitorExample
{
    public static void main(String[] args)
    {
        final AsciiDoc asciiDoc = new AsciiDoc("Ascii Info");
        final JsonResponseDocument convert = asciiDoc.convert(new JsonConverter());
        System.out.println("Convert Result: " + convert.jsonField());
    }
}
