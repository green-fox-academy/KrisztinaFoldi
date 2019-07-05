import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        triangle(graphics);

    }

    public static void triangle ( Graphics graphics) {
        int number = 34;
        for (int i = 0; i <= number; i++) {
            graphics.drawLine(WIDTH/2-5*i, 0+10*i, (WIDTH/2+(10*number/2)-10*i), 0+(10*number));
            graphics.drawLine(WIDTH/2+5*i, 0+10*i,(WIDTH/2-(10*number/2)+10*i), 0+(10*number));
            graphics.drawLine(WIDTH/2-5*i, 0+10*i, WIDTH/2+5*i, 0+10*i);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}