package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {

    public ChessException(String mensagem){
        super(mensagem);
    }
}
