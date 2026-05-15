public class Reduce {
    public static void main() {
        // Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1.
        // write a main method that prints how many steps it takes to reach 0 if you start at n

        int n = 100;
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n --;
            steps ++;
        }

        System.out.println(steps);
    }
}
