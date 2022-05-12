class FindLargestShape
{
    public static void main(String arg[])
    {
        Rectangle rec = new Rectangle(10, 4);
        Square sqre = new Square(7);
        Circle crcl = new Circle(3.5);
        
        System.out.println("Rectangle Area : " + rec.getArea());
        System.out.println("Square Area : " + sqre.getArea());
        System.out.println("Circle Area : " + crcl.getArea());
        System.out.println();
        
        if ((rec.getArea() > crcl.getArea()) && (rec.getArea() > sqre.getArea()))
        {
            System.out.println("Rectangle has the largest area.");
        }
        else if( sqre.getArea() > crcl.getArea() )
        {
            System.out.println("Square has the largest area.");
        }
        else
        {
            System.out.println("Circle has the largest area.");
        }    
    }
}

class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }
}

class Square
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    double getArea()
    {
        return side * side;
    }
}

class Circle
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
}