/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unicauca.facade.domain;

import co.edu.unicauca.facade.domain.order.State;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Eliana Andrea Araujo Camayo  cod: 104616021725
 * @author Jesus Edwin Adrada Ruiz  cod: 104617020514
 * @author Carlos Enrique Hoyos Joiro  cod: 104617020768
 */
public class Order {
    
    /**
     *
     */
    public int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> details;

    /**
     *
     * @param customer
     */
    public Order(Customer customer) {
        this.customer = customer;
        details = new ArrayList();
    }

    /**
     *
     * @return
     */
    public int getDespatch() {
        return despatch;
    }

    /**
     *
     * @param despatch
     */
    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    /**
     *
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     *
     * @return
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public State getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     *
     * @return
     */
    public List<Item> getDetails() {
        return details;
    }

    /**
     *
     * @param details
     */
    public void setDetails(List<Item> details) {
        this.details = details;
    }
    
    /**
     *
     * @param dish
     * @param amount
     */
    public void addDish(Dish dish, int amount){
        this.details.add(new Item(dish, amount));
    }
    
    /**
     *
     * @return
     */
    public int calculateTotal(){
        int result = 0;
        for(Item temp:details){
            for(int i = 0;i < temp.getAmount();i++)
                result = temp.getDish().getPrice() + result;
        }
        return result;
    }

}
