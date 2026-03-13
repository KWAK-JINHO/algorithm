package 문자열;

import java.util.Scanner;

public class 가장긴단어찾기 {

    /*
    ==============================
    풀이 1
    ==============================

    public String solution(String str) {
        String answer = "";

        String[] arr = str.split(" ");
        for (String s : arr) {
            if (s.length() > answer.length()) answer = s;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_03 T = new Problem_03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }

    [문제 정리]

    문자열을 공백 기준으로 split 하여 단어 배열을 만든 뒤 각 단어의 length를 비교하면서 가장 긴 단어를 찾는 방식이다. 문자열 문제에서 공백 단위로
    데이터를 처리할 때 가장 직관적인 방법이다.
    */


    /*
    ==============================
    풀이 2
    ==============================

    public static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if (len > m) {
                answer = tmp;
                m = len;
            }

            str = str.substring(pos + 1);
        }

        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    [문제 정리]

    split을 사용하지 않고 indexOf와 substring을 이용하여 공백 위치를 찾으면서 단어를 하나씩 잘라 처리하는 방식이다. 문자열을 직접 탐색하며 처리하는
    방식으로 메모리 사용을 줄일 수 있는 문자열 처리 패턴이다.
    */


    /*
    ==============================
    풀이 3 (추천 풀이)
    ==============================

    public static String solution(String input) {
        String[] arr = input.split(" ");
        int strLength = 0;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > strLength) {
                strLength = arr[i].length();
                idx = i;
            }
        }

        return arr[idx];
    }

    [문제 정리]

    가장 긴 단어의 길이를 저장하는 변수와 해당 단어의 인덱스를 저장하는 변수를 따로 두어 문제를 해결하는 방식이다. 최대값을 찾는 기본적인 패턴을 연습할 수
    있다.
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

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