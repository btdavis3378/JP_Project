/*
  File: DriverMoviePlayer.java
  By:   Brandon Davis
  Date: 10/28/2018
  Description: Driver class to test functionality of MoviePlayer class
 */

public class DriverMoviePlayer {

  /**
   * Testing functionality of the class MoviePlayer.
   */
  public static void main(String[] args) {
    Screen screen = new Screen("1920x1080", 144, 2);

    MoviePlayer player = new MoviePlayer("movie player test", screen, MonitorType.LCD);

    System.out.println(player);

    player.play();
    player.previous();
    player.next();
    player.stop();

  }
}