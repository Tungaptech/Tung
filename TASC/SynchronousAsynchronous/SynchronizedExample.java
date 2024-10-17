package SynchronousAsynchronous;

public class SynchronizedExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Tạo 10 thread để tăng biến count
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        // Chờ tất cả thread hoàn thành
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // In ra giá trị cuối cùng của count
        System.out.println("Final count: " + counter.getCount());
    }
}