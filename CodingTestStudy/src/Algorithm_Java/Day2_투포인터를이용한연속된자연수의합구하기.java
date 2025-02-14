package Algorithm_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day2_투포인터를이용한연속된자연수의합구하기 {
	 /*
		투포인터 알고리즘 -> N의 시간 복잡도
		
		투포인터 이동원칙(start, end 인덱스가 같은 곳에서 시작)
		1) sum < n : end++; sum += end;
		2) sum > n : sum -= start; start++;
		3) sum == n : end++; sum += end; count++; -> 이 때에만 카운트 올리기
		
		 
		[문제]
		자연수 N은 몇 개의 연속된 자연수의 합으로 나타낼 수 있다
		(1 <= N <= 10,000,000)
		ex) 15 -> 7+8, 4+5+6, 1+2+3+4+5
		
		[입력]
		1번째 줄에 정수 N이 주어진다
		
		[출력]
		15 -> 4

	 */

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		// N 변수 저장
		int N = sc.nextInt();
		
		// 사용 변수 초기화 count, sum, start, end
		int count = 1; // n의 값 미리 넣기
		int sum = 1; // start,end의 인덱스가 1번째 부터 시작 하기 때문에
		int start = 1;
		int end = 1;
		
		// end!=N일 때까지 반복문 돌리기
		while(end != N) { // 최대 범위
			if(sum == N) { // 연속 합이 N과 같은 경우
				count++;
				end++;
				sum += end;
			} else if (sum > N) { // 연속 합이 N보다 큰 경우
				sum -= start;
				start++;
			} else { // sum < N 연속 합이 N보다 작은 경우
				end++;
				sum += end;
			}
		}
		System.out.print(count);
	}
}
