package com.buydrinks;

/**
 * @author song
 */
abstract public class AbstractDrink
{
    /**
     * 饮料的名称
     */
    public String name;

    public AbstractDrink(String name)
    {
        this.name = name;
    }

    /**
     * 显示饮料信息的方法
     */
    abstract public void show();
}
