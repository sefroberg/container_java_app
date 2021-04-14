import java.lang.Runtime.Version;

public class SimpleApp
{
    public static void main(String[] args)
    {
        System.out.println("This is a simple java app.");
        Version version = java.lang.Runtime.version();
        System.out.println("Java Version = " + version);
    }
}
