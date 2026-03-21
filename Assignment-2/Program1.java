import java.util.concurrent.*;

class PrimeUtil {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

class PrimeThread extends Thread {
    int start, end;

    PrimeThread(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        System.out.println("Thread Method:");
        for (int i = start; i <= end; i++) {
            if (PrimeUtil.isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}

class PrimeRunnable implements Runnable {
    int start, end;
    String label;

    PrimeRunnable(int s, int e, String label) {
        start = s;
        end = e;
        this.label = label;
    }

    public void run() {
        System.out.println(label);
        for (int i = start; i <= end; i++) {
            if (PrimeUtil.isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}

public class Program1 {
    public static void main(String[] args) throws Exception {

        int start = 1, end = 50;

        PrimeThread t1 = new PrimeThread(start, end);
        t1.start();
        t1.join();  

        Thread t2 = new Thread(new PrimeRunnable(start, end, "Runnable Method:"));
        t2.start();
        t2.join();   

        ExecutorService ex = Executors.newFixedThreadPool(1);
        ex.execute(new PrimeRunnable(start, end, "Executor Method:"));
        ex.shutdown();
    }
}
