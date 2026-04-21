package com.assignment.prototype;

import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Controller {

    @FXML
    private ListView<Recommendation> recommendationList;

    @FXML private ListView<Book> bookList;

    @FXML
    private TextField authorField;
    @FXML
    private TextField titleField;
    @FXML
    private TextField genreField;
    @FXML
    private TextField yearField;
    @FXML
    private TextField targetAudienceField;

    @FXML
    private void initialize() {
        List<Book> books = new ArrayList<>();

        Recommendation recommendation = new Recommendation("Students", books);

        recommendationList.getItems().add(recommendation);

        recommendationList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                bookList.getItems().clear();
                bookList.getItems().addAll(newValue.getRecommendedBooks());
            }
        });
    }

    private void showEditDialog(Recommendation rec) {
        javafx.scene.control.TextInputDialog dialog =
                new javafx.scene.control.TextInputDialog(rec.getTargetAudience());

        dialog.setTitle("Edit Target Audience");
        dialog.setHeaderText("Modify recommendation");
        dialog.setContentText("Target Audience:");

        dialog.showAndWait().ifPresent(newValue -> {
            if (!newValue.trim().isEmpty()) {
                rec.setTargetAudience(newValue);
            }
        });
    }

    @FXML
    public void handleAddBook() {
        if (authorField.getText().isEmpty() || titleField.getText().isEmpty() || genreField.getText().isEmpty() || yearField.getText().isEmpty()) {
            return;
        }
        Book book = new Book(
                authorField.getText(),
                titleField.getText(),
                genreField.getText(),
                parseInt(yearField.getText()));

        Recommendation selected = recommendationList.getSelectionModel().getSelectedItem();

        if (selected != null) {
            selected.addBook(book);
            bookList.getItems().add(book);
        }
    }

    @FXML
    public void handleRemoveBook() {
        Book book = bookList.getSelectionModel().getSelectedItem();
        Recommendation selected = recommendationList.getSelectionModel().getSelectedItem();

        if (selected != null) {
            selected.getRecommendedBooks().remove(book);
            bookList.getItems().remove(book);
        }
    }

    @FXML
    public void handleClone() {
        if (recommendationList.getSelectionModel().getSelectedItem() == null) {
            return;
        }
        Recommendation recommendation = recommendationList.getSelectionModel().getSelectedItem();
        recommendationList.getItems().add(recommendation.clone());
    }

    @FXML
    public void handleCreateList() {
        if (targetAudienceField.getText().isEmpty()) {
            return;
        }
        Recommendation newRecommendation = new Recommendation(targetAudienceField.getText(), new ArrayList<>());
        recommendationList.getItems().add(newRecommendation);
    }
}
