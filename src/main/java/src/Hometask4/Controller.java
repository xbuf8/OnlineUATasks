package src.Hometask4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Controller element;
 Created by Kyrylo Khliebnykov on 05.07.2021.
 */
public class Controller {
    private Record record;
    private View view;
    private Model model;
    private String surname;
    private String name;
    private String nickname;


public Controller(Model model, View view){
    this.model = model;
    this.view = view;
}

    // The Work method
    public void processData() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.START_MESSAGE);
        view.printMessage(View.INSERT_SURNAME);
        //validation name
        while(!checkSurname(surname = inputWithScanner(sc)));
        view.printMessage(View.INSERT_NAME);
        while(!checkName(name = inputWithScanner(sc)));
        //validation nickname
        view.printMessage(View.INSERT_NICKNAME);
        while(!checkNickname(nickname = inputWithScanner(sc)));
        //insert a new record
        model.addRecord(new Record(surname,name,nickname));
        model.printRecords();
        view.printMessage(View.INSERT_SUCCESS);

    }

    private String inputWithScanner(Scanner sc) {
        return sc.nextLine();
    }

    /**
        In this method we are checking if the surname is according to the pattern
     */
    public boolean checkSurname(String name) {
        Pattern inputNamePattern = Pattern.compile("[A-Z][a-z]+([ '-][A-Z][a-z]+)*");
        Matcher inputNameMatcher = inputNamePattern.matcher(name);
        if(inputNameMatcher.matches()){
            return true;
        }

        view.printMessage(View.INSERT_MISTAKE);
        view.printMessage(View.RULES_SURNAME);
        view.printMessage(View.TRY_AGAIN);
        return false;
    }
    /**
     In this method we are checking if the name is according to the pattern
     */
    public boolean checkName(String name) {
        Pattern inputNamePattern = Pattern.compile("[A-Z][a-z]*");
        Matcher inputNameMatcher = inputNamePattern.matcher(name);
        if(inputNameMatcher.matches()){
            return true;
        }

        view.printMessage(View.INSERT_MISTAKE);
        view.printMessage(View.RULES_NAME);
        view.printMessage(View.TRY_AGAIN);
        return false;
    }

    /**
     In this method we are checking if the nickname is according to the pattern
     */
    public boolean checkNickname(String nickname) {
        Pattern lettersPattern = Pattern.compile("([A-Za-z0-9]){3,30}");
        Matcher lettersMatcher = lettersPattern.matcher(nickname);
        if(lettersMatcher.matches()){
            return true;
        }

        view.printMessage(View.INSERT_MISTAKE);
        view.printMessage(View.RULES_NICKNAME);
        view.printMessage(View.TRY_AGAIN);
        return false;
    }
}
