package duke.task;

public class Event extends Task {
    private String time;

    public Event(String description, String time) {
        super(description);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String getTaskDetails() {
        return "[E]" + super.getTaskDetails() + " (at: " + getTime() + ")";
    }
}
