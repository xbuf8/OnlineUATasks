package Hometask2.src;

public class View {
    public static final String CALL_TO_ACTION="Please guess the number?";
    public static final String GUESS_IS_BIGGER = "The number is bigger then a player guess. Please try again: ";
    public static final String GUESS_IS_SMALLER = "The number is smaller then a player guess. Please try again: ";
    public static final String GUESS_IS_EQUAL = "Well done, now you know the number! It's: ";


    public void printMessage(String message){
        System.out.println(message);
    }

}
