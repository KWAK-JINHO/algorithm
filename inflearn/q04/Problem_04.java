package q04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class Problem_04 {
//    public String[] solution(String[] arr) {
//        String[] result = new String[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            char[] chars = arr[i].toCharArray();
//            int left = 0;
//            int right = chars.length - 1;
//
//            while (left < right) {
//                char tmp = chars[left];
//                chars[left] = chars[right];
//                chars[right] = tmp;
//                left++;
//                right--;
//            }
//
//            result[i] = new String(chars);
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Problem_04 T = new Problem_04();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine(); // nextInt 이후 개행 처리 해야함
//
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextLine();
//        }
//
//        String[] result = T.solution(arr);
//
//        for(String s : result ) {
//            System.out.println(s);
//        }
//    }
//}

//public class Problem_04 {
//    public static String[] solution(String[] arr){
//        String[] strArr = new String[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            char[] charArr = arr[i].toCharArray();
//            int lc = 0;
//            int rc = arr[i].length() - 1;
//
//            while (lc < rc) {
//                char tmp = arr[i].charAt(rc);
//                charArr[rc] = charArr[lc];
//                charArr[lc] = tmp;
//                lc++;
//                rc--;
//            }
//            strArr[i] = String.valueOf(charArr);
//        }
//        return strArr;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextLine();
//        }
//        String[] result = solution(arr);
//
//        for (String x : result) {
//            System.out.println(x);
//        }
//    }
//}

public class Problem_04 {
    public static String[] solution(String[] strArr) {
        String[] result = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            char[] charArr = strArr[i].toCharArray();
            int lc = 0;
            int rc = strArr[i].length() - 1;

            while (lc < rc) {
                char tmp = strArr[i].charAt(rc);
                charArr[rc] = charArr[lc];
                charArr[lc] = tmp;
                lc++;
                rc--;
            }
            result[i] = String.valueOf(charArr);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] inputArr = new String[n];

        for (int i = 0; i < n; i++) {
            inputArr[i] = sc.nextLine();
        }

        String[] strArr = solution(inputArr);

        for (String x : strArr) {
            System.out.println(x);
        }
    }
}
