package test3OrThreeLambdaFunctionalInterfacePredicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaApplicationForTestThree {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your first name for search in text : ");
        String strOne = scanner.nextLine();
        System.out.println("Please enter your last name for search in text : ");
        String strTwo = scanner.nextLine();

        thisMethodForSearchFullName(strOne, strTwo);

    }

    private static void thisMethodForSearchFullName(String strOne, String strTwo) {
        Predicate<String> stringPredicateOne = s -> s.contains(strOne);
        Predicate<String> stringPredicateTwo = s -> s.contains(strTwo);
        String strThree = "Armin aliani is very good boy and armin is gentleman";

        int Counter1 = 0;
        int Counter2 = 0;

        if (stringPredicateOne.test(strThree) || stringPredicateTwo.test(strThree)) {

            boolean ValidOne = stringPredicateOne.test(strThree);
            boolean ValidTwo = stringPredicateTwo.test(strThree);
            System.out.println("Your first name valid : " + ValidOne);
            System.out.println("Your first name valid : " + ValidTwo);

            String Word1[] = strThree.split("\\s+");
            for (int i = 0; i < Word1.length; i++) {
                Word1[i] = Word1[i].replaceAll("[^\\w]", "");
                if (Word1[i].equalsIgnoreCase(strOne)) {
                    Counter1++;
                }
                if (Word1[i].equalsIgnoreCase(strTwo)) {
                    Counter2++;
                }
            }
            if (Counter1 != 0) {
                System.out.println("Your first name is mentioned " + Counter1 + " times in this text");
            }
            if (Counter2 != 0) {
                System.out.println("Your first name is mentioned " + Counter2 + " times in this text");
            }

        } else {
            System.out.println("NOT FOUND!");
        }
    }
}
