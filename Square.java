package INFO5100.Exercise2;

public class Square extends Shape {

    protected Square(int side, String color) {
        this.side1=side;
        this.color = color;
        shapeType = "Square";
        callPrintStart(shapeType);
        PrintNoOfSide();
        Print();
    }

    @Override
    protected void PrintNoOfSide() {
        System.out.println("This is Square. Hence there are four sides");
    }

    @Override
    public float Area() {
        return (float)side1*side1;
    }

    @Override
    public float Perimeter() {
        return (float)4*side1;
    }

    @Override
    public void Print() {
        System.out.println("Area of "+shape+" type "+shapeType+" is "+ Area());
        System.out.println("Perimeter of "+shape+" type "+shapeType+" is "+ Perimeter());
        System.out.println("Color of "+shape+" type "+shapeType+" is "+ color);
        System.out.println();
    }
}
