import java.util.Date;

public interface Document {
    String getContent(User user);
    Date getCreationDate();
    int getId();
}
