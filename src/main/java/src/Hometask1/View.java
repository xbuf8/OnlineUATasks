package Hometask1;

public class View {

        // Text's constants

        public static final String WRONG_INPUT_STRING_DATA = "Wrong input! Repeat please! ";

        public void printMessage(String message){
            System.out.println(message);
        }

        public void printMessageAndInt(String message, int value){
            System.out.println(message + value);
        }

    }