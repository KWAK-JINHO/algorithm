package q03;

import java.util.Scanner;
//
//public class Problem_03 {
//    public String solution(String str) {
//        String answer = "";
//
//        // 1번
////        String[] arr = str.split(" ");
////        for (String s : arr) {
////            if (s.length() > answer.length()) answer = s;
////        }
//
//        //2번
//        int m = Integer.MIN_VALUE, pos;

/// /        String[] arr = str.split(" ");
/// /        for (String s : arr) {
/// /            int len = s.length();
/// /            if (len > m) {
/// /                m = len;
/// /                answer = s;
/// /            }
/// /        }
//
//        // 3번
//        while ((pos = str.indexOf(' ')) != -1) {
//            String tmp = str.substring(0, pos);
//            int len = tmp.length();
//            if (len > m) {
//                m = len;
//                answer = tmp;
//            }
//            str = str.substring(pos+1);
//        }
//        if(str.length() > m) answer = str;
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Problem_03 T = new Problem_03();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        System.out.println(T.solution(str));
//    }
//
//}

public class Problem_03 {
    //    public static String solution(String str) {
//        String[] strArr = str.split(" ");
//        String answer = "";
//
//        for (String x : strArr) {
//            if (answer.length() < x.length()) answer = x;
//        }
//
//        return answer;
//    }
//    public static String solution(String str) {
//        String answer = "";
//        int m = Integer.MIN_VALUE, pos;
//        while ((pos = str.indexOf(' ')) != -1) {
//            String tmp = str.substring(0, pos);
//            int len = tmp.length();
//            if (len > m) {
//                answer = tmp;
//                m = len;
//            }
//            str = str.substring(pos + 1);
//        }
//        if(str.length() > m) answer = str;
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(solution(str));
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }
//
//    public static String solution(String input) {
//        String[] arr = input.split(" ");
//        int strLength = 0;
//        int idx = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() > strLength) {
//                strLength = arr[i].length();
//                idx = i;
//            }
//        }
//        return arr[idx];
//    }

    public static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

}
