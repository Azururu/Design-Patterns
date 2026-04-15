import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> recommendedBooks;

    public Recommendation(String targetAudience, List<Book> recommendedBooks) {
        this.targetAudience = targetAudience;
        this.recommendedBooks = recommendedBooks;
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation clonedRecommendation = (Recommendation) super.clone();
            // Deep copy of the recommendedBooks list
            List<Book> clonedBooks = new ArrayList<>();
            for (Book book : this.recommendedBooks) {
                clonedBooks.add(book.clone());
            }
            clonedRecommendation.recommendedBooks = clonedBooks;
            return clonedRecommendation;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
