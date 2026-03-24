import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private ObservableList<IMemento> undoHistory; // Memento history
    private List<IMemento> redoHistory;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undoHistory = FXCollections.observableArrayList();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in history");
            redoHistory.add(model.createMemento());
            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            System.out.println("Memento found in history");
            undoHistory.add(model.createMemento());
            IMemento nextState = redoHistory.remove(redoHistory.size() - 1);
            model.restoreState(nextState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        undoHistory.add(currentState);
        redoHistory.clear();
    }

    public ObservableList<IMemento> getUndoHistory() {
        return undoHistory;
    }

    public void restoreFromHistory(IMemento memento) {
        model.restoreState(memento);
        gui.updateGui();
    }
}
