import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random generator = new Random();
        int answer = generator.nextInt(100) + 1; // 1부터 100까지 랜덤한 숫자 생성
        int guess;
        Scanner sc = new Scanner(System.in);
        int tries = 0;

        do {
            System.out.println("Q. 1부터 100까지의 정답을 추측하여 보시오: ");
            guess = sc.nextInt();
            tries++;

            if (guess > answer) {
                System.out.println("제시한 정수가 높습니다.");
            } else if (guess < answer) {
                System.out.println("제시한 정수가 낮습니다.");
            }
        } while (guess != answer);

        System.out.println("축하합니다! 정답을 맞추셨습니다.");
        System.out.println("시도한 횟수: " + tries);
    }
}