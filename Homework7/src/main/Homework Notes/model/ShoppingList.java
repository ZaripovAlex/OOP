package model;

import java.util.List;

public class ShoppingList extends AbstractNotes{
    List<String> list;

    public ShoppingList(List<String> list) {
        super();
        this.list = list;
    }

    public String getId() {
        return null;
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public String ToString() {
        return null;
    }
}
