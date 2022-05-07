package MyExceptions;

public class WarehouseException extends Exception {
    private String whoCalled;

    public WarehouseException(String whoCalled, String message) {
        super(message);
        this.whoCalled = whoCalled;
    }

    public String GetWhoCalled() {
        return whoCalled;
    }
}
