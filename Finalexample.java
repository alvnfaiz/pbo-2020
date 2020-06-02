final class Finalexample 
{
    final void func()
    {
        System.out.println("Inside class A");
    }
}
class B extends A
{
    void func()     // Error, cannot override
    {
        ... 
    }
}
