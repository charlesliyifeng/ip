public class Event extends Task {
    private final String from;
    private final String to;

    public Event(String name, String from, String to) {
        super(name);
        this.from = from;
        this.to = to;
    }

    public Event(boolean done, String name, String from, String to) {
        super(done, name);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toText() {
        return String.format("E | %s | %s | %s", super.toText(), from, to);
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + String.format(" (from: %s to: %s)", from, to);
    }
}
