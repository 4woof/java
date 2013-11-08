/*
 * Output:
 * main x = 5
 * printSquare x = 5
 * printSquare x = 25
 * main x = 5
 */
class SquareChange{
  public static void printSquare(int x){
    System.out.println("printSquare x = " + x);
    x = x * x;
    System.out.println("printSquare x = " + x);
  }

  public static void main(String[] arguments){
    int x = 5;
    System.out.println("main x = " + x);
    printSquare(x);
    System.out.println("main x = " + x);
  }
}
