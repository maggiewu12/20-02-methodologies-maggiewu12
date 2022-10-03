import java.util.Random;

public class Methodologies {

    public static double howFar(int xOne, int yOne, int xTwo, int yTwo )
    {
        return (Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2)));
    }

    public static double howFast( int distanceInMiles, int hours, int minutes )
    {
        return (int)(distanceInMiles/(hours + (minutes/60)));
    }

    public static double getRootAdd( int a, int b, int c )
    {
        return ((-b) + Math.sqrt((Math.pow(b, 2)-(4*a*c))))/(2*a);
    }

    public static double getRootSub( int a, int b, int c )
    {
        return (((-b) - Math.sqrt((Math.pow(b, 2)-(4*a*c))))/(2*a));
    }

}//end of class