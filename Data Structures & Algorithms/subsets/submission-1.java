class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Sub(nums,0,list,result);
        return result;

    }
    static void Sub(int[] nums,int index,ArrayList<Integer> list,List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(list));
            return;

        }
        //take
        list.add(nums[index]);
        Sub(nums,index+1,list,result);


        //not take
        list.remove(list.size()-1);
        Sub(nums,index+1,list,result);
    }
}
