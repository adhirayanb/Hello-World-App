public class HelloWorld {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build the names list
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        // Enhanced for loop to iterate through arguments
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Display the final greeting
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}