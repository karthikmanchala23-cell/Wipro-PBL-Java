public class Q1Apple extends Q1Fruit {

    Q1Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

