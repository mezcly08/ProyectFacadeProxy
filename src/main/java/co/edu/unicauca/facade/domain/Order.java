/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unicauca.facade.domain;

import co.edu.unicauca.facade.doma.State;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jesus Edwin Adrada Ruiz cod: 104617020514
 */
public class Order {
    
    public int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> details;

    public Order(Customer customer) {
        this.customer = customer;
        details = new ArrayList();
    }

    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Item> getDetails() {
        return details;
    }

    public void setDetails(List<Item> details) {
        this.details = details;
    }
    
    public void addDish(Dish dish, int amount){
        this.details.add(new Item(dish, amount));
    }
    
    public int calculateTotal(){
        int result = 0;
        for(Item temp:details){
            result = temp.getDish().getPrice() + result;
        }
        return result;
    }

}
