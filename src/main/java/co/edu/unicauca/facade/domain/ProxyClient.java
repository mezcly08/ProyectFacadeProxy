/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unicauca.facade.domain;

import co.edu.unicauca.facade.access.Factory;
import co.edu.unicauca.facade.access.IOrderRepository;

/**
 * 
 * @author Jesus Edwin Adrada Ruiz cod: 104617020514
 */
public class ProxyClient {
    
    private IOrderService orderService;

    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }
    
    public void createOrder(){
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    }

}
