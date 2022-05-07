package MyExceptions;

public class ProductException extends Exception {
    private String whoCalled;

    public ProductException(String whoCalled, String message) {
        super(message);
        this.whoCalled = whoCalled;
    }

    public String GetWhoCalled() {
        return whoCalled;
    }
}
