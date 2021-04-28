/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unicauca.facade.access;

import co.edu.unicauca.facade.domain.Order;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Eliana Andrea Araujo Camayo  cod: 104616021725
 * @author Jesus Edwin Adrada Ruiz  cod: 104617020514
 * @author Carlos Enrique Hoyos Joiro  cod: 104617020768
 */
public class OrderRepositoryImplArrays implements IOrderRepository{
    
    public static List<Order> listOrders;

    public OrderRepositoryImplArrays() {
        listOrders = new ArrayList();
    }

    @Override
    public void save(Order order) {
        listOrders.add(order);
    }

    @Override
    public void createOrder(Order order) {
        
    }
    
    

}
