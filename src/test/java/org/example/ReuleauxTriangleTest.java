package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReuleauxTriangleTest {

    private ReuleauxTriangle triangle;

    @BeforeEach
    public void setUp() {
        triangle = new ReuleauxTriangle(3);
    }

    @Test
    public void testInnerTrianglesValue() {
        assertEquals(3, triangle.getInnerTriangles(), "Inner triangles value is not set correctly");
    }

    @Test
    public void testWindowSize() {
        assertEquals(600, triangle.getWidth(), "Window width is not set correctly");
        assertEquals(600, triangle.getHeight(), "Window height is not set correctly");
    }

}
