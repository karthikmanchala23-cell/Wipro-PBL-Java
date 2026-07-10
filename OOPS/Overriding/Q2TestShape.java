public class Q2TestShape {

    public static void main(String[] args) {

        Q2Shape c = new Q2Circle();
        Q2Shape t = new Q2Triangle();
        Q2Shape s = new Q2Square();

        c.draw();
        c.erase();

        t.draw();
        t.erase();

        s.draw();
        s.erase();
    }
}