public class FeedbackHandler extends Handler {
    private static final Message.Type type = Message.Type.GENERAL_FEEDBACK;

    @Override
    public void handle(Message message) {
        if (message.getType().equals(type)) {
            System.out.println("'General Feedback': Analyzed and responded to.");
        } else {
            System.out.println("Not of type: 'General Feedback', sending to next handler.");
            super.handle(message);
        }
    }
}
