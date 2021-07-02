package Hometask2.src;

import java.util.Scanner;

public class Controller {

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
        model.setMin(0);
        model.setMax(100);
        model.setRandomNumber(0,100);

        System.out.println(model.getRandomNumber());

        while (model.checkGuess(inputIntValueWithScanner(sc)));

        view.printMessage(View.GUESS_IS_EQUAL + model.getRandomNumber());
        view.printMessage(String.valueOf(model.getUserPicks()));
    }

    private int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printMessage("Please enter a number, Now min is: " + model.getMin() + " ,and max is: " + model.getMax());
        while (true) {
            // check int-value
            while (!sc.hasNextInt()) {
                view.printMessage("Wrong data, please insert a number!");
                sc.next();
            }
            // check value into diapason
            if ((res = sc.nextInt()) <= model.getMin() ||
                    res >= model.getMax()) {
                view.printMessage("Please enter a value MIN>X<MAX. Now min is: " + model.getMin() + " ,and max is: " + model.getMax());
                continue;
            }
            break;
        }
        return res;
    }

}


