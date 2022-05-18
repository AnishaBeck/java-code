public class learnThread extends Thread
{
    public void getData(){
        System.out.println("Data fetched" + Thread.currentThread().getName());
    }

    public void run(){
        System.out.println("Initializing.. " + Thread.currentThread().getName());
        getData();
        try{
            if(Thread.currentThread().getName().equals("Thread-1")){
                System.out.println("Gonna sleep for 200ms.." + Thread.currentThread().getName());
                sleep(200);
            }
            else{
                System.out.println("Gonna sleep for 5000ms.." + Thread.currentThread().getName());
                sleep(5000);
            }
            System.out.println("Done sleeping.." + Thread.currentThread().getName());
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Ending.. " + Thread.currentThread().getName());
    }
}
