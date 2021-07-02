package Hometask1;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<String> correctSequence = new ArrayList<>();

// The Program logic

    public List<String> getCorrectSequence() {
        return correctSequence;
    }

    public void getBuilderAndPrint() {
        correctSequence.stream().forEach(x-> System.out.print(x + " "));

    }

    public void addToBuilder(String message) {
        correctSequence.add(message);
    }
}
