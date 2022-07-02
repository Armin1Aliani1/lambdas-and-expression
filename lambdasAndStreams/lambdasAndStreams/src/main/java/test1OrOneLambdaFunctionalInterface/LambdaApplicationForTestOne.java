package test1OrOneLambdaFunctionalInterface;

public class LambdaApplicationForTestOne {
    public static void main(String[] args) {

        int number = 100;
        // Function Descriptor
        FunctionalInterfaceWithTypeIntForCalculation functionalInterfaceWithTypeIntForCalculationAddition = (int x, int y) -> x + y + 80;
        FunctionalInterfaceWithTypeIntForCalculation functionalInterfaceWithTypeIntForCalculationSubtraction = (x, y) -> x - y;
        FunctionalInterfaceWithTypeIntForCalculation thisIsMyFunctionalInterfaceWithTypeIntForCalculation = (x, y) -> {
            int intOne = x + y;
            int intTwo = x - y;
            int intThree = x * y;
            return intOne + intTwo + intThree + number;
        };
        // Function Descriptor
        System.out.println("Calculation addition : " + functionalInterfaceWithTypeIntForCalculationAddition.calculate(20, 6));
        System.out.println("Calculation subtraction : " + functionalInterfaceWithTypeIntForCalculationSubtraction.calculate(20, 6));
        System.out.println("This is my calculation : " + thisIsMyFunctionalInterfaceWithTypeIntForCalculation.calculate(20, 6));

        /*Calculation calculationAddition = new Addition();
        System.out.println("Calculation addition : "+calculationAddition.calculate(20,6));
        Calculation calculationSubtraction = new Subtraction();
        System.out.println("Calculation subtraction : "+calculationSubtraction.calculate(20,6));*/

    }
}
