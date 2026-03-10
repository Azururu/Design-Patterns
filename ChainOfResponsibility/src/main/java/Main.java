public class Main {
    public static void main(String[] args) {
        Handler mainHandler;

        Handler claimsHandler = new ClaimsHandler();
        Handler requestsHandler = new RequestsHandler();
        Handler suggestionsHandler = new SuggestionsHandler();
        Handler feedbackHandler = new FeedbackHandler();

        claimsHandler.setNextHandler(requestsHandler);
        requestsHandler.setNextHandler(suggestionsHandler);
        suggestionsHandler.setNextHandler(feedbackHandler);
        mainHandler = claimsHandler;

        Message contactMsg = new Message("Pls contact me", "email@email.com", Message.Type.CONTACT_REQUESTS);
        Message compensationMsg = new Message("compensation pls", "pls@email.com", Message.Type.COMPENSATION_CLAIMS);
        Message developmentMsg = new Message("write it in rust", "aaa@email.com", Message.Type.DEVELOPMENT_SUGGESTIONS);
        Message feedbackMsg = new Message("cool project", "aaaa@gmail.com", Message.Type.GENERAL_FEEDBACK);

        mainHandler.handle(contactMsg);
        mainHandler.handle(compensationMsg);
        mainHandler.handle(developmentMsg);
        mainHandler.handle(feedbackMsg);
    }
}
