//	First Unique Character in a String
//	Given a string, find the first non-repeating character in it 
//	and return it's index. If it doesn't exist, return -1. 
	
	 public static int firstUniqChar(String s) {
		 Map<Character,Integer>map=new LinkedHashMap<>();
		 char[] c=s.toCharArray();
		 for(int i=0;i<c.length;i++) {
			 if(!map.containsKey(c[i])) {
				 map.put(c[i], i);
			 }else {
				 map.put(c[i], -1);
			 }
		 }
		 for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			 if(entry.getValue()!=-1)
				 return entry.getValue();
		 }
		 return -1;
     }