import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        int count = sc.nextInt();
        int value = sc.nextInt();
        
        int[] arr = new int[count];

        for(int i = 0;i < count;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = count - 1; i >= 0; i--) {
            int num = value/arr[i];
            
            if(num > 0) { 
                answer += num;
                value -= arr[i]*num;
            }
        }
        System.out.println(answer);
    }
}