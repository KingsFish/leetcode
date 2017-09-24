package leetcode.ex599;

public class Solution{
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i ++){
            map.put(list1[i], i);
        }
        ArrayList<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i ++){
            if (map.containsKey(list2[i])){
                if (min > map.getOrDefault(list2[i], list1.length) + i){
                    min = map.get(list2[i]) + i;
                    result.clear();
                    result.add(list2[i]);
                } else if (min == map.getOrDefault(list2[i], list1.length) + i){
                    result.add(list2[i]);
                }
            }
        }
        
        String[] str = new String[result.size()];
        for (int i = 0; i < str.length; i ++){
            str[i] = result.get(i);
        }
        return str;
    }
}