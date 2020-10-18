package INFO5100.Exercise2;

public class Rectangle extends Shape {

    protected Rectangle(int length, int width,String color)
    {
        this.side1=length;
        this.side2=width;
        this.color = color;
        shapeType = "Rectangle";
        callPrintStart(shapeType);
        PrintNoOfSide();
        Print();
    }

    @Override
    protected void PrintNoOfSide() {
        System.out.println("This is Rectangle. Hence there are four sides");
    }

    @Override
    public float Area() {
        return (float)side1*side2;
    }

    @Override
    public float Perimeter() {
        return (float)2*(side1+side2);
    }

    @Override
    public void Print() {
        System.out.println("Area of "+shape+" type "+shapeType+" is "+ Area());
        System.out.println("Perimeter of "+shape+" type "+shapeType+" is "+ Perimeter());
        System.out.println("Color of "+shape+" type "+shapeType+" is "+ color);
        callPrintEnd(shapeType);
    }
}
