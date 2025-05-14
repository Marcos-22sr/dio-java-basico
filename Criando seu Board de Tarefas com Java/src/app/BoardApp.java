package app;

import java.util.Scanner;
import service.BoardService;

public class BoardApp {
    private Scanner scanner = new Scanner(System.in);
    private BoardService boardService = new BoardService();

    public void run() {
        while (true) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Criar novo board");
            System.out.println("2 - Selecionar board");
            System.out.println("3 - Excluir boards");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1: boardService.createBoard(scanner); break;
                case 2: boardService.selectBoard(scanner); break;
                case 3: boardService.deleteBoards(scanner); break;
                case 4: return;
                default: System.out.println("Opção inválida.");
            }
        }
    }
}
