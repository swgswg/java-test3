package com.compute;

public class Test
{
    public static void main(String[] args){
        UseComputer usecomputer = new UseComputer();
        int add = usecomputer.useCom(new Add(), 10, 2);
        System.out.println("add: " + add);
        int sub = usecomputer.useCom(new Sub(), 10, 2);
        System.out.println("sub: " + sub);
        int mul = usecomputer.useCom(new Mul(), 10, 2);
        System.out.println("mul: " + mul);
        int div = usecomputer.useCom(new Div(), 10, 2);
        System.out.println("div: " + div);
    }
}
