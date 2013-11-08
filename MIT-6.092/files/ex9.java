class Square3{
    public static void printSquare(double x){
        System.out.println(x*x);
    }

    public static void main(String[] arguments){
        printSquare(5); // This runs because an int could be a double
                        // if we consider the precision is exact. This
                        // means that we would use 5.0 instead of 5.
    }
}
