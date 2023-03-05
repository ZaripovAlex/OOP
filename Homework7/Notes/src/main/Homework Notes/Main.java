import controller.Controller;
import intefaces.FOperation;
import intefaces.Repository;
import model.FileOperation;
import model.RepositoryFile;
import view.View;

public class Main {
    public static void main(String[] args) {
        FileOperation file = new FileOperation("notes.txt");
        Repository repository = new RepositoryFile(file);
        Controller controller = new Controller(repository);
        View view = new View(controller);
        view.run();
    }
}
