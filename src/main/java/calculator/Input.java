package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static String input() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");

        // 사용자 입력 받기
        String input = Console.readLine();

        // 입력값이 null인 경우 예외 처리
        if (input == null) {
            throw new IllegalArgumentException("입력값 null은 허용되지 않습니다.");
        }

        // 입력값이 빈 문자열인 경우 예외 처리
        if (input.isEmpty()) {
            return "0";
        }

        return input;
    }
}