package Collections.Projects;

public class Q3Box {

    double length, width, height;

    Q3Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Q3Box))
            return false;

        Q3Box b = (Q3Box) obj;
        return this.getVolume() == b.getVolume();
    }

    @Override
    public int hashCode() {
        return (int) getVolume();
    }
}