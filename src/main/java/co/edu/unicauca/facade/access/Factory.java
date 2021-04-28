/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unicauca.facade.access;

/**
 * 
 * @author Eliana Andrea Araujo Camayo  cod: 104616021725
 * @author Jesus Edwin Adrada Ruiz  cod: 104617020514
 * @author Carlos Enrique Hoyos Joiro  cod: 104617020768
 */
public class Factory {
    
    private static Factory instance;
    
    private Factory() {
    }
    
    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }
    
    /**
     *
     * @param dishType
     * @return
     */
    public IOrderRepository getRepository(String orderType)
    {
        IOrderRepository objOrderRepository = null;
        if("default".equals(orderType))
        {
            objOrderRepository = new OrderRepositoryImplArrays();
        }
        else if("Italian".equals(orderType))
        {
            
        }
        return objOrderRepository;
    }

}
