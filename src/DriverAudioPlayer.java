/*
/*
  File: DriverAudioPlayer.java
  By:   Brandon Davis
  Date: 10/28/2018
  Description: Driver class to test if the program can instantiate occurrences
               of AudioPlayer.
 */

public class DriverAudioPlayer {

  /**
   * Testing functionality of the class AudioPlayer.
   */
  public static void main(String[] args) {


    AudioPlayer audioPlayer = new AudioPlayer("Name",
        "AU");

    audioPlayer.setProductionNumber(1);
    System.out.println(audioPlayer);

    audioPlayer.play();
    audioPlayer.previous();
    audioPlayer.next();
    audioPlayer.stop();
  }
}