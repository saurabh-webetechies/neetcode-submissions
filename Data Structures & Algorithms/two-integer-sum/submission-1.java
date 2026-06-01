class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length; i++){
            map.put(nums[i],i);
        }

        for(int i = 0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff) && map.get(diff) != i ){
                int j = map.get(target-nums[i]);
                return new int[]{i,j};
            }
        }
        return new int[0];
    }
}
