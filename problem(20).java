// 20. Thread Priority System
// Create a class ThreadPrioritySystem. Create multiple threads
// and assign different priorities and observe execution order.
// Output: Thread execution messages.

class ThreadPrioritySystem extends Thread {
    public ThreadPrioritySystem(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }

    public static void main(String[] args) {
        ThreadPrioritySystem t1 = new ThreadPrioritySystem("Thread1");
        ThreadPrioritySystem t2 = new ThreadPrioritySystem("Thread2");
        ThreadPrioritySystem t3 = new ThreadPrioritySystem("Thread3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

