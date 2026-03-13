package 문자열;

import java.util.Scanner;

public class 알파벳만뒤집기 {

    /*
    ==============================
    풀이 1
    ==============================

    public static String solution(String str) {
        char[] charArr = str.toCharArray();
        int lc = 0, rc = str.length() - 1;

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

    [문제 정리]

    문자열의 양쪽 끝에서부터 투포인터로 접근하면서 알파벳이 아닌 문자는 건너뛰고 알파벳인 경우에만 서로 교환하는 방식이다. 특수문자의 위치는 그대로 두고 알파벳만 뒤집는 문자열 처리 패턴이다.

    [아쉬운 점]

    로직은 적절하지만 변수명이 lc, rc처럼 축약되어 있어 코드 의도가 직관적으로 드러나지 않는다. left, right 같은 이름을 사용하면 가독성이 더 좋아질 수 있다.
    */


    /*
    ==============================
    풀이 2
    ==============================

    public static String solution(String str) {
        char[] charArr = str.toCharArray();
        int len = str.length();
        char[] result = new char[len];

        for (int i = 0; i < len; i++) {
            if (Character.isAlphabetic(charArr[i]) && Character.isAlphabetic(charArr[len - i - 1])) {
                result[i] = charArr[len - i - 1];
                result[len - i - 1] = charArr[i];
            } else {
                result[i] = charArr[i];
                result[len - i - 1] = charArr[len - i - 1];
            }
        }

        return String.valueOf(result);
    }

    [문제 정리]

    새로운 배열을 만들어 좌우 인덱스를 기준으로 값을 채우는 방식이다. 결과 배열을 따로 만들어 문자열을 구성하는 방식의 접근이다.

    [아쉬운 점]

    문제 조건이 알파벳만 뒤집고 특수문자는 그대로 유지하는 것이기 때문에 단순히 좌우 인덱스를 기준으로 값을 채우는 방식으로는 정확한 처리가 어렵다. 또한 결과 배열을 추가로 생성해 메모리 사용도 증가한다.
    */


    /*
    ==============================
    추천 풀이
    ==============================

    투포인터를 이용해 알파벳이 아닌 문자는 건너뛰고 알파벳만 교환하는 방식이다. 문제 조건을 가장 자연스럽게 표현하는 풀이이며 추가 배열 없이 처리할 수 있어 코드와 메모리 측면에서 가장 적절하다.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String str) {
        char[] charArr = str.toCharArray();
        int lc = 0, rc = str.length() - 1;

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