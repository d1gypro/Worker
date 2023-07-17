public class ErrorWorker {

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    private OnTaskErrorListener errorCallback;

    public ErrorWorker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }
}
