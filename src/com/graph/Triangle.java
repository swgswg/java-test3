package com.graph;


/**
 * 三角形
 */
public class Triangle implements GraphInterface
{
    public double a = 0;
    public double b = 0;
    public double c = 0;


    public Triangle(double a, double b, double c) throws Exception {
        if(a + b < c){
            throw new Exception("不满足三角形两边之和大于第三边");
        }
        if(a - b > c){
            throw new Exception("不满足三角形两边之差小于第三边");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter()
    {
        return this.a + this.b + this.c;
    }
}
