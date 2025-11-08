import java.awt.*;
import javax.swing.*;

public class ShapesExample extends JFrame {

    public ShapesExample() {
        setTitle("Drawing Shapes Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Set color
        g.setColor(Color.BLUE);
        g.drawRect(50, 80, 100, 60);  // Rectangle

        g.setColor(Color.RED);
        g.drawOval(200, 80, 100, 60);  // Oval

        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 300, 200);  // Line

        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Hello, Graphics!", 100, 300);  // Text
    }

    public static void main(String[] args) {
        new ShapesExample();
    }
}
