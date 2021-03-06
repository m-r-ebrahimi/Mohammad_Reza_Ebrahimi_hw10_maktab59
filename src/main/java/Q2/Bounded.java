package Q2;

public class Bounded<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Bounded<Integer> integerBox = new Bounded<Integer>();
        integerBox.set(10);
        //integerBox.inspect("some text"); // error: this is still String!
    }
}
