package 문자열;

import java.util.Scanner;

public class 대소문자_변환 {

    /*
    ==============================
    풀이 1
    ==============================

    public String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {

            if (c >= 97 && c <= 122) answer += (char) (c - 32);
            else answer += (char) (c + 32);

        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_02 T = new Problem_02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }

    [문제 정리]

    대문자와 소문자는 ASCII 코드 기준으로 32 차이가 난다. 소문자 범위는 97~122, 대문자 범위는 65~90이며 이를 이용하면 ±32 연산으로 대소문자 변환이
    가능하다. 자바는 넓은 범위 타입에서 좁은 범위 타입으로 자동 형변환이 되지 않기 때문에 char 캐스팅이 필요하다.
    */


    /*
    ==============================
    풀이 2
    ==============================

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                answer += Character.toLowerCase((str.charAt(i)));
            } else {
                answer += Character.toUpperCase((str.charAt(i)));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    [문제 정리]

    Character 클래스의 isUpperCase(), toLowerCase(), toUpperCase() 메서드를 이용하면 ASCII 값을 직접 계산하지 않고도 대소문자 변환을
    처리할 수 있다.
    */


    /*
    ==============================
    풀이 3
    ==============================

    public static String solution(String input1) {
        char[] result = new char[input1.length()];
        char[] charArray = input1.toCharArray();

        for (int i = 0; i < input1.length(); i++) {
            if (Character.isLowerCase(charArray[i])) result[i] = Character.toUpperCase(charArray[i]);
            else result[i] = Character.toLowerCase(charArray[i]);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String answer = solution(input1);
        System.out.println(answer);
        in.close();
    }

    [문제 정리]

    문자열을 직접 수정할 수 없기 때문에 char 배열을 만들어 결과를 저장한 뒤 String.valueOf()로 문자열로 변환하는 방식으로 처리할 수 있다.
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    private static String solution(String input) {
        char[] result = input.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (Character.isUpperCase(result[i])) result[i] = Character.toLowerCase(result[i]);
            else result[i] = Character.toUpperCase(result[i]);
        }
        return String.valueOf(result);
    }
}