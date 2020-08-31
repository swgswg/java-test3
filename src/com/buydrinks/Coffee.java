package com.buydrinks;

/**
 * @author song
 */
public class Coffee extends AbstractDrink
{
    public Coffee()
    {
        super("咖啡");
    }

    /**
     * 饮料的配料
     */
    private String ingredient;

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public void show() {
        System.out.println("名称:" + this.name);
        System.out.println("配料:" + this.ingredient);
    }

}
