package Algorithm_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day2_구간합구하기2 {
	/*

		합 배열S[i] = S[i-1] + A[i]
		 
		구간 합 
		S[j] - s[i-1]
		S[5] - S[1] = A[2] + A[3] + A[4] + A[5]
		
		2차원배열 NxN크기의 표
		표안의수 수중(x1, y1)에서 (x2, y2)까지의 합을 구하려 한다
		x는 행 y는 열
		
 
		입력
		1번째 줄에 표의 크기 N과 합을 구해야 하는 횟수 M이 주어진다 
		1 <= N <= 1024
		1 <= M <= 100,000
		2번째 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다 N번
		다음 M개의 줄에는 X1, Y1, X2, Y2가 M개 주어진다
		표에 주어진 수는 1000보다 작거나 같은 자연수 (x1 <= x2, y1 <= y2)
		 
		출력 예제
		
		4 1 // 2차원배열의 크기, 질의의 개수
		1 2 3 4 // 원본배열
		2 3 4 5  // 원본배열
		3 4 5 6 // 원본배열
		4 5 6 7 // 원본배열
		2 2 3 4 // 구간 합의 1번째 질의
		
		1) 1열의 합 배열
		S[i][1] = S[i-1][1] + A[i][1] // 마지막 배열 인덱스까지의 합배열 + 자기 자신
		
		2) 1행의 합 배열
		S[1][i] = S[1][i-1] + A[1][i]
		
		*S[i][j]의 값을 채우는 구간 합 공식*
		S[i][j] = S[i][j-1](열) + S[i-1][j](행) - S[i-1][j-1](중복빼주기) + A[i][j] 빠진 값 채우기

	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 배열의 크기
		int M = Integer.parseInt(st.nextToken()); // 질의의 개수
		
		int A[][] = new int[N+1][N+1]; // 원본배열 N+1인 이유 -> 0행 0열에 데이터 없음
		
		// 원본 배열 입력받아 저장하기
		for(int i = 1; i <= N; i++) { // 1부터 입력받는 것 주의
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j ++) { // 1부터 입력받는 것 주의
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 합 배열 먼저 저장하기
		// N만큼 반복
		int S[][] = new int[N+1][N+1];
		for(int i = 1; i <= N; i ++) {
			for(int j = 1; j <= N; j++) {
				S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + A[i][j]; // 공식 그대로 사용
			}
		}
		
		// 질의 계산 출력 
		// 구간 입력 받고, M만큼 반복
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			// 구간 합 배열 계산
			int result = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + A[x1-1][y1-1];
			// 전체합 - 행 - 열 - ㄱ모양으로 중복으로뺀 값 더해주기
			
			System.out.print(result);
		}
		
	}
}
