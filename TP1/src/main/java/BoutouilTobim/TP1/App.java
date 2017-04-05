package BoutouilTobim.TP1;

public class App 
{
    public static void main( String[] args )
    {
    	MyFirstTest m = new MyFirstTest();
        System.out.println( "Hello World!" );
        m.Afficher();
        String string_test = "Yolo";
        /* Test des cas limites ? */
        StringUtils s = new StringUtils();
        s.reverseString(string_test);
    }
}
