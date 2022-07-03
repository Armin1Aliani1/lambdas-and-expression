package test4OrForeLambdaPracticeOneUsernameValid;

import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaApplicationForTestFore {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your username for search in text : ");
        String strOne = scanner.nextLine();

        checkForUsernameValid(strOne);
    }

    private static void checkForUsernameValid(String strOne) {
        Predicate<String> stringPredicateOne = s -> (s != null && s.length() >= 5 && s.length() <= 10);
        Predicate<String> stringPredicateTwo = s -> (s.equalsIgnoreCase("Armin"));

        boolean validOne = stringPredicateOne.test(strOne);
        Predicate<String> stringPredicateThree = stringPredicateOne.and(stringPredicateTwo);
        boolean validTwo = stringPredicateThree.test(strOne);

        System.out.println("Username valid : " + validOne);

//   Is condition if :  (condition)? "true"                                    :((else))  "false"
        String result = (validOne) ? "Length username is : " + strOne.length() : "Username should not be empty or less than 5 characters or more than 10 characters";

        System.out.println(result);

        System.out.println("Username is available : " + validTwo);
    }
}
