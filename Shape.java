package INFO5100.Exercise2;

public abstract class Shape implements CalculateMethod
{
    protected int side1;
    protected int side2;
    protected int side3;
    protected static String shape = "Shape";
    protected String color;
    protected String shapeType;

    protected abstract void PrintNoOfSide();

    protected void callPrintStart(String s)
    {
        printStart(s);
    }
    protected void callPrintEnd(String s)
    {
        printEnd(s);
    }

    private void printStart(String s)
    {
        System.out.println("We are in Shape "+s+" Now");
    }
    private void printEnd(String s)
    {
        System.out.println("Shape "+s+" Ends Now");
        System.out.println();
    }

}
