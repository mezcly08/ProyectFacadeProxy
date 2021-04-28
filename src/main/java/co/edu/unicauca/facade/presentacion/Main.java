/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.presentacion;

import co.edu.unicauca.facade.access.Factory;
import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.domain.order.State;
import co.edu.unicauca.facade.domain.Customer;
import co.edu.unicauca.facade.domain.Dish;
import co.edu.unicauca.facade.domain.IOrderService;
import co.edu.unicauca.facade.domain.OrderFacade;
import co.edu.unicauca.facade.domain.OrderServiceLogger;
import co.edu.unicauca.facade.domain.ProxyClient;

/**
 *
 * @author Eliana Andrea Araujo Camayo  cod: 104616021725
 * @author Jesus Edwin Adrada Ruiz  cod: 104617020514
 * @author Carlos Enrique Hoyos Joiro  cod: 104617020768
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //El sujeto real.
        OrderFacade orderFacade = new OrderFacade();

        //El objeto proxy. Se le pasa el objeto real por el constructor (inyección)
        IOrderService orderProxy = new OrderServiceLogger(orderFacade);

        //Se opera normal el sujeto real
        orderFacade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 Barrio Caldas", "3115677899", "Popayán"));
        orderFacade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        orderFacade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        orderFacade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        orderFacade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + orderFacade.calculateTotal());
        System.out.println("Total de platos pedidos: " + orderFacade.totalDishes());

        //Ahora ejecutamos el cliente proxy, y le pasamos el sujeto que debe utilizar.
        ProxyClient client = new ProxyClient(orderProxy);
        client.createOrder();

    }
    
}
