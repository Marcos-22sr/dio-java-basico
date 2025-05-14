package service;

import dao.CardDAO;
import model.Board;

import java.util.Scanner;

public class CardService {
    private CardDAO cardDAO = new CardDAO();

    public void manageBoard(Scanner scanner, Board board) {
        while (true) {
            System.out.println("\n===== MENU BOARD: " + board.getName() + " =====");
            System.out.println("1 - Criar card");
            System.out.println("2 - Mover card");
            System.out.println("3 - Cancelar card");
            System.out.println("4 - Bloquear card");
            System.out.println("5 - Desbloquear card");
            System.out.println("6 - Gerar relatórios");
            System.out.println("7 - Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1: cardDAO.createCard(scanner, board); break;
                case 2: cardDAO.moveCard(scanner, board); break;
                case 3: cardDAO.cancelCard(scanner, board); break;
                case 4: cardDAO.blockCard(scanner, board); break;
                case 5: cardDAO.unblockCard(scanner, board); break;
                case 6: cardDAO.generateReports(board); break;
                case 7: return;
                default: System.out.println("Opção inválida.");
            }
        }
    }
}
