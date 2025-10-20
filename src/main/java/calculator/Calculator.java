package calculator;

public class Calculator {

    public static int sum(int[] numbers) {

        int sumOfNumbers = 0;

        for (int num : numbers) {
            sumOfNumbers += num;
        }

        return sumOfNumbers;
    }
}
