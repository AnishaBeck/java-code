import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public static void playerdetails(){
        System.out.println("Name: "+ p_fname +" "+ p_lname);
        System.out.println("Jersey NO.: "+ jersey);
        System.out.println("Age: "+p_age);
        System.out.println("Play position: "+ play_position);
        System.out.println("Contact: "+ p_contact);
    }

    void practice_session()
    {
        // practice sessions
        //key points to practice or train on

    }

    void payment()
    {
        //payment if they played 
        //if the won the to
    }
    void game_details()
    {
        //details of the game they are going to play 
    }
    void 
    
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
        String schedule;

    manager((String mid, String f, String l, int age, String contact, String address, float sal,String schedule) 
    {
        mid = pid;
        m_fname = f;
        m_lname = l;
        m_age = age;
        m_contact = contact;
        m_address = address;
        m_salary = sal;
        schedule = schedule;
    }

        //salary of the managers
        public void calculateNetSalary (double pfPercentage){
        double pfAmount = m_salary * (pfPercentage / 100);
        double netSalary = m_salary - pfAmount;
        this.setNetSalary(netSalary);
    }
        }
        public void schedeuleEvent(ArrayList ia){
        try{
            String query="insert into event ( date,venue,team1,team2) values('"+ia.get(0)+" "+ia.get(1)+"','"+ia.get(2)+"','"+ia.get(3)+"','"+ia.get(4)+"');";
            st.executeUpdate(query);
            System.out.println(query);
            JOptionPane.showMessageDialog(null, "Event scheduled successfully!");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Failed to schedule event!");
            System.out.println(e);
            e.printStackTrace();
            
        }
    }
    public void scheduleSession(ArrayList ia){
        try{
            String query = "insert into "+ia.get(0)+" ( date,place) values('"+ia.get(1)+" "+ia.get(2)+"','"+ia.get(3)+"');";
            st.executeUpdate(query);
            System.out.println(query);
            JOptionPane.showMessageDialog(null, ia.get(0)+" scheduled successfully!");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Failed to schedule "+ia.get(0)+" session!");
            System.out.println(e);
            e.printStackTrace();
            
        }
    }
    public ResultSet getSession(String str){
        try{
            String query="select DATE_FORMAT(date, '%Y-%m-%d') as date,time_FORMAT(date, '%h:%i') as time ,"
                    + "time_FORMAT(date, '%p') as ampm, place from `"+str+"` WHERE date>CURRENT_DATE or date=CURRENT_DATE  order by datediff(date,CURRENT_DATE);";
            rs=st.executeQuery(query);
            System.out.println(query);
            return rs;
            
        }
        catch(SQLException e){
            System.out.println("Error: "+e);
            e.printStackTrace();
        }
        return null;
    }
    

        void team()
        {
            // selecting the players to the teams
        }
        void budge()
        {
            //allocating the budget for the players and employees
        }
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

    //4
    public class auction{
        String auid;
        String sport_association;
        String eid;
        String pid;
        float bidding_amount;
        String contract_start_date;
        String contract_end_date;

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

    //7
    public class vendors{
        String vid;
        String v_name;
        String v_contact;
        String v_address;
        String v_type;
        String v_order;
        String v_payment;
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