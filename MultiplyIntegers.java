public class MultiplyIntegers {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide at least one integer as an argument.");
            return;
        }

        // Initialize result with the first number
        int result = Integer.parseInt(args[0]);

        // If there's only one number, print it
        if (args.length == 1) {
            System.out.println(result);
            return;
        }

        // Multiply the numbers
        for (int i = 1; i < args.length; i++) {
            result *= Integer.parseInt(args[i]);
        }

        // Print the result
        System.out.println(result);
    }
}
