/*
  File: Screen.java
  By:   Brandon Davis
  Date: 10/28/2018
  Description: Class to set resolution, refresh rate, and response time
               for media players with screens.
 */

public class Screen implements ScreenSpec {
  //fields
  private String resolution;
  private int refreshrate;
  private int responsetime;

  /**
   * Constructor for the class Screen. Returns resolution, refreshRate, and responseTime.
   */
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  //completed methods from ScreenSpec interface
  @Override
  public String getResolution() {
    return null;
  }

  @Override
  public int getRefreshRate() {
    return 0;
  }

  @Override
  public int getResponseTime() {
    return 0;
  }

  @Override
  public String toString() {
    return "resolution : " + resolution + '\n'
        + "refreshrate : " + refreshrate + "\n"
        + "responsetime : " + responsetime + "\n";
  }

}
