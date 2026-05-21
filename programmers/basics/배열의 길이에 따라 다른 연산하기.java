// 2026.05.20

class Solution {
    public int[] solution(int[] arr, int n) {
        int size = arr.length;
        if(size % 2!=0){
            for(int i=0; i<size; i=i+2){
                arr[i] = arr[i]+n;
            }
        }
        else{
            for(int i=1; i<size; i=i+2){
                arr[i] = arr[i]+n;
            }
        }
        return arr;
    }
}
