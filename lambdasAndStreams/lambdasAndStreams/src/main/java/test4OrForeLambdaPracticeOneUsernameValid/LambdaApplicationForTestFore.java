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
        Predicate<String> stringPredicateTwo = s -> (s.equalsIgnoreCase("Armi"));

        boolean validOne = stringPredicateOne.test(strOne);
        boolean validTwo = stringPredicateOne.and(stringPredicateTwo).test(strOne);

        System.out.println("Username valid : " + validOne);
        System.out.println("Username is available : " + validTwo);
    }
}
