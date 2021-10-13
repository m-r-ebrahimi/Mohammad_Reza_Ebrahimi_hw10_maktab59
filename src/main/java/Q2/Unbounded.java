package Q2;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add(new Object());
        objects.add(null);
        objects.add(new Person("Don Draper", 89));
        printList(objects);
        List<?> wildcards = new ArrayList<>();
        wildcards.add(null);
        printListNew(wildcards);
    }

    public static void printList(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }
    public static void printListNew(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }
}
