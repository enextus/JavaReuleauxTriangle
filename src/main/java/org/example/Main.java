package org.example;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Введите количество внутренних треугольников:");
        int innerTriangles = Integer.parseInt(input);

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new ReuleauxTriangle(innerTriangles);
            frame.setVisible(true);
        });
    }
}