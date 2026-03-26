public class HelloWorld {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Iterate through arguments using an enhanced for loop
            for (String name : args) {
                // Always append the same delimiter after each name
                nameBuilder.append(name).append(", ");
            }

            // Check length to avoid exceptions before applying substring()
            if (nameBuilder.length() > 0) {
                // Extract everything except the last two characters (", ")
                String formattedNames = nameBuilder.substring(0, nameBuilder.length() - 2);
                
                // Print the final greeting
                System.out.println("Hello, " + formattedNames + "!");
            }
        }
    }
}