import java.util.Scanner;

class kadai3{
  public static void main( String[] args )
{
    Scanner scan = new Scanner(System.in);

    int size = scan.nextInt();
    DrawTriangle( size );
}

static void DrawTriangle( int size )
{
    for( int i = 0 ; i < size ; i++ )
    {
        for( int j = 0 ; j <= i ; j++ )
            System.out.print( "$" );

        System.out.println();
    }
}
}
