package boardgame;

public class BoardException extends RuntimeException {
    private static final long serialVersionUID = 1l;

    public BoardException(String mensage){
        super(mensage);
    }
}
