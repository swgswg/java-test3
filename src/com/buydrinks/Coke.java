package com.buydrinks;

public class Coke extends AbstractDrink
{
    public Coke()
    {
        super("可乐");
    }

    /**
     * 可乐的种类
     */
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void show() {
        System.out.println("您购买饮料的信息如下: ");
        System.out.println("名称: " + this.name);
        System.out.println("种类: " + this.type);
    }
}
