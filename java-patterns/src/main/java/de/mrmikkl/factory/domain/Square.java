package de.mrmikkl.factory.domain;

public class Square implements Shape
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
