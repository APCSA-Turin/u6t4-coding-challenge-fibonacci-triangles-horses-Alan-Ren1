package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    //returns the value of x
    public int getX() {
      return x;
    }

    //returns the value of y
    public int getY() {
      return y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
    int diffx = x - other.x;
    int diffy = y - other.y;
    return Math.sqrt(diffx * diffx + diffy * diffy);
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")" ;

    }
  }
  