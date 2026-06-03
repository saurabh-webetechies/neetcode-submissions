class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
        int count = 1;
        int element = nums[0];
        int max = 0;
       for(int i = 0; i< nums.length-1; i++){
          if(nums[i] == nums[i+1]){
            count++;
          }
          else{
            count = 1;
          }
          if(count > max){
            max = count;
            element = nums[i];
          }
         
          
       }
   return element;
    }
}