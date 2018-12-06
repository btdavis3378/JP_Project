/*
  File: AudioPlayer.java
  By:   Brandon Davis
  Date: 10/28/2018
  Description: Concrete class that allows the program to acquire
               details of an audio player.
 */

public class AudioPlayer extends Product implements MultimediaControl {
  //fields
  private String audioSpecification;
  private ItemType mediaType = ItemType.AUDIO;

  //Constructor with 2 parameters
  //Javadoc comment
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
  }

  //Implemented methods from MultiMediaControl interface
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

  //toString method. Also displays superclass toString method
  @Override
  public String toString() {
    return super.toString()
        + "Audio Specification : " + audioSpecification + '\n'
        + "Media Type : " + mediaType + "\n";
  }
}
