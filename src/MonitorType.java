/*
  File: MonitorType.java
  By:   Brandon Davis
  Date: 10/28/2018
  Description: Enum for media players that contain screens and their type
 */

//bad practice to make public. Doesn't work with private or protected
enum MonitorType {
  LCD("LCD"),
  LED("LCD"),
  ;

  public String monType;

  MonitorType(String monType) {
    this.monType = monType;
  }
}