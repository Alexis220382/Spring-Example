package main.java.dto;

/**
 * Created by B50-30 on 02.08.2015.
 */
public class RectanglePoint extends Shape{

    private Point p1;
    private Point p2;

    private double width;
    private double height;


    public RectanglePoint(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getDistanceByX(){

        width = p2.getY() - p1.getY();

        return width;
    }

    public double getDistanceByY(){

        height = p2.getX() - p1.getX();

        return height;
    }

    @Override
    public double square() {

        return getDistanceByX() * getDistanceByY();
    }

    @Override
    public double perimeter() {

        return (getDistanceByX() + getDistanceByY()) * 2;
    }
}
