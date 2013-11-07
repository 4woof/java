class DoMath2 {
    public static void main(String[] arguments) {
        double score = 1.0 + 2.0 * 3.0;
        System.out.println(score); // Should return 7.0
        double copy = score; // Copies value 7.0 and stores
        copy = copy / 2.0;
        System.out.println(copy); // Should return 3.5
        System.out.println(score); // Should still return 7.0 because
                                   // we did not copy pointer to score
    }
}
