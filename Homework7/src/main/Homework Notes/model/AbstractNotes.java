package model;

public abstract class AbstractNotes {
    String Id;
    String text;
    abstract public String getId();
    abstract public void setId(String id);
    abstract public String ToString();
}
