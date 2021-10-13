package Q2;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        addNumbers(list);
    }
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
