package cn.oreo5.exception;

public class NameAlreadyExistException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NameAlreadyExistException() {
        super();
    }

    public NameAlreadyExistException(String message) {
        super(message);
    }

    public NameAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameAlreadyExistException(Throwable cause) {
        super(cause);
    }

    protected NameAlreadyExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
