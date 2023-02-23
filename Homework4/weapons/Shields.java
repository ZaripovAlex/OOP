package weapons;

import interfaces.RightHand;

import java.util.Random;

public class Shields implements RightHand {
        private Random rnd = new Random();
        private String qual;


    public float defence() {
        float defence = rnd.nextFloat();
        if (defence>0.1 && defence<0.2) qual = "Обычный";
        else if (defence>=0.2f && defence< 0.4f) this.qual = "Качественный";
        else if (defence>=0.4f && defence< 0.6f) this.qual = "Отличный";
        else if (defence>=0.6f && defence< 0.7f) this.qual = "Эпический";
        else if (defence>=0.7f && defence < 0.8f) this.qual = "Легендарный";
            else defence = 0.8f;
        return defence;
    }

    public String getQual() {
        return qual;
    }

    @Override
    public String toString() {
        return " \nЩит защита:" + defence() + " качество " + this.qual;
    }
}
