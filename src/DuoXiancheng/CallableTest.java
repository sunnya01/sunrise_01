package DuoXiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


public class CallableTest {
    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception{
            return 5;
        }
    }
    public static void main(String[] args) {
        Task task = new Task();
//        内部匿名类形式
//        FutureTask<Integer> future = new FutureTask<>(
//                new Callable<Integer>() {
//                    @Override
//                    public Integer call() throws Exception {
//                        return 5;
//                    }
//                }
//
//        );
        FutureTask<Integer> future = new FutureTask<>(
                //使用lambda表达式直接编写Callable的call()方法逻辑
                ()-> {
                    return 5;
                }
        );
        Thread thread = new Thread(future);
        thread.start();
        try {
            System.out.printf(String.valueOf(future.get()));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
