package Programmers_Java;

import java.util.Arrays;
import java.util.Collections;

public class Day1_정수내림차순으로배치하기 {
	/*
	 정수 내림차순으로 배치하기 
	 
	 문제 설명 
	 함수 solution은 정수 n을 매개변수로 입력받습니다. 
	 n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	 예를들어 n이 118372면 873211을 리턴하면 됩니다. 
	 제한 조건 n은 1이상 8000000000 이하인 자연수입니다. 
	 
	 입출력 예 
	 n return 
	 118372 873211
	 
	 */
	public static void main(String[] args) {
		// 함수 호출

	}
	
	class Solution {
	    public long solution(long n) {
	        String[] list = String.valueOf(n).split("");
	        
	        //Arrays.sort(list); // 오름차순 배열 정렬
	        Arrays.sort(list, Collections.reverseOrder()); // 내림차순 배열 
	        
	        return Long.parseLong(String.join("", list));
	    }
	}
}
