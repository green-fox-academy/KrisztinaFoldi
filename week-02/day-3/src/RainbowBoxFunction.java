import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color[] colors = new Color[7];
        colors[0] = Color.red;
        colors[1] = Color.orange;
        colors[2] = Color.yellow;
        colors[3] = Color.green;
        colors[4] = Color.blue;
        colors[5] = new Color(29, 0, 51);
        colors[6] = new Color(127, 0, 255);

        for (int i = 1; i <= 7 ; i++) {
            squareDrawer(graphics, 320/i, colors[i-1]);

        }
    }

    public static void squareDrawer (Graphics square, int size, Color color){
        square.setColor(color);
      square.fillRect(160-size/2, 160-size/2 , size, size);
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