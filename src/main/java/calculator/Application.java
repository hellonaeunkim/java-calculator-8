package calculator;

public class Application {

    public static void main(String[] args) {
        try {
            // 사용자 입력 받기
            String input = Input.input();

            // 구분자 찾기
            String delimiter = StringSplitter.findDelimiters(input);

            // 문자열 분리
            String[] numbers = StringSplitter.split(input, delimiter);

            // 숫자 파싱
            int[] parsedNumbers = NumberParser.parse(numbers);

            // 숫자들의 합 계산
            int sumOfNumbers = Calculator.sum(parsedNumbers);

        } catch (IllegalArgumentException e) {
            System.out.println("에러: " + e.getMessage());
        }
    }
}
