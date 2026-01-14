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
//    public static String[] solution(String[] strArr) {
//        String[] result = new String[strArr.length];
//
//        for (int i = 0; i < strArr.length; i++) {
//            char[] charArr = strArr[i].toCharArray();
//            int lc = 0;
//            int rc = strArr[i].length() - 1;
//
//            while (lc < rc) {
//                char tmp = strArr[i].charAt(rc);
//                charArr[rc] = charArr[lc];
//                charArr[lc] = tmp;
//                lc++;
//                rc--;
//            }
//            result[i] = String.valueOf(charArr);
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        String[] inputArr = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            inputArr[i] = sc.nextLine();
//        }
//
//        String[] strArr = solution(inputArr);
//
//        for (String x : strArr) {
//            System.out.println(x);
//        }
//    }

    /* 조건
    입력값: 첫줄; 자연수 두번째줄 ~ N개; N개의 영어 알파벳 단어
    출력 입력된 단어를 뒤집어 놓은 단어 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        sc.nextLine();
        String[] inputWords = new String[inputInt];
        for (int i = 0; i < inputInt; i++) {
            inputWords[i] = sc.nextLine();
        }

        String[] result = solution(inputInt, inputWords);
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]);
        }

    }

    public static String[] solution(int n, String[] words) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String word = words[i];

            char[] newArr = new char[word.length()];
            int lc = 0;
            int rc = word.length() - 1;

            while (lc <= rc) {
                newArr[lc] = word.toCharArray()[rc];
                newArr[rc] = word.toCharArray()[lc];
                lc ++;
                rc --;
            }
            result[i] = String.valueOf(newArr);
        }
        return result;
    }
}
