public class SuggestionsHandler extends Handler {
    private static final Message.Type type = Message.Type.DEVELOPMENT_SUGGESTIONS;

    @Override
    public void handle(Message message) {
        if (message.getType().equals(type)) {
            System.out.println("'Development Suggestions' logged and prioritized.");
        } else {
            System.out.println("Not of type: 'Development Suggestions', sending to next handler.");
            super.handle(message);
        }
    }
}
