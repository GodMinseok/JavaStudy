package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int number = scanner.nextInt();

        int[] numbers = new int[number];
        int minNumber, maxNumber;

        System.out.print(number + "개의 정수를 입력하세요: ");
        for (int i = 0; i < number; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = numbers[0];
        maxNumber = numbers[0];

        for (int i = 0; i < number; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
