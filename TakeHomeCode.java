@FunctionalInterface
public interface AddNumbers {
    int add(int start, int end);
}
public class TakeHomeCode{
	public static void main(String[] args){
        AddNumbers adder = new AddNumbers() {
            @Override
            public int add(int start, int end) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += i;
                }
                return sum;
            }
        };
        int result = adder.add(1, 5);
        System.out.println("Sum of numbers from 1 to 5: " + result);
	}
}