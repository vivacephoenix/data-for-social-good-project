/*
* Represents a hitter.
*/
public class Hitter {
 
  private String name; // Name of the player/hitter.
  private double average; // The player's average.

  /*
  * Sets the player's name and average to the specified value.
  */
  public Hitter(String name, double average) {
    this.name = name;
    this.average = average;
  }
  
  /*
  * Returns the batter/player's name.
  */
  public String getBName() {
    return name;
  }
 
  /*
  * Returns the player's batting average.
  */
  public double getAverage() {
    return average;
  }
}