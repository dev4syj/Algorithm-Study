class Solution {
  
    public int isPrime(int n) {
	    for (int i = 2; i<= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
	    }
	    return 1;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    answer += isPrime(sum);
                }
            }
        }
        
        return answer;
    }
}
