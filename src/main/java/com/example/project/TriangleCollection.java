package com.example.project;

public class TriangleCollection {

    // Array to store the triangles
    private Triangle[] collection;

    // Constructor for creating the triangle collection
    public TriangleCollection(int numTriangles, int startX, int startY) {
        this.collection = new Triangle[numTriangles];
        for (int i = 0; i < numTriangles; i++) {
            // Initialize points for each triangle
            Point p1 = new Point(-startX, 0);          // First point at (-startX, 0)
            Point p2 = new Point(0, startY);           // Second point at (0, startY)
            Point p3 = new Point(startX - i, 0);       // Third point shifts based on index
            this.collection[i] = new Triangle(p1, p2, p3);  // Create and add the triangle
        }
    }

    // Calculate and return the sum of the perimeters of all triangles
    public double totalPerimeter() {
        double sum = 0;
        for (int i = 0; i < collection.length; i++) {
            sum += collection[i].perimeter();  // Add perimeter of each triangle
        }
        return sum;
    }

    public void shiftTriangles(int increment) {
        for (int i = 0; i < collection.length; i++) {
            Triangle triangle = collection[i];
            Point[] vertices = triangle.getVertices();  // Get the vertices of the triangle

            // Shift only the x-coordinate by the increment
            for (int j = 0; j < vertices.length; j++) {
                int newX = vertices[j].getX() + increment;  // Shift x-coordinate
                int newY = vertices[j].getY() + increment; //Shift y-coordinate
                vertices[j] = new Point(newX, newY);         // Reassign the shifted points
            }

            // After shifting, update the triangle with the new points
            collection[i] = new Triangle(vertices[0], vertices[1], vertices[2]);
        }
    }

    // Return a string containing each triangle in the collection on a new line
    public String triangleCollectionInfo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < collection.length; i++) {
            sb.append(collection[i].triangleInfo());  // Get the triangle's info as a string
            if (i <= collection.length) {
                sb.append("\n");  // Add line break between triangles
            }
        }
        return sb.toString();
    }
}
