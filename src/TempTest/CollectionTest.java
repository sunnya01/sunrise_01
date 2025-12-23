package TempTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author sunchaowei
 * @create 2025/12/22-09:16
 */
public class CollectionTest {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("孙", 1);
        hashMap.put("赵", 1);
        hashMap.put("钱", 1);
        hashMap.put("李", 1);
        hashMap.put("朱", 1);
        hashMap.put("秦", 1);
        hashMap.put("赵", 1);
        hashMap.put("刘", 1);
        hashMap.containsValue(1);
        hashMap.containsKey(1);
        Set<String> strings = hashMap.keySet();
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        System.out.println("1");
        TreeMap
    }
}

