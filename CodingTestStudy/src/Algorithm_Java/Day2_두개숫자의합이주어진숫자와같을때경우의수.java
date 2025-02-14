package Algorithm_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day2_두개숫자의합이주어진숫자와같을때경우의수 {
	 /*
		투포인터 알고리즘 -> N의 시간 복잡도
		
		투포인터 이동원칙(start, end 인덱스가 양 끝쪽에서 시작)
		1) a[st] + [end] > M : end--;
		2) a[st] + [end] < M : st++;
		3) a[st] + [end] == M : st++; end--; count++;
		
		 
		[문제] 주몽의 명령
		2개의 숫자를 합쳐 M(1 <= M <= 10,000,000)이 되는 경우의 구하기
		2개의 숫자는 N(1 <= N <= 15,000)
		
		[입력]
		1번째 줄에 숫자의 개수 N
		2번째 줄에 완성되야하는(같아야하는) 숫자 M
		3번째 줄에 숫자 N만큼의 숫자 입력
		
		[출력]
		6
		7
		2 7 4 1 5 3
		-> 2
		
		1) 정렬
		2) 투포인터 알고리즘 사용 -> start,end 끝에서 끝 저장

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
