class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> listAnswer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if ((j != i) && (nums[j] < nums[i])){
                    count++;
                }
            }
            listAnswer.add(count);
        }
        // Convert ArrayList to array directly
        return listAnswer.stream().mapToInt(Integer::intValue).toArray();
    }
}