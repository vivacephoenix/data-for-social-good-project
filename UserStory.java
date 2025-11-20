import java.util.Scanner;
/*
Finds the player with the highest batting average.
*/
public class UserStory {

  private Hitter[] hitters; // 1D array of hitters.

  /*
  * Reads the data from bNamesFile and avgFile to initialize hitters.
  */
  public UserStory(String bNamesFile, String avgFile) {
    hitters = createHitters(bNamesFile, avgFile);
  }
  /*
  * Returns a 1D array of hitter objects based off the data from bNamesFile and avgFile.
  */
  public Hitter[] createHitters(String bNamesFile, String avgFile) {
    String[] bNames = FileReader.toStringArray(bNamesFile);
    double[] avg = FileReader.toDoubleArray(avgFile);

    Hitter[] allHitters = new Hitter[bNames.length]; 

    for (int i = 0; i < bNames.length; i++) {
      allHitters[i] = new Hitter(bNames[i], avg[i]);
    }
    return allHitters;
  }
  /*
  * Returns the index of the highest batting average which will correspond with a batter's name. 
  */
  public int findMaxAverageIndex() {

 if (hitters.length == 0) {
       return 0;
     }
    double maxAverage = hitters[0].getAverage();
    int maxIndex = 0;
    for (int i = 1; i < hitters.length; i++) {
      double currentAverage = hitters[i].getAverage();
      if (currentAverage > maxAverage) {
        maxAverage = currentAverage;
        maxIndex = i;
      }
    }

    return maxIndex;
  }

  /*
  * Returns a string containing the player with the highest batting average and their average. 
  */
  public String toString() {
    int bMaxIndex = findMaxAverageIndex();
    Hitter bestHitter = hitters[bMaxIndex];
    String result = "The player with the highest batting average is " + bestHitter.getBName() + " with an average of " + bestHitter.getAverage() + ".";
    return result;
  }






 
}