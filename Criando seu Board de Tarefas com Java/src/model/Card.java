package model;

import java.time.LocalDateTime;

public class Card {
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private boolean blocked;

    public Card(String title, String description) {
        this.title = title;
        this.description = description;
        this.createdAt = LocalDateTime.now();
        this.blocked = false;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
