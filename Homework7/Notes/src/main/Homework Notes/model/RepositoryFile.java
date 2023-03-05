package model;

import intefaces.Repository;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private NotesMapper mapper = new NotesMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Notes> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Notes> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public String CreateNote(Notes note) {

        List<Notes> notes = getAllNotes();
        int max = 0;
        for (Notes item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveNote(notes);
        return id;
    }

    @Override
    public void saveNote(List<Notes> notes) {
        List<String> lines = new ArrayList<>();
        for (Notes item: notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
