package test05;

public class NotebookManager {
    private Notebook notebook;

    public static NotebookManager instance = new NotebookManager();

    private NotebookManager() {
        notebook = new Notebook();
    }

    public static NotebookManager getInstance() {
        return instance;
    }

    public void rentNotebook(int count) {
        notebook.rentNotebook(count);
    }

    public void returnNotebook(int count) {
        notebook.returnNotebook(count);
    }

    public void showInfo() {
        notebook.showInfo();
    }
}
