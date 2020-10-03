package ru.stqa.pft.sandbox;

public class MyFirstProgram{

  public static void main(String[] args) {
	hello("world");
	hello("user");
	hello("Veta");

	Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной "
            + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a +
            " и " + r.b + " = " + r.area());

    Point p1 = new Point(1, 3);

    Point p2 = new Point(4,8);

    Point p3 = new Point(p2.x-p1.x, p2.y-p1.y);

    System.out.println("Расстояние между точками p1 и p2 " + " = " + p3.distance());

 }

 public static void hello(String somebody) {

   System.out.println("Hello, " + somebody + "!");
 }

  }
