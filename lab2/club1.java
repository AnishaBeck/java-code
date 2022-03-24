import java.io.*;

public class club1{
    //1
    public class players{
    int pid;
    String p_fname ;
    String p_lname;
    int p_age;
    int jersey;
    String play_position;
    String p_contact;
    String p_address;
    float p_salary;

    players(String pid, String f, String l, int age, int jer, String pp, String contact, String address, float sal)
    {
        System.out.println("****Player Class****");
        this.pid = pid;
        this.p_fname = f;
        this.p_lname = l;
        this.p_age = age;
        this.jersey = jer;
        this.play_position = pp;
        this.p_contact = contact;
        this.p_address = address;
        this.p_salary = sal;
    }
    void display()
    {
        System.out.println(" Id "+this.pid);
        System.out.println(" First Name : "+this.p_fname);
        System.out.println(" Last Name : "+this.p_lname);
        System.out.println(" Age :  "+this.p_age);
        System.out.println(" Contact : "+this.p_contact);
        System.out.println(" Address : "+this.p_address);
        System.out.println(" Salary : "+this.p_salary);
    }

    public void calculate()  //calculating all the parameters
     {
        float HRA=(10/100)*p_salary;
        float DA=(73/100)*p_salary;
        float GS=p_salary+DA+HRA;
        float incometax=(30/100)*GS;
        float netsalary=GS-incometax;
     }
    // public void practice_session()
    // {
    //     // practice sessions
    //     //key points to practice or train on

    // }

    // public void payment()
    // {
    //     //payment if they played 
    //     //if the won the to
    // }
    // public void game_details()
    // {
    //     //details of the game they are going to play 
    // }
    
    //2 
    public class manager{
        String mid;
        String m_fname;
        String m_lname;
        int m_age;
        String m_address;
        String m_contact;
        String m_doj;
        String m_dor;
        float m_salary;
        String schedule;
   
    // manager(String mid; String f; String l; int age, String contact, String address, float sal, String schedule)
    // {
    //     System.out.println("****Manager Class****");
    //     this.mid = mid;
    //     this.m_fname = f;
    //     this.m_lname = l;
    //     this.m_age = age;
    //     this.m_contact = contact;
    //     this.m_address = address;
    //     this.m_salary = sal;
    //     this.schedule = schedule;
    // }
    // void display()
    // {
    //     System.out.println(" Id "+this.mid);
    //     System.out.println(" First Name : "+this.m_fname);
    //     System.out.println(" Last Name : "+this.m_lname);
    //     System.out.println(" Age :  "+this.m_age);
    //     System.out.println(" Contact : "+this.m_contact);
    //     System.out.println(" Address : "+this.m_address);
    //     System.out.println(" Salary : "+this.m_salary);
    // }

    public void calculate()  //calculating all the parameters
     {
        float HRA=(10/100)*p_salary;
        float DA=(73/100)*p_salary;
        float GS=p_salary+DA+HRA;
        float incometax=(30/100)*GS;
        float netsalary=GS-incometax;
     }
        // void team()
        // {
        //     // selecting the players to the teams
        // }
        // void budge()
        // {
        //     //allocating the budget for the players and employees
        // }
}