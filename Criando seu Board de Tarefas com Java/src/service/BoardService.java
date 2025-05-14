package service;

import dao.BoardDAO;
import model.Board;
import model.BoardColumn;
import model.ColumnType;

import java.util.*;

public class BoardService {
    private BoardDAO boardDAO = new BoardDAO();
    private CardService cardService = new CardService();

    public void createBoard(Scanner scanner) {
        System.out.print("Nome do board: ");
        String name = scanner.nextLine();
        Board board = new Board(name);

        board.addColumn(new BoardColumn("A Fazer", 0, ColumnType.INICIAL));
        board.addColumn(new BoardColumn("Em Progresso", 1, ColumnType.PENDENTE));
        board.addColumn(new BoardColumn("Concluído", 2, ColumnType.FINAL));
        board.addColumn(new BoardColumn("Cancelado", 3, ColumnType.CANCELAMENTO));

        boardDAO.save(board);
        System.out.println("Board criado com sucesso.");
    }

    public void selectBoard(Scanner scanner) {
        List<Board> boards = boardDAO.getAll();
        if (boards.isEmpty()) {
            System.out.println("Nenhum board cadastrado.");
            return;
        }
        for (int i = 0; i < boards.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, boards.get(i).getName());
        }
        System.out.print("Selecione um board: ");
        int idx = Integer.parseInt(scanner.nextLine()) - 1;
        if (idx >= 0 && idx < boards.size()) {
            cardService.manageBoard(scanner, boards.get(idx));
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void deleteBoards(Scanner scanner) {
        boardDAO.deleteAll();
        System.out.println("Boards excluídos com sucesso.");
    }
}
