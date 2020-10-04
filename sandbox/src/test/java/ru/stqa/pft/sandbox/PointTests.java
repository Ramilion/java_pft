package ru.stqa.pft.sandbox;

import org.junit.Test;
import org.testng.Assert;

public class PointTests {

  @Test
  public void testDistance(){
    Point p = new Point(3,5);
    Assert.assertEquals(p.distance(), 5.830951894845301);
  }
}
