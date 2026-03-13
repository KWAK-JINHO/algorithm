package 문자열;

import java.util.Scanner;

public class 단어_뒤집기 {

    /*
    ==============================
    풀이 1
    ==============================

    public String[] solution(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            int left = 0;
            int right = chars.length - 1;

            while (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }

            result[i] = new String(chars);
        }
        return result;
    }

    [문제 정리]

    각 단어를 char 배열로 변환한 뒤 양쪽 끝 인덱스를 이동시키며 swap 하는 투포인터 방식이다. 문자열 뒤집기 문제에서 가장 기본적인 구현 방법이다.

    [아쉬운 점]

    클래스 인스턴스를 만들어 solution을 호출하고 있지만 이 문제는 상태를 가지지 않기 때문에 static 메서드로 처리하는 것이 더 단순하다. 또한 변수명이 arr, chars처럼 다소 일반적이어서 words, reversedWords 같은 이름을 사용하면 코드 의도가 더 명확해진다.
    */


    /*
    ==============================
    풀이 2
    ==============================

    public static String[] solution(String[] arr) {
        String[] strArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char[] charArr = arr[i].toCharArray();
            int lc = 0;
            int rc = arr[i].length() - 1;

            while (lc < rc) {
                char tmp = arr[i].charAt(rc);
                charArr[rc] = charArr[lc];
                charArr[lc] = tmp;
                lc++;
                rc--;
            }
            strArr[i] = String.valueOf(charArr);
        }
        return strArr;
    }

    [문제 정리]

    투포인터 방식으로 문자열을 뒤집는 풀이이다. 왼쪽과 오른쪽 인덱스를 이동시키며 문자를 교환하는 방식으로 문자열 뒤집기 문제에서 자주 사용하는 패턴이다.

    [아쉬운 점]

    swap 과정에서 char 배열과 원본 문자열 charAt()을 섞어서 사용하고 있어 기준이 일관되지 않다. 하나의 자료구조만 기준으로 처리하는 코드가 더 읽기 쉽고 실수 가능성도 줄일 수 있다.
    */


    /*
    ==============================
    풀이 3
    ==============================

    public static String[] solution(int n, String[] words) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            char[] charArr = words[i].toCharArray();
            int lc = 0;
            int rc = words[i].length() - 1;

            while (lc < rc) {
                char tmp = charArr[lc];
                charArr[lc] = charArr[rc];
                charArr[rc] = tmp;
                lc++;
                rc--;
            }

            result[i] = String.valueOf(charArr);
        }

        return result;
    }

    [문제 정리]

    투포인터를 사용해 문자열을 직접 뒤집는 방식이다. 문자열 뒤집기 구현 원리를 이해하기 좋은 풀이이다.

    [아쉬운 점]

    words 배열만으로 길이를 알 수 있기 때문에 n 매개변수는 불필요하다. 또한 투포인터 구현은 학습용으로 좋지만 실제 문제에서는 더 간단한 API를 사용할 수 있는 경우가 많다.
    */


    /*
    ==============================
    추천 풀이
    ==============================

    StringBuilder의 reverse() 메서드를 사용하는 방식이다. 자바에서 문자열을 뒤집는 가장 간단한 방법이며 코드가 짧고 구현 실수 가능성이 거의 없다.
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        String[] result = solution(words);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] solution(String[] words) {
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            result[i] = new StringBuilder(words[i]).reverse().toString();
        }

        return result;
    }

    /*
    ==============================
    풀이 4
    ==============================

    public static String[] solution(String[] words) {
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            result[i] = new StringBuilder(words[i]).reverse().toString();
        }

        return result;
    }

    [문제 정리]

    StringBuilder의 reverse() 메서드를 이용해 문자열을 뒤집는 방식이다. 자바에서 문자열 뒤집기를 가장 간단하게 처리할 수 있는 방법이다.

    [아쉬운 점]

    문자열 뒤집기 자체는 간단하지만 내부 동작을 이해하지 않고 API에만 의존하게 되면 투포인터 기반 문자열 처리 감각을 익히기 어렵다. 학습 단계에서는 직접 뒤집는 풀이도 함께 연습하는 것이 좋다.
    */
}