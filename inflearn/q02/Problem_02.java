package q02;

import java.util.Scanner;

public class Problem_02 {
    public String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
//            if (Character.isLowerCase(c)) {
//                answer += Character.toUpperCase(c);
//            } else {
//                answer += Character.toLowerCase(c);
//            }
            if (c >= 97 && c <= 122) answer += (char) (c - 32);
            else answer += (char) (c + 32);
            // 대문자 소문자 판별은 아스키문자로도 가능하다
            // 대문자는 65~90
            // 소문자는 97~122 둘의 차이는 32 이므로 32+-로도 대소문자 변환이 가능하다.
            // 자바는 넓은 범위의 타입에서 좁은 범위의 타입으로 자동변환이 안 되기 때문에 위처럼 명시적 형변환이 필요하다.
        }


        return answer;
    }

    public static void main(String[] args) {
        Problem_02 T = new Problem_02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}