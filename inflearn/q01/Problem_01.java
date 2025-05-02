package q01;

import java.util.Scanner;

public class Problem_01 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase(); // 대소문자를 구분하지 않기 때문에
        t = Character.toUpperCase(t);
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer ++;
//            }
//        }
        for (char x : str.toCharArray()) { // foreach에 올것들은 string이 아니라 리스트나 Collection framework 이다.
            if (x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_01 T = new Problem_01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 문자열을 하나 받는다.
        char c = kb.next().charAt(0); // 문자열을 받아서 첫번째 인덱스를 c에 할당

        System.out.println(T.solution(str, c));
    }
}