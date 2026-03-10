public class RequestsHandler extends Handler {
    private static final Message.Type type = Message.Type.CONTACT_REQUESTS;

    @Override
    public void handle(Message message) {
        if (message.getType().equals(type)) {
            System.out.println("'Contact Request' forwarded to the appropriate department.");
        } else {
            System.out.println("Not of type: 'Contact Request', sending to next handler.");
            super.handle(message);
        }
    }
}
