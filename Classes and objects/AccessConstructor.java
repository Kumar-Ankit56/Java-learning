class cylinder {
    public int radius;
    public int height;

    cylinder(int r, int h) {
        this.height = h;
        this.radius = r;
    }

    public int getradius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getheight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class AccessConstructor {
    public static void main(String[] args) {
        cylinder mycylinder = new cylinder(6, 12);
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    }
}
