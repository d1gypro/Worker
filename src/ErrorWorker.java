public class ErrorWorker {

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    private OnTaskErrorListener errorCallback;

    public ErrorWorker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i == 33)  {
                errorCallback.onError("Task " + i + " is error");
            }
        }
    }
}
