package Hometask2.src;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int min;
    private int max;

    private int randomNumber;
    private List<Integer> userPicks = new ArrayList<>();

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setRandomNumber(int min, int max){
        randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public int getRandomNumber() {
        return randomNumber;
    }
    public boolean checkGuess (int guess) {
        userPicks.add(guess);
        if (guess == randomNumber) {
            return false;
        } else if (guess > randomNumber) {
            max = guess;
        } else {
            min = guess;
        }
        return true;
    }
    public List<Integer> getUserPicks(){
        return userPicks;
    }
}
