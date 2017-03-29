package BoutouilTobim.TP1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyFirstTest m = new MyFirstTest();
        System.out.println( "Hello World!" );
        m.Afficher();
        
        String string_test = "Yolo";
        StringUtils s = new StringUtils();
        s.reverseString(string_test);
    }
}
