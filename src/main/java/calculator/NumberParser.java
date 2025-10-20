package calculator;

public class NumberParser {

    public static int[] parse(String[] tokens) {
        // 문자열 배열을 정수 배열로 변환
        int[] numbers = new int[tokens.length];

        // 각 토큰을 정수로 파싱
        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            try {
                int number = Integer.parseInt(token.trim());
                // 음수 체크
                if (number < 0) {
                    throw new IllegalArgumentException("음수는 허용되지 않습니다: " + number);
                }
                numbers[i] = number;
                // 숫자가 아닌 값 예외 처리
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다.");
            }
        }
        return numbers;
    }
}