package controller;

import intefaces.Repository;
import model.Notes;




import java.util.List;

public class Controller {
    private final Repository repository;

    public Controller(Repository repository)
    {
        this.repository = repository;
    }

    public void saveNote(Notes notes) throws Exception {
        repository.CreateNote(notes);
    }

    public Notes readNote(String Id) throws Exception {
        List<Notes> notes = repository.getAllNotes();
        Notes note = noteSearch(Id, notes);
        return note;
    }

    private static Notes noteSearch(String Id, List<Notes> notes) throws Exception{
        for (Notes note : notes) {
            if (note.getId().equals(Id)) {
                return note;
            }
        }
        throw new Exception("Note not found");
    }

    public List<Notes> readAllNotes(){
        return repository.getAllNotes();
    }

    public void updateUser(String Id, Notes newNote) throws Exception {
        List<Notes> notes = repository.getAllNotes();
        Notes note = noteSearch(Id,notes);
        note.setText(newNote.getType());
        note.setText(newNote.getText());
        repository.saveNote(notes);
    }

    public void deleteNote(String Id) throws Exception {
        List<Notes> notes = repository.getAllNotes();
        Notes note = noteSearch(Id,notes);
        notes.remove(note);
        reindex(notes);
        repository.saveNote(notes);
        System.out.println("Done");

    }

    private void reindex(List<Notes> notes) {
        int index = 0;
        for (Notes item: notes) {
            item.setId(""+ (index+1));
            index++;
        }
}}
