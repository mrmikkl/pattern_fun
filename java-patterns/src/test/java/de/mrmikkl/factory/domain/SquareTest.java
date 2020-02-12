package de.mrmikkl.factory.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class SquareTest
{
    @Test
    void testMockedDraw()
    {
        final Square square = mock(Square.class);
        square.draw();
        verify(square, times(1)).draw();
    }

    @Test
    void testDraw()
    {
        final Square square = new Square();
        assertEquals(0, square.state());
        square.draw();
        assertEquals(1, square.state());
    }
}
