/*
  File: Item.java
  By:   Brandon Davis
  Date: 9/29/2018
  Description: An Interface that will force all classes to implement functions
 */

import java.util.Date;

public interface Item {

  //constant
  static final String manufacturer = "OracleProduction";

  //methods implemented in product
  void setProductionNumber(int prodNum);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
}
