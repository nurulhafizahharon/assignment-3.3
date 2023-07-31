public class LoopAssignment {
    public static void main(String args[]) {
        // Task 1. Create a while loop that prints all the odd numbers from 1 to 50

        // Add code here
        int i = 1;
        while (i < 51) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

        /*
         * Task 2. Create a do-while loop that prints the following pattern from 1 to
         * 30:
         * If the number is divisible by 3, print "Fizz"
         * If the number is divisible by 5, print "Buzz"
         * If the number is divisible by 3 AND 5, print "FizzBuzz"
         * If the number is not divisible by 3 nor 5, print "Pop"
         */

        // Add code here
        int x = 1;
        do {
            if (x % 15 == 0) {
                System.out.println(x + " - FizzBuzz");
            } else if (x % 5 == 0) {
                System.out.println(x + " - Buzz");
            } else if (x % 3 == 0) {
                System.out.println(x + " - Fizz");
            } else {
                System.out.println(x + " - Pop");
            }
            x++;
        } while (x < 31);

        // Task 3. Use an enhanced for-loop to compute for the average of the given
        // array

        int expenses[] = { 120, 130, 114, 112, 132, 154, 123, 112, 165, 144, 188, 200 };
        float average = 0.0f;

        // Add code here
        float sum = 0.0f;
        for (int expense : expenses) {
            sum += expense;
        }

        average = sum / expenses.length;
        System.out.println("The average of the given array is " + average);
    }
}
