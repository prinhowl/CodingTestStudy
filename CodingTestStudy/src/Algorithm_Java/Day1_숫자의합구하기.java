package Algorithm_Java;
import java.util.*;

public class Day1_숫자의합구하기 {
	/*
	 * N개의 숫자가 공백 없이 써있을 때, 숫자를 모두 합해 출력
		 
		입력
		1번째 줄에 숫자의 개수 N(1<=N<=100), 2번째 줄에 숫자 N개가 공백 없이 주어진다
		 
		출력 예제

		554321
		15

		1110987654321
		46
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
