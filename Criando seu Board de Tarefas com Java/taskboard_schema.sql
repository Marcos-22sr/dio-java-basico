-- Criação do banco de dados
CREATE DATABASE IF NOT EXISTS taskboard_db;
USE taskboard_db;

-- Tabela de boards
CREATE TABLE boards (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

-- Tabela de colunas dos boards
CREATE TABLE board_columns (
    id INT AUTO_INCREMENT PRIMARY KEY,
    board_id INT NOT NULL,
    name VARCHAR(100) NOT NULL,
    column_order INT NOT NULL,
    column_type ENUM('INICIAL', 'PENDENTE', 'FINAL', 'CANCELAMENTO') NOT NULL,
    FOREIGN KEY (board_id) REFERENCES boards(id) ON DELETE CASCADE
);

-- Tabela de cards
CREATE TABLE cards (
    id INT AUTO_INCREMENT PRIMARY KEY,
    board_id INT NOT NULL,
    column_id INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    blocked BOOLEAN NOT NULL DEFAULT FALSE,
    FOREIGN KEY (board_id) REFERENCES boards(id) ON DELETE CASCADE,
    FOREIGN KEY (column_id) REFERENCES board_columns(id) ON DELETE CASCADE
);

-- Tabela de histórico de movimentação de cards
CREATE TABLE card_movements (
    id INT AUTO_INCREMENT PRIMARY KEY,
    card_id INT NOT NULL,
    from_column_id INT,
    to_column_id INT,
    moved_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (card_id) REFERENCES cards(id) ON DELETE CASCADE,
    FOREIGN KEY (from_column_id) REFERENCES board_columns(id),
    FOREIGN KEY (to_column_id) REFERENCES board_columns(id)
);

-- Tabela de bloqueios de cards
CREATE TABLE card_blocks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    card_id INT NOT NULL,
    blocked_at DATETIME,
    unblocked_at DATETIME,
    block_reason TEXT,
    unblock_reason TEXT,
    FOREIGN KEY (card_id) REFERENCES cards(id) ON DELETE CASCADE
);
