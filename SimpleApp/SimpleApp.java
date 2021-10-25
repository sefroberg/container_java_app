import java.util.Properties;


public class SimpleApp
{
    public static void main(String[] args)
    {
        System.out.println("This is a simple java app.");
        String version = System.getProperty("java.version");
        System.out.println("Java Version = " + version);

    }
}
