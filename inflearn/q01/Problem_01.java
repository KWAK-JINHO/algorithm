package q01;

import java.util.List;
import java.util.Scanner;

//public class Problem_01 {
//    public int solution(String str, char t) {
//        int answer = 0;
//        str = str.toUpperCase(); // 대소문자를 구분하지 않기 때문에
//        t = Character.toUpperCase(t);

/// /        for (int i = 0; i < str.length(); i++) {
/// /            if (str.charAt(i) == t) {
/// /                answer ++;
/// /            }
/// /        }
//        for (char x : str.toCharArray()) { // foreach에 올것들은 string이 아니라 리스트나 Collection framework 이다.
//            if (x == t) answer++;
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Problem_01 T = new Problem_01();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next(); // 문자열을 하나 받는다.
//        char c = kb.next().charAt(0); // 문자열을 받아서 첫번째 인덱스를 c에 할당
//
//        System.out.println(T.solution(str, c));
//    }
//}


//public class Problem_01 {
//    public static int solution(String str, char t) {
//
//        int answer = 0;
//        str = str.toUpperCase();
//        t = Character.toUpperCase(t);
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner kb = new Scanner(System.in);
//
//        int result = Problem_01.solution(kb.next(), kb.next().charAt(0));
//        System.out.println(result);
//    }
//}

public class Problem_01 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String input1 = in.nextLine();
//        String input2 = in.next();
//        int a;
//        in.close();
//        System.out.println(solution(input1, input2.charAt(0)));
//    }
//
//    public static int solution(String input1, char input2) {
//        char[] charList = input1.toLowerCase().toCharArray();
//        int result = 0;
//        for (char x: charList) {
//            if (x == Character.toLowerCase(input2)) result++;
//        }
//        return result;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(solution(input1, input2));
    }

//    public static int solution(String input1, char input2) {
//        int result = 0;
//        for (char ch : input1.toCharArray()) {
//            if (ch == input2) result++;
//        }
//        return result;
//    }

    // 메모리 할당을 최소화 하기 위해서 배열 생성을 피하는것이 좋다.
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






