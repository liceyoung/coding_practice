class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for (int i=0; i < n - 1; i++) {
          for (int j = i + 1; j < n; j++ ) {
              // j < n ( means j does not equal/ or can not at n)
              if ( nums[i] + nums[j] == target){
                  return new int []{i, j};
                  // using new int []{i, j} to CREATE an integer array return i and j
              }
          }
        }
        return new int []{};
    }
}
