package INFO5100.Exercise2;

public class Circle extends Shape
{
    protected Circle(int radius,String color) {
        this.side1 = radius;
        this.color = color;
        shapeType = "Circle";
        callPrintStart(shapeType);
        PrintNoOfSide();
        Print();
    }

    @Override
    protected void PrintNoOfSide()
    {
        System.out.println("This is Circle, so there is no sides just radius");
    }

    @Override
    public float Area() {
        return (float)(Math.PI*side1*side1);
    }

    @Override
    public float Perimeter() {
        return (float)(2*Math.PI*side1);
    }

    @Override
    public void Print() {

        System.out.println("Area of "+shape+" type "+shapeType+" is "+Area());
        System.out.println("Circumference of "+shape+" type "+shapeType+" is "+Perimeter());
        System.out.println("Color of "+shape+" type "+shapeType+" is "+ color);
        System.out.println();
    }
}
