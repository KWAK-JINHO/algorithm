import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    //스티커 정보 관련 클래스
    static class sticker{
        int h, w;
        public sticker(int h, int w) {
            this.h = h;
            this.w = w;
        }
    }
    static int H,W,N, answer = 0;
    static ArrayList<sticker> info = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(br.readLine());
        //입력값 저장
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            //모눈종이에 붙이지 못하는 스티커이면 넘기기
            if((h > H && h > W) || (w > W && w > H))
                continue;
            info.add(new sticker(h, w));
        }
        cal();	//모든 스티커 경우 구하기
        bw.write(answer + "");	//최대 넓이 BufferedWriter 저장
        bw.flush();	//결과 출력
        bw.close();
        br.close();
    }
    //모든 스티커 붙이는 경우 구하는 함수
    static void cal(){
        //1번째 스티커 (0,0)기준으로 붙이기
        for(int i=0;i<info.size();i++){
            sticker cur = info.get(i);
            int size = cur.h * cur.w;
            int tempH = H - cur.h;
            int tempW = W - cur.w;
            if(tempH>=0 && tempW>=0)	//1번째 스티커 붙이기 성공시
                secondSticker(i, tempH, tempW, size);

            //1번째 스티커 회전해서 붙여보기
            tempH = H - cur.w;
            tempW = W - cur.h;
            if(tempH>=0 && tempW>=0)	//회전한 1번째 스티커 붙이기 성공시
                secondSticker(i, tempH, tempW, size);
        }
    }
    //두 번째 스티커 붙이는 함수
    static void secondSticker(int index, int h, int w, int size){
        int secondSize = 0;
        for(int i=index+1;i<info.size();i++){
            sticker cur = info.get(i);
            int tempSize = cur.h * cur.w;	//2번째 스티커 넓이
            //모눈 종이에 영역에 2번째 스티커를 그대로 및 회전하여 붙여볼 때 성공시
            if((cur.h <= h && cur.w <= W) || (cur.h <= H && cur.w <= w)
                ||(cur.w <=h && cur.h <=W) || (cur.w <=H && cur.h <= w))
                secondSize = Math.max(secondSize, tempSize);
        }
        //두 번째 스티커 붙이기 성공할 때 최대 넓이 비교하기
        if(secondSize!=0)
            answer = Math.max(answer, size+secondSize);
    }

}