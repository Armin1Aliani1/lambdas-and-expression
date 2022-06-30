package testOneLambda;

@FunctionalInterface
public interface Calculation {
    int calculate(int a, int b);

    /*default void print(){
        System.out.println("Hello");
    }*/
}
