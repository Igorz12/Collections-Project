package exception;

import java.util.concurrent.ExecutionException;

public class EstoqueException extends ExecutionException {
    public EstoqueException(String mensagem) {
        super(mensagem);
    }
}
