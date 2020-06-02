class call
{
    static void callA()
    {
        try
        {
            System.out.println("callA");
            Throw new runtimeexception("demo"); 
            ...//clean-up code which is never reached because of exception
        }
        catch( Exception e) 
        {
            System.out.println("Exception caught");
        }
        finally
        {
            System.out.println("finally of callA");
            ...//clean-up code written here which is executed
        }
    }
}
