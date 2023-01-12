package Proxydp;

public class RealObjectProxy implements RealObject
{
    RealObject ROI=new RealObjectImpl();
    public void doSomething() 
    {
        //Perform additional logic and security
        //Even we can block the operation execution
        System.out.println("Delegating work on real object");
        ROI.doSomething();
        //Perform additional logic
        
        
        
    }
}