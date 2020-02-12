package de.mrmikkl.factory.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class CircleTest
{
    @Test
    void testMockedDraw()
    {
        final Circle circle = mock(Circle.class);
        circle.draw();
        verify(circle, times(1)).draw();
    }

    @Test
    void testDraw()
    {
        final Circle circle = new Circle();
        assertEquals(0, circle.state());
        circle.draw();
        assertEquals(1, circle.state());
    }
}
