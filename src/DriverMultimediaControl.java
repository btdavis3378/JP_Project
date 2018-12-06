/*
    File: DriverMultimediaControl.java
    By:   Brandon Davis
    Date: 12/5/2018
    Description: Driver class that demonstrates that any class that implements
                 MultimediaControl Interface would be able to be instantiated
                 and use its methods used no matter if it was an audio or
                 movie player.
*/

public class DriverMultimediaControl {

  /**
   * Testing functionality that demonstrates that any class that implements
   * MultimediaControl Interface would be able to be instantiated and use
   * its methods used no matter if it was an audio or movie player.
   */
  public static void testMultimediaControl() {
    MultimediaControl[] devices = {
        new MoviePlayer("Zune", new Screen("2569 x 1440",
            144, 2), MonitorType.LCD),
        new AudioPlayer("Walkman", "WAV")};

    for (MultimediaControl testArray : devices) {
      System.out.println(testArray);
      testArray.next();
      testArray.play();
      testArray.previous();
      testArray.stop();
    }
  }
}
