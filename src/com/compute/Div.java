package com.compute;

public class Div implements ComputerInterface
{
    @Override
    final public int computer(int m, int n)
    {
        return m / n;
    }
}
