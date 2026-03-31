import java.util.Date;
import java.util.HashMap;

public class Library {
    private HashMap<Integer, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(Document document) {
        documents.put(document.getId(), document);
    }

    public Document getDocument(int id) {
        return documents.get(id);
    }

    public void createUnprotectedDocument(int id, String content) {
        Date date = new Date();
        RealDocument doc = new RealDocument(id, date, content);
        documents.put(id, doc);
    }

    public void createProtectedDocument(int id, String content) {
        Date date = new Date();
        RealDocument realDoc = new RealDocument(id, date, content);
        DocumentProxy proxy = new DocumentProxy(realDoc);
        documents.put(id, proxy);
    }
}
