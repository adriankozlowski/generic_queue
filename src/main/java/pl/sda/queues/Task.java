package pl.sda.queues;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate creationDate;

    public String getTitle() {
        return title;
    }

    public Task setTitle(String title) {
        this.title = title;
        return this;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Task setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
        return this;
    }
}
