package INFO5100.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        List<Shape> ls =new ArrayList<Shape>();
        ls.add(new Triangle(6,8,10,"Red"));
        ls.add(new Rectangle(20,20,"Green"));
        ls.add(new Circle(5,"Black"));
        ls.add(new Square(10,"Yellow"));

        for (int i =0;i<ls.size();i++)
        {
            ls.get(i).callPrintEnd(ls.get(i).shapeType);
        }
    }

}
