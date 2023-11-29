package chap01.item01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListQuiz {
    public static void main(String[] args) {
        List<Integer> numbers =  new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        Comparator<Integer> desc = (o1, o2) -> o2 - o1;

        numbers.sort(desc.reversed());
    }
}
