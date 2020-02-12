package de.mrmikkl.factory.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class RectangleTest
{
    @Test
    void testMockedDraw()
    {
        final Rectangle rectangle = mock(Rectangle.class);
        rectangle.draw();
        verify(rectangle, times(1)).draw();
    }

    @Test
    void testDraw()
    {
        final Rectangle rectangle = new Rectangle();
        assertEquals(0, rectangle.state());
        rectangle.draw();
        assertEquals(1, rectangle.state());
    }
}
