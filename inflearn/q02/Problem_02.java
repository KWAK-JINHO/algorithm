package q02;

import java.sql.SQLOutput;
import java.util.Scanner;

//public class Problem_02 {
//    public String solution(String str) {
//        String answer = "";
//        for (char c : str.toCharArray()) {

/// /            if (Character.isLowerCase(c)) {
/// /                answer += Character.toUpperCase(c);
/// /            } else {
/// /                answer += Character.toLowerCase(c);
/// /            }
//            if (c >= 97 && c <= 122) answer += (char) (c - 32);
//            else answer += (char) (c + 32);
//            // 대문자 소문자 판별은 아스키문자로도 가능하다
//            // 대문자는 65~90
//            // 소문자는 97~122 둘의 차이는 32 이므로 32+-로도 대소문자 변환이 가능하다.
//            // 자바는 넓은 범위의 타입에서 좁은 범위의 타입으로 자동변환이 안 되기 때문에 위처럼 명시적 형변환이 필요하다.
//        }
//
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Problem_02 T = new Problem_02();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//        System.out.println(T.solution(str));
//    }
//}

//public class Problem_02 {
//    public static String solution(String str) {
//        String answer = "";
//        for (int i = 0; i <str.length(); i++) {
//            if (Character.isUpperCase(str.charAt(i))) {
//                answer += Character.toLowerCase((str.charAt(i)));
//            } else {
//                answer += Character.toUpperCase((str.charAt(i)));
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(solution(str));
//    }
//}

public class Problem_02 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String input1 = in.nextLine();
//        String answer = solution(input1);
//        System.out.println(answer);
//        in.close();
//    }
//
//    public static String solution(String input1) {
//        char[] result = new char[input1.length()];
//        char[] charArray = input1.toCharArray();
//
//        for (int i = 0; i < input1.length(); i++) {
//            if (Character.isLowerCase(charArray[i])) result[i] = Character.toUpperCase(charArray[i]);
//            else result[i] = Character.toLowerCase(charArray[i]);
//        }
//        return String.valueOf(result);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    private static String solution(String input) {
        char[] result = input.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (Character.isUpperCase(result[i])) result[i] = Character.toLowerCase(result[i]);
            else result[i] = Character.toUpperCase(result[i]);
        }
        return String.valueOf(result);
    }

    // 문자열은 영어로만 이루어져있는지 공백이 들어올 수 있는지에 대해서 고민을 안했음
}