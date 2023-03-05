package intefaces;

import model.Notes;

import java.util.List;

public interface Repository {
    List<Notes> getAllNotes();

    String CreateNote(Notes notes);

    void saveNote(List<Notes> notes);
}
