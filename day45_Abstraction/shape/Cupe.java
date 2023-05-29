package day45_Abstraction.shape;

public class Cupe extends Shape implements Volume{

    public Cupe(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
