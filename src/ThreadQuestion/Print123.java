package ThreadQuestion;

public class Print123 {
    private static final Object lock = new Object();
    private static int currentNumber = 1;
    private static final int MAX_NUMBER = 20; // Print up to 9 times

    public static void main(String[] args) {
        Thread t1 = new Thread(Print123::print1);
        Thread t2 = new Thread(Print123::print2);
        Thread t3 = new Thread(Print123::print3);

        t1.start();
        t2.start();
        t3.start();
    }

    public static void print1() {
        while (true) {
            synchronized (lock) {
                while (currentNumber % 3 != 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + currentNumber);
                currentNumber++;
                if (currentNumber > MAX_NUMBER) {
                    break;
                }
                lock.notifyAll();
            }
        }
    }

    public static void print2() {
        while (true) {
            synchronized (lock) {
                while (currentNumber % 3 != 2) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + currentNumber);
                currentNumber++;
                if (currentNumber > MAX_NUMBER) {
                    break;
                }
                lock.notifyAll();
            }
        }
    }

    public static void print3() {
        while (true) {
            synchronized (lock) {
                while (currentNumber % 3 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + currentNumber);
                currentNumber++;
                if (currentNumber > MAX_NUMBER) {
                    break;
                }
                lock.notifyAll();


            }
        }
    }
}

