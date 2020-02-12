package de.mrmikkl.factory.factory;

import java.util.Objects;

import de.mrmikkl.factory.domain.Circle;
import de.mrmikkl.factory.domain.Rectangle;
import de.mrmikkl.factory.domain.Shape;
import de.mrmikkl.factory.domain.Square;

public class ShapeFactory
{
    public Shape shape(Class<? extends Shape> pClass) throws ShapeNotFoundException
    {
        if (Objects.nonNull(pClass))
        {
            if (Circle.class.isAssignableFrom(pClass))
            {
                return new Circle();
            }
            else if (Rectangle.class.isAssignableFrom(pClass))
            {
                return new Rectangle();
            }
            else if (Square.class.isAssignableFrom(pClass))
            {
                return new Square();
            }
        }

        throw new ShapeNotFoundException();
    }
}
