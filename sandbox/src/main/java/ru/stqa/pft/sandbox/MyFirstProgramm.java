package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

  public static void main(String[] args) {
    Point p1 = new Point(2,-4);
    Point p2 = new Point(-5,3);
   //p1.x=2;
   //p1.y=-4;
   //p2.x=-5;
  // p2.y=3;
    System.out.println("Hello");
    System.out.println(distance(p1,p2));
    System.out.println(p1.distance(p1,p2));

  }

  public static double distance(Point p1, Point p2) {

    double d;

    d =Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
    return d;
  }



}