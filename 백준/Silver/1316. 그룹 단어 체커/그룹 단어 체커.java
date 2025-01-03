import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {  // 클래스 이름을 "Main"으로 변경
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            Set<Character> set = new HashSet<>();
            char curChar = word.charAt(0);
            set.add(curChar);

            boolean isGroupWord = true;

            for (int j = 1; j < word.length(); j++) {
                char c = word.charAt(j);
                if (c != curChar) {
                    if (set.contains(c)) {
                        isGroupWord = false;
                        break;
                    }
                    curChar = c;
                    set.add(c);
                }
            }
            if (isGroupWord) answer++;
        }

        System.out.println(answer);
    }
}