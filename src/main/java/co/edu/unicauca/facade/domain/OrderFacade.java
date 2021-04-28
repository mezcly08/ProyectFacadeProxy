/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unicauca.facade.domain;

import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.domain.Customer;
import co.edu.unicauca.facade.domain.Dish;
import co.edu.unicauca.facade.domain.Order;
import co.edu.unicauca.facade.domain.order.State;

/**
 * 
 * @author Jesus Edwin Adrada Ruiz cod: 104617020514
 */
public class OrderFacade {
    
    private Order order;
    
    /**
     *
     * @param customer
     */
    public void createOrder(Customer customer){
        if (order == null){
            order = new Order(customer);
            order.setState(State.NEW);
        }
    }
    
    /**
     *
     * @param dish
     * @param amount
     */
    public void addDish(Dish dish,int amount){
        order.addDish(dish, amount);
    }
    
    /**
     *
     * @param state
     */
    public void changeState(State state){
        order.setState(state);
    }
    
    /**
     *
     */
    public void cancelOrder(){
        order.setState(State.CANCELLED);
    }
    
    /**
     *
     * @return
     */
    public int calculateTotal(){
        return order.calculateTotal();
    }

    /**
     *
     * @return
     */
    public Order getOrder() {
        return order;
    }
    
    /**
     *
     * @return
     */
    public int totalDishes(){
        return order.getDetails().size();
    }
    
    /**
     *
     * @param repo
     */
    public void save(IOrderRepository repo){
        repo.save(order);
    }

}
