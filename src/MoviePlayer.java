/*
  File: MoviePlayer.java
  By:   Brandon Davis
  Date: 10/28/2018
  Description: Concrete class MoviePlayer for multimedia players
               that use a screen.
 */

public class MoviePlayer extends Product implements MultimediaControl {
  //fields
  private Screen screen;
  private MonitorType monitorType;

  /**
   * Constructor for the class MoviePlayer that sets the name, screen, and monitorType.
   */
  public MoviePlayer(String name, Screen screen, MonitorType type) {
    super(name);
    this.screen = screen;
    this.monitorType = type;
  }

  //Completed methods from MultiMediaControl interface
  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopped");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  //toString method that displays monitor and screen details.
  public String toString() {
    return super.toString() + "\n" + screen.toString() + "\n"
        + "Monitor Type: " + monitorType;
  }
}
