package main.java.dto;

/**
 * Created by B50-30 on 02.08.2015.
 */
public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double square(){
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }
}
