package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ReuleauxTriangleDemo extends JFrame {
    private static final int WINDOW_SIZE = 600;
    private int innerTriangles;

    public ReuleauxTriangleDemo(int innerTriangles) {
        this.innerTriangles = innerTriangles;
        setTitle("Треугольник Рёло");
        setSize(WINDOW_SIZE, WINDOW_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        int side = 500;
        int height = (int) (Math.sqrt(3) * side / 2);
        int[] xPoints = {(WINDOW_SIZE - side) / 2, WINDOW_SIZE / 2, (WINDOW_SIZE + side) / 2};
        int[] yPoints = {(WINDOW_SIZE + height) / 2, (WINDOW_SIZE - height) / 2, (WINDOW_SIZE + height) / 2};

        g2d.drawPolygon(xPoints, yPoints, 3);

        for (int i = 0; i < 3; i++) {
            int cx = xPoints[i];
            int cy = yPoints[i];
            Ellipse2D circle = new Ellipse2D.Double(cx - side / 2.0, cy - side / 2.0, side, side);
            g2d.draw(circle);
        }

        // Рисование внутренних треугольников
        for (int i = 0; i < innerTriangles; i++) {
            side -= 40;  // уменьшение размера стороны внутренних треугольников
            height = (int) (Math.sqrt(3) * side / 2);
            xPoints[0] = (WINDOW_SIZE - side) / 2;
            xPoints[1] = WINDOW_SIZE / 2;
            xPoints[2] = (WINDOW_SIZE + side) / 2;
            yPoints[0] = yPoints[2] = (WINDOW_SIZE + height) / 2;
            yPoints[1] = (WINDOW_SIZE - height) / 2;
            g2d.drawPolygon(xPoints, yPoints, 3);
        }
    }

}
