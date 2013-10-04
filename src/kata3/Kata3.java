package kata3;

import java.util.ArrayList;
import java.util.HashMap;

public class Kata3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("NumberList");
        for (int i = 0; i < 50; i++) {
            list.add((int) (Math.random()*10));
        }

        for (Integer value : list) {
            System.out.println(value);
        }
        
        HashMap<Integer,Integer> map = new HashMap();
        
        for (Integer value : list) {
            if (map.containsKey(value)) map.put(value, map.get(value) + 1);
            else map.put(value, 1);
        }
        int max = 0;
        int key_max = 0;
        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
            if (max < map.get(key)) {
                max = map.get(key);
                key_max = key;
            }
        }
        System.out.println("El más repetido es el número: " + key_max +" y se repite " + max +" veces");
        
    }
}