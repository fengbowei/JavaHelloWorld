import com.test.Lib;
import com.test.Printer;
import com.test.Printable;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class HelloWorld
{
    public static void main(String[] args)
    {
        // 1
        String s = new String("hello world!");
        System.out.println(s);

        //2
        Lib a = new Lib();
        a.sayHello();

        //3
        HelloInterface b = new HelloInterface(1, "jack");
        System.out.println("calling printer...\n");
        Printer.print(b);

        //4

        // 4.1 passing an implemation of interface
        /*
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("HelloWorld From ActionListener!\n");
            }
        };
        Timer t = new Timer(1000, listener);
        */

        //4.2 passing lamda expression(only on Java8)
        /*
        Timer t = new Timer(1000, (ActionEvent event)->
        {
            System.out.println("HelloWorld From ActionListener!\n");
        });
        t.start();
        */
        try
        {
            TimeUnit.SECONDS.sleep(5);   
        }
        catch(InterruptedException e)
        {
        }

        t.stop();
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


