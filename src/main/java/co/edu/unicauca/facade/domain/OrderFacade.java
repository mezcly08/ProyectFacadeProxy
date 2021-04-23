/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unicauca.facade.domain;

import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.doma.State;

/**
 * 
 * @author Jesus Edwin Adrada Ruiz cod: 104617020514
 */
public class OrderFacade {
    
    private Order order;
    
    public void createOrder(Customer customer){
        if (order == null){
            order = new Order(customer);
        }
    }
    
    public void addDish(Dish dish,int amount){
        order.addDish(dish, amount);
    }
    
    public void changeState(State state){
        order.setState(state);
    }
    
    public void cancelarOrder(){
        order.setState(State.CANCELLED);
    }
    
    public int calculateTotal(){
        return order.calculateTotal();
    }

    public Order getOrder() {
        return order;
    }
    
    public int totalDishes(){
        return order.getDetails().size();
    }
    
    public void save(IOrderRepository repo){
        
    }

}
