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
public class CarFactory {
    public Car getClone(Car originalCar){
       return originalCar.getCopy();
    }
}
