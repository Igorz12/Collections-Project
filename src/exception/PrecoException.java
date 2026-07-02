package exception;

import java.util.concurrent.ExecutionException;

public class PrecoException extends ExecutionException {
    public PrecoException(String mensagem) {
        super(mensagem);
    }
}
