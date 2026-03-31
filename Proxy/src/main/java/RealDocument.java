import java.util.Date;

public class RealDocument implements Document {
    private final int id;
    private final Date date;
    private String content;

    public RealDocument(int id, Date date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }

    @Override
    public String getContent(User user) {
        return this.content;
    }

    @Override
    public Date getCreationDate() {
        return this.date;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
