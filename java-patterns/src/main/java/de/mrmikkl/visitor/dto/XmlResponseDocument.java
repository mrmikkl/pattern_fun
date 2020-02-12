package de.mrmikkl.visitor.dto;

public class XmlResponseDocument implements ResponseDocument
{
    private String xmlField;

    public XmlResponseDocument(final String pXmlField)
    {
        xmlField = pXmlField;
    }

    public String xmlField()
    {
        return xmlField;
    }
}
