public class Q1Orange extends Q1Fruit {

    Q1Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

