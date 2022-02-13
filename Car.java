/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylifemyrules.cpit252_lab03;

import java.util.List;

public class Car{
  String make;
  String model;
  int year;
  List<Recall>  recalls;
  public Car(String make, String model, int year){
    this.make = make;
    this.model = model;
    this.year = year;
    this.recalls = fetchCarRecalls();
  }
  private List<Recall> fetchCarRecalls(){
      // Emulate http request.
      try {
          Thread.sleep(2000);
      } catch (InterruptedException ex) {
          ex.printStackTrace();
      }
      return null;
  }
  public Car getCopy(){
      return new Car (this.make, this.model, this.year);
  }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", model=" + model + ", year=" + year +  '}';
    }
  
}