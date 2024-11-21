package Fibonacci_Sequence;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> fibonacci(int iterations) {
        if (iterations <= 0) {
            throw new IllegalArgumentException("Iterations should be a positive number");
        }

        List<Integer> sequence = new ArrayList<>();
        int n1 = 0, n2 = 1;

        for (int i = 0; i < iterations; i++) {
            if (i == 0) {
                sequence.add(n1);
            } else if (i == 1) {
                sequence.add(n2);
            } else {
                int nextTerm = n1 + n2;
                sequence.add(nextTerm);
                n1 = n2;
                n2 = nextTerm;
            }
        }
        return sequence;
    }

    public static void main(String[] args) {
        try {
            List<Integer> result = fibonacci(10);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}