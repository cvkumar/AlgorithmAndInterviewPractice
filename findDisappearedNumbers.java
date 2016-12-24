public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        List<Integer> numbersMissing = new ArrayList<Integer>();
        
        Set<Integer> numsSet = new HashSet<Integer>();
        
        for (int i = 0; i < length; i++) {
            numsSet.add(nums[i]);
        }
        
        for (int i = 1; i <= length; i++) {
            if (!numsSet.contains(i)) {
                numbersMissing.add(i);
            }
        }
        
        return numbersMissing;
    }
}