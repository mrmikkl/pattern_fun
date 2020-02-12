package de.mrmikkl.factory.domain;

public class Circle implements Shape
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
