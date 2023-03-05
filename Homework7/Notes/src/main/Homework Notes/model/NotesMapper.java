package model;

public class NotesMapper {
    public String map(Notes notes) {
        return String.format("%s,%s,%s", notes.getId(), notes.getType(), notes.getText());
    }

    public Notes map(String line) {
        String[] lines = line.split(",");
        return new Notes(lines[0], lines[1], lines[2]);
    }
}
