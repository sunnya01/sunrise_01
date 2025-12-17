package DuoXiancheng;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sunchaowei
 * @create 2025-2025/12/16-16:01
 */
public class ThreadWait extends Thread {
    static Object obj = new Object();
    static int i = 0;

    @Override
    public void run() {
        System.out.println("线程1开始执行代码");

        synchronized (obj) {

            for (; ; ) {
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (i == 20) {
                    try {
                        System.out.println("obj对象准备不足等待准备完成再继续执行");
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(i++);
                if (i > 40) break;
            }
        }

    }

    private ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        ThreadWait t1 = new ThreadWait();
        B t2 = new B();
        t1.start();
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}

class B extends Thread {
    @Override
    public void run() {
        synchronized (ThreadWait.obj) {
            //
            System.out.println("线程2开始帮obj做准备");
            try {
                sleep(10000);
                System.out.println("线程2帮obj准备完毕唤醒线程1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ThreadWait.obj.notify();
        }
    }
}