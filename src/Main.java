/*
  File: Item.java
  By:   Brandon Davis
  Date: 9/29/2018
  Description: Main class that demonstrates the program
 */

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Main {

  /**
   * Main function that creates an ArrayList called products that stores testCollection.
   * The ArrayList is then sorted and printed
   */
  public static void main(String[] args) {

    // Write one line of code to create an ArrayList of products
    //Dead store to products bug but asked to create this
    ArrayList<Product> products = new ArrayList<Product>();
    // Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(products);
    // Call the print method on the ArrayList
    print(products);
  }

  // Step 15
  // Complete the header for the testCollection method here

  /**
   * ArrayList function called testCollection. This creates new objects of different
   * media types. It is then stored into a collection and returns products.
   */
  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<Product>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here
  /**
   * Function that recursively prints the products ArrayList.
   */
  public static void print(ArrayList<Product> products) {
    for (int counter = 0; counter < products.size(); counter++) {
      System.out.println(products.get(counter));
    }
  }
}