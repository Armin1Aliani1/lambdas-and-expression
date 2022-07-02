package test2OrTwoLambdaFunctionalInterface;

public class LambdaApplicationForTestTwo {
    public static void main(java.lang.String[] args) {

        String myStrOne = "Hello ";
        FunctionalInterfaceWithTypeStringForTotalStrings stringOne = (String w, String z) -> {
            String myStrTwo = w + " " + z;
            return myStrOne + myStrTwo;
        };
        System.out.println(stringOne.stringOne("Armin", "Aliani"));

    }
}
