package 문자열;

public class 회문문자열 {

    /*
    ==============================
    풀이 1
    ==============================

    public static String solution(String str) {
        char[] charArr = str.toLowerCase().toCharArray();

        String result = "";

        int lc = 0;
        int rc = str.length() - 1;

        while (lc < rc) {
            if (charArr[lc] == charArr[rc]) {
                lc++;
                rc--;
            } else {
                result += "NO";
                break;
            }
        }

        if (result == "") result += "YES";

        return result;
    }

    [문제 정리]

    문자열을 소문자로 변환한 뒤 투포인터를 이용해 양쪽 끝 문자부터 비교하는 방식이다. 두 문자가 모두 같으면 포인터를 이동하고, 다르면 회문이 아니므로 종료한다. 회문 문자열 판별에서 가장 기본적으로 사용하는 패턴이다.

    [아쉬운 점]

    회문 여부는 조건이 깨지는 순간 바로 결과를 반환할 수 있는데 result라는 상태 변수를 두어 불필요하게 로직이 복잡해졌다. 또한 문자열 비교를 == 로 수행하고 있는데 자바에서 문자열 비교는 equals()를 사용하는 것이 안전하다. 이 문제는 조건이 깨지면 바로 return 하는 구조로 작성하는 것이 더 깔끔하다.
    */
}