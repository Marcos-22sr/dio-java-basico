package dao;

import model.Board;
import java.util.*;

public class BoardDAO {
    public void save(Board board) {
        // Salvar board no banco via JDBC
    }

    public List<Board> getAll() {
        // Retorna lista de boards do banco
        return new ArrayList<>();
    }

    public void deleteAll() {
        // Exclui todos os boards do banco
    }
}
