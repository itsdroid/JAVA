public class Rectangle {
    double width, length, area;
    String color;

    public Rectangle(double width, double length, String color) {
        this.width = width;
        this.length = length;
        this.area = width*length;
        this.color = color;
    }

    public boolean isEqual(Rectangle r) {
        return (this.area == r.area) && (this.color == r.color);
    }

    public void Display() {
        System.out.println("Width: " + width +
                " | Length: " + length +
                " | Area: " + area +
                " | Color: " + color);
    }

    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle(55, 66, "Red");
        Rectangle rect2 = new Rectangle(55, 66, "Red");

        System.out.println("Rectangle 1:");
        rect1.Display();

        System.out.println("\nRectangle 2:");
        rect2.Display();

        if (rect1.isEqual(rect2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

// java Rectangle.java