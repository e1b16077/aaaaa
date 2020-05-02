class kadai4{
  public static void main( String[] args )
{
    for( int n = 10000 ; n < 10100 ; n++ )
        if( IsPrimeNumber( n ) )
            System.out.print( n + " " );
}

static boolean IsPrimeNumber( int num )
{

    for (int i = 2; i <num ; i++)
    if( ( num % i) == 0 )
        return false;

    return true;
}
}
