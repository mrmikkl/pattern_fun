package de.mrmikkl.factory.domain;

public class Rectangle implements Shape
{
    private int state = 0;

    public void draw()
    {
        state++;
    }

    public int state()
    {
        return state;
    }
}
