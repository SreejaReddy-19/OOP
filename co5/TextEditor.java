import java.util.*;

public class TextEditor {
    public static void main(String[] args) {
        LinkedList<String> undoStack = new LinkedList<>();
        LinkedList<String> redoStack = new LinkedList<>();

        undoStack.push("Type 'Hello'");
        undoStack.push("Delete 'o'");
        undoStack.push("Add '!'");

        String lastAction = undoStack.pop();
        redoStack.push(lastAction);
        System.out.println("Undo: " + lastAction);

        String redoAction = redoStack.pop();
        undoStack.push(redoAction);
        System.out.println("Redo: " + redoAction);

        System.out.println("Current Undo Stack: " + undoStack);
        System.out.println("Current Redo Stack: " + redoStack);
    }
}
