import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int x1StartingPoint = 155;
        int y1StartingPoint = 0;
        int number = 5;
        for (int k = 1; k <= number ; k++) {
            for (int i = 0; i < number; i++) {
                singleHexagon(graphics, x1StartingPoint, y1StartingPoint+20*i);
                for (int j = 0; j < number - 1; j++) {
                    singleHexagon(graphics, x1StartingPoint+15, (y1StartingPoint+10)+20*j);
                    singleHexagon(graphics, x1StartingPoint-15, (y1StartingPoint+10)+20*j);
                }

            }

        }



    }

    public static void singleHexagon (Graphics graphics,int x1StartingPoint, int y1StartingPoint ) {
       graphics.drawLine(x1StartingPoint, y1StartingPoint, x1StartingPoint+10, y1StartingPoint);
       graphics.drawLine(x1StartingPoint+10, y1StartingPoint, x1StartingPoint+15, y1StartingPoint+10);
       graphics.drawLine(x1StartingPoint+15, y1StartingPoint+10, x1StartingPoint+10, y1StartingPoint+20);
       graphics.drawLine(x1StartingPoint+10, y1StartingPoint+20, x1StartingPoint, y1StartingPoint+20);
       graphics.drawLine(x1StartingPoint, y1StartingPoint+20, x1StartingPoint-5, y1StartingPoint+10);
       graphics.drawLine(x1StartingPoint-5, y1StartingPoint+10, x1StartingPoint, y1StartingPoint);
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