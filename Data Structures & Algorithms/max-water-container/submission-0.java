class Solution {
    public int maxArea(int[] arr) {
        int n =  arr.length-1;
        int left=0;
        int right= n;
        int maxArea = 0;
        while(left<right){
            int width = right-left;
            
            int height = Math.min(arr[left],arr[right]);
            int area = width*height;
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                 right--;
                 

            }
           
            if(area>maxArea){
                maxArea = area;
            }
            
        }
        return maxArea;
    
        
    }
}
