/*
  File: Product.java
  By:   Brandon Davis
  Date: 9/29/2018
  Description: Abstract class that implements Item interface.
               Implements basic functions that items will have.
 */

import java.util.Date;

public abstract class Product implements Item, Comparable<Item> {

  //abstract class fields
  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufacturedOn;
  private String name;

  //set to 1 because first item will be created
  static int currentProductionNumber = 1;

  /**
   * Constructor for the Product class.
   */
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    //Bug: specified to write to static field
    currentProductionNumber = currentProductionNumber + 1;
    manufacturedOn = new Date();
  }

  //gets and sets methods from interface Item
  public void setProductionNumber(int prodNum) {
    serialNumber = prodNum;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    Date date = new Date();
    return date;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  //Information data
  /**
   * toString that returns manufacturer, serialNumber, date it was manufactured, and name.
   */

  @Override
  public String toString() {
    String productionInfo = "Manufacturer    : " + manufacturer + "\n"
        + "Serial Number   : " + serialNumber + "\n"
        + "Date            : " + manufacturedOn + "\n"
        + "Name            : " + name + "\n";
    return productionInfo;
  }

  @Override
  public int compareTo(Item o) {
    return 0;
  }

}
