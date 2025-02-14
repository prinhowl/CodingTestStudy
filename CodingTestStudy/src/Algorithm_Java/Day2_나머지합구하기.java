package Algorithm_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day2_나머지합구하기 {
	/*

		특정 구간 수들의 나머지 연산을 더해 나머지 연산한 값 = 구간 합의 나머지 연산을 한 값
		((A%C) + (B%C)) % C 
		= (A+B) % C
		
		S[i]%M = S[j]%M 같다면 (S[j]-S[i])%M = 0 이다
		ex) 합 배열  0 2 0 2 0
		
		값이 같은 S[i],S[j] 한 쌍을 찾으면 원본 배열 i+1에서 j까지의 구간 합이 나머지 M으로 나누어 떨어진다
		
		문제
		N개의 수가 주어졌을 때 연속된 부분의 합이 M으로 나누어 떨어지는 구간(i,j)의 개수
 
		입력
		1번째 줄에 N(개수), M(나눌수), (1 <= N <= 10의6승, 1 <= M <= 10의 3승)
		2번째 줄에 N개의 숫자 나열
		 
		출력 예제
		
		5 3
		1 2 3 1 2
		
		-> 7
		
		1) 합배열 생성
		2) 합배열의 모든 값 M으로 나누기
		3) 나머지의 값이 0인 값 저장해두기
		4) 나머지의 값이 같은 합배열의 개수 세기 -> 변경된 합배열에서 원소 값이 같은 2개의 원소 뽑기
		ex) 1 0 0 1 0  ->  0의 개수 : 3C2, 1의 개수 : 2C2 
	

	 */

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// N입력
		int N = sc.nextInt();
		// M입력
		int M = sc.nextInt();
		
		// 합배열S선언
		long S[] = new long[N];
		
		// 같은 나머지의 인덱스를 세는 카운트 배열 선언
		long C[] = new long[M]; // 왜 M개 이지??
		
		// 최종 개수 선언
		long answer = 0;
		
		// 첫번째 배열 숫자 입력 받기 = 합배열 첫번째 숫자 이기도 함
		S[0] = sc.nextInt();
		
		// 합배열 저장
		for(int i = 1; i < N; i++) { // i = 1 부터인 이유는 합배열[0]이 필요하기 때문
			S[i] = S[i-1] + sc.nextInt(); // 다음 입력 값 받기
		}
		
		// 합배열을 M으로 나눈 나머지가 0일 때 세기
		for(int i = 0; i < N; i++) {
			int remin = (int)S[i] % M; // 나머지 값
			if(remin == 0) answer++;
			
			// 나머지의 값이 같은 인덱스의 카운트 계산
			C[remin]++; 
		}
		
		
		// 나머지가 같은 인덱스 중 2 개를 뽑는 경우의 수 계산
		// 콤비네이션 공식 이용하기
		// ex) a[i] * (a[i] - 1) / 2
		// 3개 뽑을 때) a[i] * (a[i] - 1) * (a[i] - 2) / 3 
		for(int i = 0; i < M; i++) {
			if(C[i] > 1) {
				answer += (C[i] * (C[i]-1) /2);
			}
		}
		
		System.out.print(answer);
	}
}
