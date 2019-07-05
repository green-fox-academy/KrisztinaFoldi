import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int x1 = 160;
        int y1 = 10;
        int x2 = 160;
        int y2 = 160;

        drawStar(graphics, x1, y1, x2, y2);


    }
    public static void drawStar (Graphics graphics, int x1, int y1, int x2, int y2) {
        for (int i = 0; i < 17; i++) {
            graphics.drawLine(x1, y1+10*i, x2+10*i, y2);
            graphics.drawLine(x1, y1+10*i, x2-10*i, y2);
            graphics.drawLine(0+10*i, y2, x1, y2+10*i);
            graphics.drawLine((x1*2)-10*i, y2, x1, y2+10*i);
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