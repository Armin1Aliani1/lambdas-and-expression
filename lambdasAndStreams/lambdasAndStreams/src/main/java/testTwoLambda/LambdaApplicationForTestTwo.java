package testTwoLambda;

public class LambdaApplicationForTestTwo {
    public static void main(java.lang.String[] args) {

        String myStrOne = "Hello ";
        MyString stringOne = (String w, String z) -> {
            String myStrTwo = w + " " + z;
            return myStrOne + myStrTwo;
        };
        System.out.println(stringOne.stringOne("Armin", "Aliani"));

    }
}
