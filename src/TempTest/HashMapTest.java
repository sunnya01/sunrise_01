package TempTest;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("123","456");
        Set<String> set = map.keySet();
        map.remove("123");
    }
}
