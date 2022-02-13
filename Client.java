/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylifemyrules.cpit252_lab03;

/**
 *
 * @author 1935595
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "corolla", 2012);
        CarFactory carF = new CarFactory();
        Car c2 = carF.getClone(c1);
        
        System.out.println("C1 = "+c1+"\nC2 = "+c2);
    }

}
