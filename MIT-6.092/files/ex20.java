class ex20{
  public static void main(String[] args){
    Baby.numBabiesMade = 100;
    Baby b1 = new Baby();
    Baby b2 = new Baby();
    System.out.println(b1.numBabiesMade);
    System.out.println(b2.numBabiesMade);
    Baby.numBabiesMade = 2;

    System.out.println(b1.numBabiesMade);
    System.out.println(b2.numBabiesMade);

    b1.numBabiesMade = 3;
    System.out.println(b1.numBabiesMade);
    System.out.println(b2.numBabiesMade);
  }
}
