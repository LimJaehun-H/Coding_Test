import java.util.Arrays;

class Solution {
    public int solution(String num_str) {
        int sum = 0;
        for(char s : num_str.toCharArray()){
            sum = sum + (s-'0');
        }
        return sum;
    }
}
