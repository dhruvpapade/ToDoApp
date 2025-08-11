import java.io.Serializable;

public class Task implements Serializable {
    private static final long serialVersionUID = 1L;

    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return (completed ? "[✔] " : "[ ] ") + description;
    }
}
