package test5OrFiveLambdaConsumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LambdaApplicationForTestFive {
    public static void main(String[] args) {

        /*Consumer<Integer> display = a -> System.out.println(a*20);
        display.accept(12);*/

        Consumer<List<Integer>> modify = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, 2 * list.get(i));
            }
        };

        List<Integer> myListOne = new ArrayList<>();

        Collections.addAll(myListOne, 10, 20, 30);

        myListOne.add(50);
        myListOne.add(60);
        myListOne.add(70);

        modify.accept(myListOne);

        System.out.println(myListOne);

    }
}
