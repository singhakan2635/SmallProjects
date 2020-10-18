package INFO5100.Exercise2;

public class Triangle extends Shape
{
    float perimeter =0;

    protected Triangle(int side1,int side2, int side3,String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        shapeType = "Triangle";
        callPrintStart(shapeType);
        PrintNoOfSide();
        Print();
    }

    @Override
    protected void PrintNoOfSide()
    {
        System.out.println("This is Triangle. Hence it has 3 sides.");
    }

    @Override
    public float Area()
    {
        if (perimeter==0)
            Perimeter();
        float p = (float)perimeter/2;

        return (float)Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public float Perimeter() {
        perimeter = (float)(side1+side2+side3);
        return (float)perimeter;
    }

    @Override
    public void Print()
    {
        System.out.println("Area of "+shape+" type "+shapeType+" is "+Area());
        System.out.println("Perimeter of "+shape+" type "+shapeType+" is "+perimeter);
        System.out.println("Color of "+shape+" type "+shapeType+" is "+ color);
        callPrintEnd(shapeType);
    }
}
