package com.buydrinks;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class DrinkTest {
    //键盘扫描器
    static Scanner in = new Scanner(System.in);
    static String gogo;

    public static void main(String[] args) {
        do {
            //提示语
            System.out.println("~~~~~~~~~~~~自动售水机欢迎您~~~~~~~~~~~~");
            System.out.println("请选择购买的饮料: 1.咖啡  2.可乐  3.矿泉水 ");

            //接收用户输入的信息
            int drink = in.nextInt();
            String drinkStr = "未选择配料";
            switch (drink) {
                case 1: drinkStr = "Coffee";
                    System.out.println("是否需要添加配料: 1.加糖  2.加奶");
                    break;
                case 2: drinkStr = "Coke";
                    System.out.println("请选择可乐的种类: 1.可口可乐  2.百事可乐");
                    break;
                case 3: drinkStr = "Water";
                    break;
                default: System.out.println("您未选择!");
            }

            if (drink == 1 || drink == 2 || drink == 3) {
                AbstractDrink abstractDrink = newDrink(drinkStr);

                if (drink == 1) {
                    int attr = in.nextInt();
                    String attrStr = null;
                    if(attr == 1){
                        attrStr = "加糖";
                    } else if (attr == 2) {
                        attrStr = "加奶";
                    }
                    setCoffeeAttr((Coffee) abstractDrink, attrStr);
                } else if (drink == 2) {
                    int attr = in.nextInt();
                    String attrStr = null;
                    if(attr == 1){
                        attrStr = "可口可乐";
                    } else if (attr == 2) {
                        attrStr = "百世可乐";
                    }
                    setCokeAttr((Coke) abstractDrink, attrStr);
                } else {
                    setWaterAttr((Water) abstractDrink, "");
                }
                abstractDrink.show();
            }

            System.out.println("请问您是否继续购买: y or n");
            //使用jixu变量来接收用户输入的是否是y
            gogo = in.next();
            //如果输入的是y执行,否则执行
            if (gogo.equals("y")) {
                System.out.println("请继续操作......");
            } else {
                System.out.println("谢谢使用.....");
            }
        } while ("y".equals(gogo));
    }


    /**
     * 实例化饮料
     * @param drink
     * @return
     */
    public static AbstractDrink newDrink(String drink)
    {
        AbstractDrink instance = null;
        try {
            instance = (AbstractDrink) Class.forName("com.buydrinks." + drink).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return instance;
    }


    public static Coffee setCoffeeAttr(Coffee coffee, String attr)
    {
        coffee.setIngredient(attr);
        return coffee;
    }


    public static Coke setCokeAttr(Coke coke, String attr)
    {
        coke.setType(attr);
        return coke;
    }


    public static Water setWaterAttr(Water water, String attr)
    {
        return water;
    }


    public static void show(AbstractDrink drink)
    {
        drink.show();
    }

}
