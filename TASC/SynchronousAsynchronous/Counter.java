package SynchronousAsynchronous;

class Counter {
    private int count = 0;

    // Phương thức synchronized
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
