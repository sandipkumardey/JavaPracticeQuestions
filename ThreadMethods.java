public class ThreadMethods extends Thread {

    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());

        Thread.yield();
        System.out.println("Thread after yield(): " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
            System.out.println("Thread after sleep(): " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while sleeping");
        }

        Thread.currentThread().stop();
        System.out.println("Thread after stop(): " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadMethods thread = new ThreadMethods();
        thread.start();
    }
}
