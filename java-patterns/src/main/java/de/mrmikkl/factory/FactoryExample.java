package de.mrmikkl.factory;

import de.mrmikkl.factory.domain.Circle;
import de.mrmikkl.factory.domain.Rectangle;
import de.mrmikkl.factory.domain.Shape;
import de.mrmikkl.factory.domain.Square;
import de.mrmikkl.factory.factory.ShapeFactory;

public class FactoryExample
{
    public static void main(String[] args)
    {
        final ShapeFactory factory = new ShapeFactory();

        final Shape shape1 = factory.shape(Circle.class);
        final Shape shape2 = factory.shape(Rectangle.class);
        final Shape shape3 = factory.shape(Square.class);
    }
}
