import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics){

        int x = 10;
        int y = 10;
        int z =2;
        for (int j = 0; j <2 ; j++) {
            for (int i = 0; i < 1; i++) {
                lines(graphics, x, y, z);
            }


        }


    }


    public static void lines ( Graphics graphics, int x, int y, int z) {
        for (int i = 0; i < 16; i++) {
            graphics.drawLine(x*i, 0, 320/ z, y*i);
            graphics.drawLine(0, y*i, x*i, 320 / z);

        }
//
//    public static void lines ( Graphics graphics, int x, int y) {
//        graphics.drawLine(x, 0, 320/2, y);
//        graphics.drawLine(0, y, x, 320/2);
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