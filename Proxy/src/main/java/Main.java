public class Main {
    public static void main(String[] args) {

        // create library
        Library library = new Library();

        // create users
        User testUser1 = new User("testuser1");
        User testUser2 = new User("testuser2");

        // create documents
        library.createUnprotectedDocument(1, "Unprotected content");
        library.createProtectedDocument(2, "Protected content");

        // allow access for testuser1
        AccessControlService acs = AccessControlService.getInstance();
        acs.allowAccess("testuser1", 2);

        // get documents
        Document doc1 = library.getDocument(1);
        Document doc2 = library.getDocument(2);

        System.out.println("Doc1 (testuser1): " + doc1.getContent(testUser1));
        System.out.println("Doc1 (testuser2): " + doc1.getContent(testUser2));

        System.out.println();

        try {
            System.out.println("Doc2 (testuser1): " + doc2.getContent(testUser1));
        } catch (AccessDeniedException e) {
            System.out.println("Doc2 (testuser1): " + e.getMessage());
        }

        try {
            System.out.println("Doc2 (testuser2): " + doc2.getContent(testUser2));
        } catch (AccessDeniedException e) {
            System.out.println("Doc2 (testuser2): " + e.getMessage());
        }

        System.out.println();

        System.out.println("Doc2 creation date: " + doc2.getCreationDate());
    }
}