package de.mrmikkl.visitor.dto;

public class JsonResponseDocument implements ResponseDocument
{
    private String jsonField;

    public JsonResponseDocument(final String pField)
    {
        jsonField = pField;
    }

    public String jsonField()
    {
        return jsonField;
    }
}
