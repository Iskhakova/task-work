package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
@Test
  public void tests(){
  Point p1 = new Point();
  Point p2 = new Point();
  p1.x=2;
  p1.y=-4;
  p2.x=-5;
  p2.y=3;

  Assert.assertEquals(p1.distance(p1,p2),9.899494936611665);
  }
}
