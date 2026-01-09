package StreamOperationTest;

import java.util.ArrayList;

/**
 * @author sunchaowei
 * @create 2026/1/8-08:12
 */
public class StreamTest01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        Integer reduce = arrayList.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

//        Stream.generate(StreamTest01::aa).limit(10).forEach((A c) -> System.out.println(c.aa));
    }

    public static void aa(Object ss) {
        String ss1 = String.valueOf(ss);
        System.out.println(ss1);
    }
}
