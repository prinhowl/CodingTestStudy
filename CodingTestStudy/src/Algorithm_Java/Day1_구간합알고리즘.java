package Algorithm_Java;
import java.util.*;

public class Day1_구간합알고리즘 {
	/*
	 구간 합 알고리즘
		배열을 이용하여 시간 복잡도를 더 줄이기 위해 사용하는 특수한 목적의 알고리즘
		 
		합 배열S[i] = S[i-1] + A[i]
		 
		구간 합 
		S[j] - s[i-1]
		S[5] - S[1] = A[2] + A[3] + A[4] + A[5]
		
		
		
		수 N개가 주어졌을 때 i번째 수에서 j번째 수까지의 합을 구하는 프로그램
 
		입력
		1번째 줄에 숫자의 개수 N(1<=N<=100,000), 합을 구해야하는 질의 횟수 M(1<=M<=100,000) 
		2번째 줄에 N 개의 수
		3번째 줄부터는 M개의 줄에 합을 구해야 하는 구간 i와 j
		 
		출력 예제
		
		5 3 // 데이터의 개수, 질의 개수
		5 4 3 2 1 // 구간 합을 구할 대상 배열
		1 3 // 구간 1~32 45 5
		
		1291

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
