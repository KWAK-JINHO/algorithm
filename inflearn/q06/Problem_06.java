package q06;

import java.util.Scanner;

public class Problem_06 {
    /*
    입력값: 소문자로 이루어진 문자열 (길이<100)
    출력값: 중복이 제거된 나머지 문자열
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static StringBuilder solution(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                sb.append(input.charAt(i));
            }
        }
        return sb;
    }
}



