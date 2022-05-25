public class MyThread extends Thread {

    /*
    When one thread write to variable and one or some threads read this variable,
    we need use keyword 'volatile', and 'running' always be placed in main memory, not in cash
    * */

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
