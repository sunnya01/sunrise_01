package BasicTest;
/*
研究栈内存溢出时是否跟每一层栈中的变量个数有关系
结论：
1. 栈空间的溢出层数上线与变量个数没有直接的函数关系
2. 栈空间的回收需要一定的时间短时间内重复执行引发的栈溢出会导致层数上限变小
3. Debug会占用栈空间导致原来的溢出上限变为原来的一半，可能是因为Debug输出的栈信息的本质是再原来的栈层上面执行了另一层Debug代码
   sout也会导致的输出流额外占用了栈空间
4. 因此勉强得出结论，栈是包含了所执行代码的栈，它与当前所执行的方法以及方法内的变量是占用一层栈的，每一层代码的调用都会独立占用一个栈空间，当前方法
   执行结束后，代码和变量以及变量对应的堆空间内存从堆栈中清空
5. 堆栈区是随着代码的执行动态变化的， 方法区 是静态的，class文件中的代码会在这里静态保存，class文件中的常量等也会在方法区中静态占用方法区空间
 */
public class StackTest {

    static  int gv_total ;
    static  int gv_total1 ;
    static  int gv_total2 ;

    public static void main(String[] args) {

        int lv_int = 1;
        int lv_int2 = 1;

        Internal.CallBack(lv_int,lv_int2);
    }
    static class Internal{
        static void CallBack(int iv_int,int iv_int2){

            System.out.println(gv_total);

            gv_total++;

//            if (gv_total == 12000)
//                System.out.println("123");
            if (gv_total == 12000){
//                int cc = 1;
//                int bb = 1;
//                int aa = 1; int gg = 1;
//                System.out.println("123");
                gv_total1 = 2;
                gv_total2 = 2;
            }

            CallBack(iv_int,iv_int2);

        }

    }

}
