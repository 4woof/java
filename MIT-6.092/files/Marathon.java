class Marathon {
  public static int fastest(int[]) {
    /*Write a method that takes as input an array of integers
      and returns the index corresponding to the person with
      the lowest time. Run this method on the array of times.
      Print out the name and time corresponding to the returned
      index.*/
  }

  public static int second(int[]) {
    /*Write a second method to find the second-best runner.
      The second method should use the first method to determine
      the best runner, and then loop through all values to find
      the second-best (second lowest) time.*/
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

    int fastest = times[0];
    String fastest_name = "";
    int second = times[0];
    String second_name = "";

    for (int i = 1; i < names.length; i++) {
      if (times[i] < fastest) {
        fastest = times[i];
        fastest_name = names[i];
      }
      if (times[i] < second && times[i] > fastest) {
        second = times[i];
        second_name = names[i];
      }
      //System.out.println(names[i] + ": " + times[i]);
    }
    System.out.println(fastest_name + ": " + fastest);
    System.out.println(second_name + ": " + second);
  }
}
