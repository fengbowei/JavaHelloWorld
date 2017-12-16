import com.test.Lib;
import com.test.Printer;
import com.test.Printable;

public class HelloWorld
{
    public static void main(String[] args)
    {
        String s = new String("hello world!");
        System.out.println(s);
        Lib a = new Lib();
        a.sayHello();

        HelloInterface b = new HelloInterface(1, "jack");
        System.out.println("calling printer...\n");
        Printer.print(b);
        
    }
}

class Hello2
{
    public static void main(String[] args)
    {
        String s = new String("hello world 2!");
        System.out.println(s);
    }
}

class HelloInterface implements Printable
{
    private int id;
    private String name;
    
    public HelloInterface(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getString()
    {
        String s = new String();
        s = "id = " + id + "\nname = " + name;
        return s;
    }

}


