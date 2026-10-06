class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Sub(nums,0,0,target,list,result);
        return result;

        
    }
static void  Sub(int[] nums,int index,int sum,int target,ArrayList<Integer> list,List<List<Integer>> result){
    if(index == nums.length){
        if(sum == target){
            result.add(new ArrayList<>(list));

        }
        return;

    }
    //take
    if(sum >target){
        return;
    }
    
    list.add(nums[index]);
    Sub(nums,index,sum+nums[index],target,list,result);

    list.remove(list.size()-1);
    Sub(nums,index+1,sum,target,list,result);
}
}
