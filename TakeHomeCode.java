public class TakeHomeCode {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter exactly two arguments.");
            return;
        }
        try {
            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);
            AddNumbers adder = (a, b) -> {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += i;
                }
                return sum;
            };
            int result = adder.add(1, 5);
            System.out.println("Sum of numbers from 1 to 5: " + result);
        }catch(NumberFormatException e)
        {
            System.out.println("Invalid input. Please provide two integers.");
        }
    }
}
