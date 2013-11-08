class Square2{
    public static void printSquare(int x){
        System.out.println(x*x);
    }

    public static void main(String[] arguments){
        printSquare("hello"); // This type is wrong, it requires an int.
        printSquare(5.5); // This type is wrong, it requires an int.
    }
}
