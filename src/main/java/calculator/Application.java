package calculator;

public class Application {

    public static void main(String[] args) {
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

        // 계산 결과 출력
        Output.printResult(sumOfNumbers);
    }
}
