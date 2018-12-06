/*
  File: DriverScreen.java
  By:   Brandon Davis
  Date: 10/28/2018
  Description: Driver class for screen that tests functionality
               of the screen class.
 */

public class DriverScreen {

  /**
   * Testing functionality of the class DriverScreen.
   */
  public static void main(String[] args) {
    Screen screen = new Screen("1920x1080", 144, 2);
    System.out.println(screen);

  }
}