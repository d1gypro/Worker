public class Worker {

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    private OnTaskDoneListener callback;
    private ErrorWorker.OnTaskErrorListener errorCallback;


    public Worker(OnTaskDoneListener callback, ErrorWorker.OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i != 33)  {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Task " + i + " is error");
            }
        }
    }
}