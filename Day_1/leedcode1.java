public class leedcode1 {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }

            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        leedcode1 obj = new leedcode1();

        // Multiple test inputs
        int[][] arrays = {
                {2,7,11,15},
                {3,2,4},
                {3,3}
        };

        int[] targets = {9,6,6};

        for (int i = 0; i < arrays.length; i++) {

            int[] result = obj.twoSum(arrays[i], targets[i]);

            System.out.println("Test Case " + (i+1));

            if(result.length > 0){
                System.out.println(result[0] + " " + result[1]);
            }else{
                System.out.println("No Solution");
            }

        }
    }
}