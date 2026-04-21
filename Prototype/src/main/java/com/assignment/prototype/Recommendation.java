package com.assignment.prototype;

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

    public void addBook(Book book) {
        recommendedBooks.add(book);
    }

    public void removeBook(Book book) {
        recommendedBooks.remove(book);
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public List<Book> getRecommendedBooks() {
        return recommendedBooks;
    }

    @Override
    public String toString() {
        return targetAudience;
    }
}
