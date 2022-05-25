import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyThread firstThread = new MyThread();

        firstThread.start();

        Scanner scanner = new Scanner(System.in);

        // when we use key 'Enter', we'r stopping thread 'firstThread'
        // but scanner.nextLine maybe Not work correctly, see 'cache coherency'
        // and we need use keyword 'volatile' in class MyThread for variable 'boolean running'

        scanner.nextLine(); // wait for key press

        firstThread.shutdown(); // shutdown thread after use key 'Enter'
    }
}
