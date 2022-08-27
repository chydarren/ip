public class Task {
    protected String description;
    protected Boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public String getDescription() {
        return description;
    }

    public void setStatus(Boolean isDone) {
        this.isDone = isDone;
    }

    public String getTaskDetails() {
        return "[" + getStatusIcon() + "] " + description;
    }
}
