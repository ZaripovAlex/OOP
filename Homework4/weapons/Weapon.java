package weapons;

import java.util.Random;

public class Weapon {
    Random rnd = new Random();
    private String qual = null;



    @Override
    public String toString() {
        return " Качество: "+ this.qual;
    }
}
