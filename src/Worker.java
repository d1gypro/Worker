public class Worker {

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    private OnTaskDoneListener callback;


    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i != 33)  {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
