
public class TakeHomeCode{
	public static void main(String[] args){
		//Omar Asker
		//Omer Waseem
        if (args.length != 2) {
            System.out.println("Please enter exactly two arguments.");
            return;
        }
        try {
            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);
            AddNumbers adder = (a, b) -> {
                int sum = 0;
                for (int i = a; i <= b; i++) {
                    sum += i;
                }
                return sum;
            };
            int result = adder.add(start, end);
            System.out.println("Sum of numbers from "+start+" to "+end+": " + result);
        }catch(NumberFormatException e)
        {
            System.out.println("Invalid input. Please provide two integers.");
        }
    }
}
