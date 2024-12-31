import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째 줄 받기
        int n = Integer.parseInt(br.readLine());

        // 두번째 줄 받기
        String numbers = br.readLine();

        // answer에 돌아가면서 더하기
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer +=  Character.getNumericValue(numbers.charAt(i));
        }
        System.out.println(answer);
    }
}
