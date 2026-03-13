package 문자열;

import java.util.Scanner;

public class 문자열_순회_문자개수세기 {

    /*
    ==============================
    풀이 1
    ==============================

    public static int solution(String input1, String input2) {
        int cnt = 0;
        String input3 = input1.toLowerCase();
        char input4 = Character.toLowerCase(input2.charAt(0));

        for (int i = 0; i < input1.length(); i++) {
            if (input3.charAt(i) == input4) cnt++;
        }
        return cnt;
    }

    [아쉬운 점]

    - 문자 하나를 비교하는 문제인데 input2를 String으로 받은 뒤 charAt(0)으로 다시 꺼내는 구조가 불필요하게 한 단계를 거친 형태이다.

    - 변수명이 역할을 설명하지 못한다. input3, input4 보다는 lowerStr, targetChar 같은 이름이 더 읽기 좋다.

    - 문자열을 toLowerCase() 하면서 새로운 문자열 객체가 생성된다. 메모리 최적화를 의식했다면 이 부분도 고려해야 한다.

    - 입력 형식이 단순한 경우 nextLine()보다는 next()가 더 적절할 수 있다.
    */


    /*
    ==============================
    풀이 2
    ==============================

    public static int solution(String input1, char input2) {
        char[] charList = input1.toLowerCase().toCharArray();
        int result = 0;

        for (char x : charList) {
            if (x == Character.toLowerCase(input2)) result++;
        }

        return result;
    }

    [아쉬운 점]
    - 문자열을 toLowerCase()로 복사한 뒤 toCharArray()로 또 배열을 생성한다. 불필요한 중간 객체가 두 번 만들어진다.

    - Character.toLowerCase(input2)가 반복문 안에서 계속 호출되고 있다. 변하지 않는 값은 루프 밖에서 한 번만 계산하는 것이 좋다.

    - for-each를 쓰기 위해 배열을 생성한 구조이다. 이 문제에서는 charAt() 기반 반복도 충분히 읽기 좋다.
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(solution(input1, input2));
    }

    // 메모리 할당을 최소화하기 위해 배열 생성을 피한 풀이
    public static int solution(String input1, String input2) {
        int cnt = 0;
        String input3 = input1.toLowerCase();
        char input4 = Character.toLowerCase(input2.charAt(0));

        for (int i = 0; i < input1.length(); i++) {
            if (input3.charAt(i) == input4) cnt++;
        }
        return cnt;
    }
}