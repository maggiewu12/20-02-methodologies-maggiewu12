import java.util.Scanner;
import static java.lang.System.out;

// Name: Maggie Wu
// Date Started: 9/29/22
// Date Completed:

public class Runner {

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner( System.in );

        out.print("Enter X1 :: ");
        int x1 = keyboard.nextInt();
        out.print("Enter Y1 :: ");
        int y1 = keyboard.nextInt();
        out.print("Enter X2 :: ");
        int x2 = keyboard.nextInt();
        out.print("Enter Y2 :: ");
        int y2 = keyboard.nextInt();


        out.printf( "distance == %.3f\n",Methodologies.howFar( x1, y1, x2, y2 ) );

		out.print("Enter a :: ");
		int quadA = keyboard.nextInt();
		out.print("Enter b :: ");
		int quadB = keyboard.nextInt();
		out.print("Enter c :: ");
		int quadC = keyboard.nextInt();


		System.out.println( Methodologies.getRootAdd( quadA,quadB,quadC ) );
		System.out.println( Methodologies.getRootSub( quadA,quadB,quadC ) );

        out.print("Enter distance in miles:: ");
        int miles = keyboard.nextInt();
        out.print("Enter hours traveled:: ");
        int hrs = keyboard.nextInt();
        out.print("Enter minutes traveled:: ");
        int mins = keyboard.nextInt();
        out.printf("Speed == " + Methodologies.howFast(miles, hrs, mins));
    }

}
