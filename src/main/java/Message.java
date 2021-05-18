import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {

    private String from;
    private String text;
    private LocalDateTime time;
    // getters and setters

    public Message() {
    }

    public Message(String from, String text) {
        this.from = from;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Message{" + "from='" + from + '\'' + ", text='" + text + '\'' + '}';
    }
}