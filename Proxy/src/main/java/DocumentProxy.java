import java.util.Date;

public class DocumentProxy implements Document {
    private RealDocument realDocument;

    public DocumentProxy(RealDocument realDocument) {
        this.realDocument = realDocument;
    }

    @Override
    public String getContent(User user) {
        AccessControlService acs = AccessControlService.getInstance();

        if (acs.isAllowed(user.getUsername(), realDocument.getId())) {
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("You are not allowed to access the document");
        }
    }

    @Override
    public Date getCreationDate() {
        return realDocument.getCreationDate();
    }

    @Override
    public int getId() {
        return realDocument.getId();
    }
}
