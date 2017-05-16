package leetcode.ex380;

import java.util.HashSet;

public class RandomizedSet {

	HashSet<Integer> set;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        return set.add(val);
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int num = (int )(Math.random() * set.size());
		int i = 0;
		for (Integer integer : set) {
			if (i < num) {
				i++;
			} else {
				return integer;
			}
		}
		return 0;
    }
}
