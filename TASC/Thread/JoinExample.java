package Thread;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Giả lập tác vụ
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        thread.join(); // Chờ thread hoàn thành
        System.out.println("Thread has completed");
    }
}
