package leetcode.ex690;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;
        HashMap<Integer, Employee> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++){
            map.put(employees.get(i).id, employees.get(i));
        }
        list.add(id);
        int index = 0;
        while (index < list.size()){
            Employee emp = map.get(list.get(index));
            result += emp.importance;
            int tmp = 0;
            while(tmp < emp.subordinates.size()){
                list.add(emp.subordinates.get(tmp));
                tmp++;
            }
            index ++;
        }
        return result;
    }
}