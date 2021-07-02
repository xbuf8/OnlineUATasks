package Hometask1;

import java.util.Scanner;

public class Controller {
    // The Constants
    public static final String firstWord = "Hello";
    public static final String lastWord = "world!";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        String checkWord = sc.nextLine();
        if(checkWord.equals(firstWord)) {
            model.addToBuilder(checkWord);
            processUser();
        } else if(checkWord.equals(lastWord) && model.getCorrectSequence().size()>0) {
            model.addToBuilder(checkWord);
            model.getBuilderAndPrint();
        } else {
            view.printMessage(View.WRONG_INPUT_STRING_DATA);
            processUser();
        }
    }

    // The Utility methods
    public String inputStringValueWithScanner(Scanner sc) {
        System.out.println("Please write something:");
        while( !sc.hasNext()) {
            view.printMessage(View.WRONG_INPUT_STRING_DATA);
            sc.next();
        }
        return sc.next();
    }
}

