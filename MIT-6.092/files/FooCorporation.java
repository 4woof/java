/*
 * Assignment 2: Wage Calculator
 */

class FooCorporation{
  public static double pay(double base_pay, int hours){
    int overtime = 0;
    
    // test hours
    if (hours > 40) {
      if (hours > 60) {
        System.out.println("Error: Number of hours worked greater than 60.");
      }
      overtime = hours - 40;
      hours = 40;
    }

    // test pay
    if (base_pay < 8.0) {
      System.out.println("Error: Base pay cannot be under minimum wage.");
    }
    
    return (hours * base_pay) + (overtime * base_pay * 1.5);
  }

  public static void main(String[] args){
    System.out.println("Employee 1 Wages: $" + pay(7.50, 35));
    System.out.println("Employee 2 Wages: $" + pay(8.20, 47));
    System.out.println("Employee 3 Wages: $" + pay(10.00, 73));
  }
}

