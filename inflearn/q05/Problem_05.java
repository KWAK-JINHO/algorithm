package q05;

import java.util.Scanner;

//public class Problem_05 {
//    public static String solution(String str) {
//        char[] s = str.toCharArray();
//        int lc = 0;
//        int rc = str.length() - 1;
//
//        while (lc < rc) {
//            if (!Character.isAlphabetic(s[lc])) lc++;
//            else if (!Character.isAlphabetic(s[rc])) rc--;
//            else {
//                char tmp = s[rc];
//                s[rc] = s[lc];
//                s[lc] = tmp;
//                lc++;
//                rc--;
//            }
//        }
//
//        return String.valueOf(s);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        System.out.println(solution(str));
//    }
//}

public class Problem_05 {
//    public static String solution(String str) {
//        char[] charArr = str.toCharArray();
//        int lc = 0, rc = str.length() - 1;
//
//        while (lc < rc) {
//            if (!Character.isAlphabetic(charArr[lc])) lc++;
//            else if (!Character.isAlphabetic(charArr[rc])) rc--;
//            else {
//                char tmp = charArr[rc];
//                charArr[rc] = charArr[lc];
//                charArr[lc] = tmp;
//                lc++;
//                rc--;
//            }
//        }
//        return String.valueOf(charArr);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String inputStr = sc.nextLine();
//
//        System.out.println(solution(inputStr));
//    }

    // 입력값 : 길이가 100을 넘지 앟는 문자열
    // 출력: 첫 줄에 알파벳만 뒤집힌 문자열을 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        char[] charArr = input.toCharArray();
        int lc = 0, rc = input.length() - 1;

        while (lc < rc) {
            if (!Character.isAlphabetic(charArr[lc])) lc++;
            else if (!Character.isAlphabetic(charArr[rc])) rc--;
            else {
                char tmp = charArr[lc];
                charArr[lc] = charArr[rc];
                charArr[rc] = tmp;
                lc++;
                rc--;
            }
        }
        return String.valueOf(charArr);
    }
}