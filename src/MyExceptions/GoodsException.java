package MyExceptions;

public class GoodsException extends Exception {
    private String whoCalled;

    public GoodsException(String whoCalled, String message) {
        super(message);
        this.whoCalled = whoCalled;
    }

    public String GetWhoCalled() {
        return whoCalled;
    }
}
