class Marathon {
  public static int fastest(int[] times) {
    /*Write a method that takes as input an array of integers
      and returns the index corresponding to the person with
      the lowest time. Run this method on the array of times.
      Print out the name and time corresponding to the returned
      index.*/
    int fastIndex = 0;
    if (times.length > 0){
      // Loop to compare and find quickest time.
      for (int i = 1; i < times.length; i++){
        if (times[i] < times[fastIndex]){
          // Replaces fastest time index.
          fastIndex = i;
        }
      }
    }
    return fastIndex;
  }

  public static int second(int[] times) {
    /*Write a second method to find the second-best runner.
      The second method should use the first method to determine
      the best runner, and then loop through all values to find
      the second-best (second lowest) time.*/
    int firstPlace = fastest(times);
    int secondPlace = 0;
    if (times.length > 1){
      // Loop to compare and find second quickest time.
      for (int i = 0; i < times.length; i++){
        // Slower than fastest time.
        if (times[i] > times[firstPlace]){
          // Faster than other times.
          if (times[i] < times[secondPlace]){
            secondPlace = i;
          }
        }
      }
    }
    return secondPlace;
  }

  public static void main(String[] arguments) {
    String[] names = {
      "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
      "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
      "Aaron", "Kate"
    };

    int[] times = {
      341, 273, 278, 329, 445, 402, 388, 275, 243, 344, 412, 393, 299,
      343, 317, 265
    };

    System.out.println(names[fastest(times)] + ": " + times[fastest(times)]);
    System.out.println(names[second(times)] + ": " + times[second(times)]);
  }
}
