package calculator;

public class Application {

    public static void main(String[] args) {
        try {
            // 사용자 입력 받기
            String input = Input.input();

        } catch (IllegalArgumentException e) {
            System.out.println("에러: " + e.getMessage());
        }
    }
}
