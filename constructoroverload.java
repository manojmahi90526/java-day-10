import java.util.*;
class Main
{
    String name;
    Main()
    {
        name="raj";

    }
    Main(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        Main o=new Main();
        o.display();
        Main o1=new Main("manoj");
        o1.display();
    }
}