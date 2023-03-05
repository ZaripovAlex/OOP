package model;

import java.util.Date;

public class Notes  extends AbstractNotes{
    private String Id;
    private String type;


    private String text;

    public Notes(String type, String text) {
        this.type = type;
        this.text = text;

    }

    public Notes(String id, String type, String text) {
        Id = id;
        this.type = "Заметка";
        this.text = text;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String ToString() {
       return String.format("ID: %s\n Тип: %s\n Текст: %s\n", Id,type,text);

    }

    public String getId() {
        return Id;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }



}