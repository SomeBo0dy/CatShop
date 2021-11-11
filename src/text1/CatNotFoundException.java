package text1;

/**
 * @author xyj
 * @create 2021-11-11 14:34
 */
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