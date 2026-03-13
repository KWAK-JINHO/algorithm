package 문자열;

import java.util.Scanner;

public class 중복문자제거 {

    /*
    ==============================
    풀이 1
    ==============================

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                sb.append(input.charAt(i));
            }
        }

        return sb.toString();
    }

    [문제 정리]

    indexOf는 특정 문자가 처음 등장하는 위치를 반환한다. 현재 문자 위치와 indexOf 결과가 같다면 해당 문자는 처음 등장한 문자이므로 이를 이용해 중복
    문자를 제거할 수 있다.

    [아쉬운 점]

    indexOf는 문자열을 처음부터 끝까지 탐색하는 O(N) 연산이기 때문에 이를 for문 안에서 사용하면 전체 시간 복잡도가 O(N²)이 된다. 문자열 길이가
    길어지면 성능이 비효율적일 수 있다.
    */


    /*
    ==============================
    풀이 2
    ==============================

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

    [문제 정리]

    LinkedHashSet은 중복을 허용하지 않으면서 입력 순서를 유지하는 자료구조이다. 문자열을 순회하면서 Set에 넣으면 자동으로 중복이 제거되고 순서도 유지된다.

    [아쉬운 점]

    문제의 핵심은 문자열 처리 로직을 이해하는 것이기 때문에 자료구조를 사용하면 구현은 간단하지만 문자열 처리 패턴을 직접 연습하는 효과는 줄어들 수 있다.
    또한 Set과 StringBuilder를 함께 사용하면서 메모리를 추가로 사용하게 된다.
    */


    /*
    ==============================
    추천 풀이
    ==============================

    indexOf를 이용해 현재 문자가 문자열에서 처음 등장하는 위치인지 확인하는 방식이다. 문제 의도에 가장 맞는 풀이이며 문자열 문제에서 자주 사용되는 패턴이다.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                sb.append(input.charAt(i));
            }
        }

        return sb.toString();
    }
}