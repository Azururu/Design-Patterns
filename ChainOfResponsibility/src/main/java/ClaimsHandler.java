public class ClaimsHandler extends Handler {
    private static final Message.Type type = Message.Type.COMPENSATION_CLAIMS;

    @Override
    public void handle(Message message) {
        if (message.getType().equals(type)) {
            System.out.println("'Compensation Claims': Reviewed and approved.");
        } else {
            System.out.println("Not of type: 'Compensation Claims', sending to next handler.");
            super.handle(message);
        }
    }
}
