

package Complete_reference.multithreading;
public class interthread_comm
{
    public static void main(String args[])
    {
        data q=new data();
        new producer(q);
        new consumer(q);
    }
         
}
class data
{
    int n;
    boolean valueset=false;
    synchronized void put(int n)
    {
        while(valueset)
        {
            try{
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        valueset=true;
        this.n=n;
        System.out.println("Put:"+n);
        notify();
    }
    synchronized int get()
    {
        while(!valueset)
        {
            try{
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        System.out.println("Got:"+n);
        valueset=false;
        notify();
        return n;
    }
}
class producer implements Runnable
{
    data q;    
    producer(data q)
    {
        this.q=q;
        new Thread(this,"producer").start();
    }
    public void run()
    {
        int i=0;
        while(true)
        q.put(i++);
    }
}
class consumer implements Runnable
{
    data q;    
    consumer(data q)
    {
        this.q=q;
        new Thread(this,"consumer").start();
    }
    public void run()
    {
        int i=0;
        while(true)
        q.get();
    }
}
 
