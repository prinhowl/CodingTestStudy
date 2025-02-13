package Programmers_Java;

public class Day1_나머지가1이되는수찾기 {
	/*
	 나머지가 1이 되는 수 찾기
	 
	 자연수 n이 매개변수로 주어집니다. 
	 n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 
	 답이 항상 존재함은 증명될 수 있습니다. 
	 
	 3 ≤ n ≤ 1,000,000 
	 
	 n result 
	 10 3 12 11
	 
	 */
	public static void main(String[] args) {
		// 함수 호출

	}
	
	class Solution {
	    public int solution(int n) {
	        int min = n;
	    
	        for(int i = n; i >= 1; i--){
	            if(n % i == 1) {
	                if(min >= i) min = i;
	            }
	        }
	        System.out.println(min);
	        return min;
	    }
	}

	class Solution2 {
	    public int solution(int n) {
	        int answer = 1;

	        while(true) {
	            if (n%answer==1) break;
	            answer++;
	        }

	        return answer;
	    }
	}
	
}
