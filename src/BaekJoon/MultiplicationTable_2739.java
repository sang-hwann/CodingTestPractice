package BaekJoon;

//        구구단
//        문제
//        N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
//
//        입력
//        첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
//
//        출력
//        출력형식과 같게 N*1부터 N*9까지 출력한다.
//
//        예제 입력 1
//        2
//        예제 출력 1
//        2 * 1 = 2
//        2 * 2 = 4
//        2 * 3 = 6
//        2 * 4 = 8
//        2 * 5 = 10
//        2 * 6 = 12
//        2 * 7 = 14
//        2 * 8 = 16
//        2 * 9 = 18

import java.util.Scanner;
public class MultiplicationTable_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 받기위해 Scanner 객체 선언
        int num = scanner.nextInt(); //문자입력후 변수로 저장
        //1~9를 반복해서 곱하기 적용
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + num * i); //출력
        }
    }
}
