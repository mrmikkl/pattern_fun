package de.mrmikkl.factory.factory;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.mrmikkl.factory.domain.Circle;
import de.mrmikkl.factory.domain.Rectangle;
import de.mrmikkl.factory.domain.Shape;
import de.mrmikkl.factory.domain.Square;

class ShapeFactoryTest
{
    private ShapeFactory factory;

    @BeforeEach
    void setup()
    {
        this.factory = new ShapeFactory();
    }

    @Test
    @DisplayName("GIVEN a Factory WHEN Circle is created THEN Circle is not null")
    void testCreateCircleNotNull()
    {
        final Shape shape = factory.shape(Circle.class);
        Assertions.assertNotNull(shape);
    }

    @Test
    @DisplayName("GIVEN a Factory WHEN Circle is created THEN factory result is instance of Circle")
    void testCreateCircle()
    {
        final Shape shape = factory.shape(Circle.class);
        assertThat(shape, instanceOf(Circle.class));
    }

    @Test
    @DisplayName("GIVEN a Factory WHEN Rectangle is created THEN Rectangle is not null")
    void testCreateRectangleNotNull()
    {
        final Shape shape = factory.shape(Rectangle.class);
        Assertions.assertNotNull(shape);
    }

    @Test
    @DisplayName("GIVEN a Factory WHEN Rectangle is created THEN factory result is instance of Rectangle")
    void testCreateRectangle()
    {
        final Shape shape = factory.shape(Rectangle.class);
        assertThat(shape, instanceOf(Rectangle.class));
    }

    @Test
    @DisplayName("GIVEN a Factory WHEN Square is created THEN Square is not null")
    void testCreateSquareNotNull()
    {
        final Shape shape = factory.shape(Square.class);
        Assertions.assertNotNull(shape);
    }

    @Test
    @DisplayName("GIVEN a Factory WHEN Square is created THEN factory result is instance of Square")
    void testCreateSquare()
    {
        final Shape shape = factory.shape(Square.class);
        assertThat(shape, instanceOf(Square.class));
    }

    @Test
    @DisplayName("GIVEN a Factory WHEN trying to create with null THEN get an exception")
    void testCreateWithNullAsType()
    {
        assertThrows(ShapeNotFoundException.class, () -> factory.shape(null));
    }
}
