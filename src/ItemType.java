/*
  File: ItemType.java
  By:   Brandon Davis
  Date: 9/29/2018
  Description: Multimedia pre-set type by use of an enumerator.
 */

enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  public String code;

  ItemType(String code) {
    this.code = code;
  }
}
