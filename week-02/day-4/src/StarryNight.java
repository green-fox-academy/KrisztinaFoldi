
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        Color[] colors = new Color[3];
        colors[0] = Color.gray;
        colors[1] = Color.darkGray;
        colors[2] = Color.lightGray;

        nightSkyBackground(graphics);
        for (int i = 0; i < 550; i++) {
            int x = (int)(Math.random()*WIDTH);
            int y = (int) (Math.random()*HEIGHT);
            graphics.setColor(colors[(int) (Math.random() * colors.length)]);
            stars(graphics, x, y);
        }

    }
    public static void nightSkyBackground (Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(0,0,WIDTH, HEIGHT);
    }

    public static void stars (Graphics graphics, int x, int y) {
        graphics.fillRect(x, y,2,2 );
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