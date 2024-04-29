package ThreadQuestion;

public class PrintOddEven {
    private static int count = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread oddThread = new Thread(PrintOddEven::printOdd);
        Thread evenThread = new Thread(PrintOddEven::printEven);

        oddThread.start();
        evenThread.start();
    }

    public static void printOdd() {
        synchronized (lock) {
            while (count <= 10) {
                if (count % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    lock.notify(); // Notify the waiting thread (evenThread)
                } else {
                    try {
                        lock.wait(); // Wait for the other thread to notify
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void printEven() {
        synchronized (lock) {
            while (count <= 10) {
                if (count % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    lock.notify(); // Notify the waiting thread (oddThread)
                } else {
                    try {
                        lock.wait(); // Wait for the other thread to notify
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

