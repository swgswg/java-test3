package com.graph;


/**
 * 圆形
 */
public class Circle implements GraphInterface
{
    public double radius = 0;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double perimeter()
    {
        return 2 * Math.PI * this.radius;
    }
}
