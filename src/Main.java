

public class Main {
    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = System.out::println;
        ErrorWorker.OnTaskErrorListener listenerError = System.out::println;

        Worker worker = new Worker(listener);
        ErrorWorker errorWorker = new ErrorWorker(listenerError);

        worker.start();
        errorWorker.start();
    }

}