package text1;


public class CatNotFoundException extends RuntimeException{
    public CatNotFoundException() {
        super();
    }

    public CatNotFoundException(String message) {
        super(message);
    }

    public CatNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CatNotFoundException(Throwable cause) {
        super(cause);
    }

    public CatNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
