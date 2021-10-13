package Q2;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
    public static void main(String[] args) throws ClassNotFoundException
    {
        List<Object> objects = new ArrayList<>();
        objects.add(new Object());
        objects.add(new Person("Don Draper", 89));
        System.out.println(objects);


        List<?> wildcards = new ArrayList<>();
        wildcards.add(null);
        System.out.println(wildcards);
    }
}
