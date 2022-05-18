public class ThreadImplement {
    public static void main(String args[]){
        learnThread shutUp1 = new learnThread();
        learnThread shutUp2 = new learnThread();
        learnThread shutUp3 = new learnThread();

        shutUp1.start();
        shutUp2.start();
        shutUp3.start();

        try{
            shutUp1.join();
            shutUp2.join();
            shutUp3.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Done implmenting!");
    }
}
