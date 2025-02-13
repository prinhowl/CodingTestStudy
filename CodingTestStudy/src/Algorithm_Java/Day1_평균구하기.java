package Algorithm_Java;
import java.util.*;

public class Day1_평균구하기 {
	/*
	 성적의 최댓값을 M이라고 할 때 모든 점수를 점수/M*100 으로 고쳤을 때, 새로운 평균 구하기
 
		입력
		1번째 줄에 숫자의 개수 N(1<=N<=1000)
		2번째 줄에 현재의 성적(100보다 작거나 같은 음이 아닌 정수, 적어도 1개의 값은 0보다 큼)
		 
		출력 예제
		340 80 60
		75.0

		41 100 100 100
		75.25
		
		변환 점수의 평균 구하는 식 -> (A+B+C) * 100 / M / 3
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 개수 입력
        String sNum = sc.next(); // 개수에 맞춘 숫자 입력
		
        char[] cNum = sNum.toCharArray(); // String변수를 char형 배열로 변환
        
        int sum = 0;
        for(int i = 0; i < cNum.length; i++) {
        	sum += cNum[i] - '0'; // 정수형 변환
        }
        System.out.println("숫자의합 : " + sum);
	}
}
