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
 * @author Eliana Andrea Araujo Camayo  cod: 104616021725
 * @author Jesus Edwin Adrada Ruiz  cod: 104617020514
 * @author Carlos Enrique Hoyos Joiro  cod: 104617020768
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
