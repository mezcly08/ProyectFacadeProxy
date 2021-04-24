/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unicauca.facade.domain;

/**
 * 
 * @author Jesus Edwin Adrada Ruiz cod: 104617020514
 */
public class Item {
    
    private Dish dish;
    private int amount;

    /**
     *
     */
    public Item() {
    }

    /**
     *
     * @param dish
     * @param amount
     */
    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }

    /**
     *
     * @return
     */
    public Dish getDish() {
        return dish;
    }

    /**
     *
     * @param dish
     */
    public void setDish(Dish dish) {
        this.dish = dish;
    }

    /**
     *
     * @return
     */
    public int getAmount() {
        return amount;
    }

    /**
     *
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    

}
