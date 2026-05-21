// 2026.05.21

class Solution {
    public int solution(int[] num_list) {
        String odd ="";
        String even = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2!=0){
                odd = odd + num_list[i]
            }else{
                even = even+num_list[i]
            }
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}
