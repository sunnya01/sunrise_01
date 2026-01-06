package DuoXiancheng;

public class RunableTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Table table = new Table();
        //使用lambda表达式实现runable接口的run()方法
        Thread students1 = new Thread(() -> {
            table.use();
        }, "s1");
        Thread students2 = new Thread(() -> {
            table.use();
        }, "s2");
        students1.start();//学生1开始使用桌子
        Thread.sleep(1000);//线程休眠
        students2.start();//学生2开始使用桌子，由于线程阻塞下面获取状态时显示BLOCKED
        Thread.sleep(500);//开始休眠
        System.out.println(students2.getState());
        //2秒后s1结束
        //s2开始进入
        //s2结束
        if (1 == 1) {
            System.out.println("123");
        } else if (2 == 2) {
        } else {

        }


    }

    static class Table {
        //定义同步方法保证同一时间只有一个线程可以进入方法
        public synchronized void use() {
            System.out.println(Thread.currentThread().getName() + "使用一张桌子");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "就餐结束");
        }
    }
}
