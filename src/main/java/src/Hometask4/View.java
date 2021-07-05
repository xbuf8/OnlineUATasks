package src.Hometask4;
/**
 View parts for the console output;
 Created by Kyrylo Khliebnykov on 05.07.2021.
 */
public class View {
    public static final String START_MESSAGE = "Hello, please enter the user details.";
    public static final String INSERT_SURNAME = "Please enter a surname: ";
    public static final String RULES_SURNAME = "Surname should start with a capital letter, can have more then one word, only letters! ";
    public static final String RULES_NAME = "Name should start with a capital letter, only letters! ";
    public static final String INSERT_NAME = "Please enter a name: ";
    public static final String INSERT_NICKNAME = "Please enter a nickname: ";
    public static final String RULES_NICKNAME = "Nickname can consist only letters and numbers!";

    public static final String INSERT_MISTAKE = "Something went wrong, please enter a correct data! ";
    public static final String INSERT_SUCCESS = "Record successfully added! ";
    public static final String TRY_AGAIN = "Please enter the data according to regex ";


    // Utilities methods
    public void printMessage (String message){
        System.out.println(message);
    }

}
