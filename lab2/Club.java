import java.io.*;

public class club{
    //1
    public class players{
    String pid;
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
        pid = pid;
        p_fname = f;
        p_lname = l;
        p_age = age;
        jersey = jer;
        play_position = pp;
        p_contact = contact;
        p_address = address;
        p_salary = sal;
    }

    public static void display(){
        System.out.println("Player's details: " +pid+)
    }

    public static void deleteplayer(String pid){
        System.out.println("The "+ players.pid + "Name: "+p_fname+ " is being removed.");
        players.remove(pid);
        System.out.println("Player removed successfully!!!");
    }

    public static void editdeatail(String pid){

    }
    }

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
    }

    //3
    public class equipments{
        String eqid;
        String eq_name;
        String eq_type;
        int eq_quantity;
        String availability;
        String comments;
    }

    //6
    public class expenses{
        String eid;
        String title;
        String description;
        String items;
        int price;
        int quantity;
        int amount;
        int total_amount;
    }

    //8
    public class sponsers{
        String sid;
        String s_name;
        String s_point_of_contact;
        String s_contact;
        String s_address;
        String s_type;
        String s_start_date;
        String s_end_date;
    }

    //9
    public class statistics{
        String stat_id;
        String stat_type;
        int stat_wins;
        int stat_loss;
        int stat_draw;
        int stat_goals;
        int stat_assist;
        int stat_attempt;
    }
}