import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){

        for (int i = 1; i < 16; i++) {
            graphics.setColor(new Color(255,0,255));
            upperLineDrawer(graphics, 20*i, 20*i);
            graphics.setColor(new Color(0,128,0));
            lowerLineDrawer(graphics, 20*i, 20*i);
        }
        
    }

    public static void upperLineDrawer (Graphics graphics, int x, int y) {
        graphics.drawLine(x, 0, 320, y);
    }

    public static void lowerLineDrawer (Graphics graphics, int x, int y) {
        graphics.drawLine(0, y, x, 320);
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
