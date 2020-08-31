package com.compute;

public class Sub implements ComputerInterface
{
    @Override
    final public int computer(int m, int n)
    {
        return m - n;
    }
}
