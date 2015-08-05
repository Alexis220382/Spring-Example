package main.java.dto;

/**
 * Created by B50-30 on 02.08.2015.
 */
public class Circle extends Shape{

    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double square(){
        return Math.PI*Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }
}
