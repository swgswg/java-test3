package com.buydrinks;

public class Water extends AbstractDrink
{
    public Water()
    {
        super("矿泉水");
    }

    @Override
    public void show() {
        System.out.println("您要购买的信息如下:");
        System.out.println("名称: " + this.name);
    }

}
