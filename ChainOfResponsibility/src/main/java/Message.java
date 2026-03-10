public class Message {

    private String content;
    private String email;
    private Type type;

    public enum Type {
        COMPENSATION_CLAIMS,
        CONTACT_REQUESTS,
        DEVELOPMENT_SUGGESTIONS,
        GENERAL_FEEDBACK
    };

    public Message(String content, String email, Type type) {
        this.content = content;
        this.email = email;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public String getEmail() {
        return email;
    }

    public Type getType() {
        return type;
    }
}
