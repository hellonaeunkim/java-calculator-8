package calculator;

public class StringSplitter {

    // 기본 구분자 설정
    private static final String DEFAULT_DELIMITERS = "[,:]";

    // 구분자 찾기 메서드
    public static String findDelimiters(String input) {
        if (input.startsWith("//")) {
            // 사용자 정의 구분자 추출
            int newLineIdx = input.indexOf("\\n");
            // 구분자 부분 반환
            return input.substring(2, newLineIdx);
        }
        return DEFAULT_DELIMITERS;
    }

    // 문자열을 구분자로 분리하는 메서드
    public static String[] split(String input, String delimiters) {

        input = input.substring(input.indexOf("\\n") + 2);

        return input.split(delimiters);
    }
}