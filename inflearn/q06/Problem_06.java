package q06;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem_06 {
    /*
    입력값: 소문자로 이루어진 문자열 (길이<100)
    출력값: 중복이 제거된 나머지 문자열
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println(solution(input));
//    }
//
//    public static StringBuilder solution(String input) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < input.length(); i++) {
//            if (input.indexOf(input.charAt(i)) == i) {
//                sb.append(input.charAt(i));
//            }
//        }
//        return sb;
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println(solution(input));
//    }
//
//    public static StringBuilder solution(String input) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//
//            if (input.indexOf(c) == i) sb.append(c);
//        }
//        return sb;
//    }
    // indexOf는 처음부터 끝까지  스캔하는 O(N) 이다 for문안에서 돌리면 N^2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            set.add(c);
        }

        for (char c : set) {
            result.append(c);
        }

        return result.toString();
    }
}



