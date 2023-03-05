package intefaces;

import java.util.List;

public interface FOperation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
