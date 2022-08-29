import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: Joan
 * @date: 2022/8/29 20:54
 * @Description: 两数之和
 * @version: 1.0
 */
public class Solution_01 {


    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int numLength = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<numLength ; i++){
            map.put(nums[i],i);
        }
        for(int i = 0; i < numLength ; i++){
//
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) !=i){
                return new int[]{map.get(target - nums[i]),i};
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }


}
