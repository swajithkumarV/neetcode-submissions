class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        Sub(nums, 0, target, new ArrayList<>(), result);

        return result;
    }

    static void Sub(int[] nums, int index, int target,
                    ArrayList<Integer> list,
                    List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > target) {
                break;
            }

            list.add(nums[i]);

            Sub(nums, i + 1, target - nums[i], list, result);

            list.remove(list.size() - 1);
        }
    }
}