
//Two Sum

	public static  int[] twoSum(int[] nums, int target) {
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int[] a=new int[2];
		
		for(int i=0;i<nums.length;i++) {
			int value=target-nums[i];
			if(map.containsKey(value)) {
			a[0]=i;
			a[1]=map.get(value);
			}
			map.put(nums[i], i);
		}
		return a;
	}