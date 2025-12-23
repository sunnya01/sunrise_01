package FanXing;

import java.util.ArrayList;

/**
 * @author sunchaowei
 * @create 2025/12/20-21:01
 */
public class FanXingTest01 {

    public static void main(String[] args) {

//// 泛型：指定具体类型
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1); // 编译通过
//// list1.add("a"); // 编译错误
//
//// 通配符：未知类型
//        List<?> list2 = new ArrayList<>();
//// list2.add(1); // 编译错误（除了null）
////        Object obj = list4.get(0); // 可以读取
//
//// 不使用泛型：原始类型
//        List list3 = new ArrayList();
//        list3.add(1);
//        list3.add("a");
//        Integer num = (Integer) list3.get(0); // 需要强制转换，可能运行时异常

    }
}

class FanXingTest01_1<T> {
    void calc() {
        ArrayList<T> arrayList = new ArrayList<>();
        ArrayList<?> arrayList1 = new ArrayList<>();
        T t = arrayList.get(1);
        arrayList1 = arrayList;
        //泛型捕获
        //arrayList1.add(arrayList1.get(0));
        catptureMthod(arrayList1);
    }

    /**
     * 泛型捕获
     */
    public <T> void catptureMthod(ArrayList<T> tt) {
        tt.add(tt.get(0));
        System.out.println(tt.get(0));
    }
}