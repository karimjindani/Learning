public class MultiplyIntegers {

    public static void main(String[] args) {
        System.out.println(process(args));
    }

    public static String process(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            return "Please provide at least one integer as an argument.";
        }

        // Initialize result with the first number
        int result;
        try {
            result = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            return "Invalid input: " + args[0] + " is not an integer.";
        }

        // If there's only one number, return it
        if (args.length == 1) {
            return String.valueOf(result);
        }

        // Multiply the numbers
        for (int i = 1; i < args.length; i++) {
            try {
                result *= Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                return "Invalid input: " + args[i] + " is not an integer.";
            }
        }

        // Return the result
        return String.valueOf(result);
    }
}
