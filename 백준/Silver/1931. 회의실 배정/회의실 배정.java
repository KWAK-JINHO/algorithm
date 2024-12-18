import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] meetings = new int[n][2];

        for(int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt(); // 시작 시간
            meetings[i][1] = sc.nextInt(); // 끝나는 시간
        }

        // 문제 풀 때 생각이 안나면 문제를 풀어내는 것 말고 받은 정보를 가공할 생각을 하자
        // 종료시간 기준으로 오름차순 정렬 종료시간 같다면 시작시간으로 정렬
        Arrays.sort(meetings, (a, b) -> a[1] == b[1] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

        int ans = 0; // 답 = 최대 회의 개수
        int t = 0; // 현재 시점 ( 마지막 종료 시간 )

        for(int i = 0; i<n; i++) {
            if(t > meetings[i][0]) continue; // 시작 시간이 현재 시간보다 전이면 시작 불가
            // 그게 아니라면
            ans++;
            t = meetings[i][1];
        }

        System.out.println(ans);

      
    }
}
