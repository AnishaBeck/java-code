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
public ResultSet getInfo(){
        String query;
        try{
            query="select * from `"+al.get(0)+"` where username='"+al.get(1)+"' and password='"+al.get(2)+"';";
            rs=st.executeQuery(query);
            System.out.println(query);
            return rs;
        }
        catch(Exception e){
            System.out.println("Error: "+e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void insert(ArrayList ia){
        try{
            String query=null;
            
            if(ia.get(0)=="player"){
                 query= "Insert into "+ia.get(0)+" (username,password,name,Jersey_no,gender,phone,email,Address,birth_date,debute,player_role,bat_style,bowl_style,runs,wickets,catch,stumping) values('"
                    +ia.get(1)+"','"+ia.get(2)+"','"+ia.get(3)+"',"+ia.get(4)+",'"+ia.get(5)+"','"+ia.get(6)+"','"+ia.get(7)
                    +"','"+ia.get(8)+"','"+ia.get(9)+"',CURRENT_DATE,'"+ia.get(11)+"','"+ia.get(12)
                         +"','"+ia.get(13)+"',"+ia.get(14)+","+ia.get(15)+","+ia.get(16)+","+ia.get(17)+");";
            }
            else if(ia.get(0)=="coach"){
                 query= "Insert into "+ia.get(0)+" (username,password,name,Role,phone,email,birth_date,joinnig_date,Adress) values('"
                    +ia.get(1)+"','"+ia.get(2)+"','"+ia.get(3)+"','"+ia.get(4)+"','"+ia.get(5)+"','"+ia.get(6)+"','"+ia.get(7)
                    +"',CURRENT_DATE,'"+ia.get(9)+"');";
            }
            else if(ia.get(0)=="event_mgr"){
                 query= "Insert into "+ia.get(0)+" (username,password,name,phone,email,gender,birth_date,joinnig_date,Adress) values('"
                    +ia.get(1)+"','"+ia.get(2)+"','"+ia.get(3)+"','"+ia.get(4)+"','"+ia.get(5)+"','"+ia.get(6)+"','"+ia.get(7)
                    +"',CURRENT_DATE,'"+ia.get(9)+"');";
            }
            else if(ia.get(0)=="physio"){
                 query= "Insert into "+ia.get(0)+" (username,password,name,phone,email,gender,birth_date,joinnig_date,Adress) values('"
                    +ia.get(1)+"','"+ia.get(2)+"','"+ia.get(3)+"','"+ia.get(4)+"','"+ia.get(5)+"','"+ia.get(6)+"','"+ia.get(7)
                    +"',CURRENT_DATE,'"+ia.get(9)+"');";
            }
            
            
            
            
            st.executeUpdate(query); 
            System.out.println(query);
            JOptionPane.showMessageDialog(null, "Registration successfull!");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Admin databse exception!"+e);
            System.out.println(e);
            e.printStackTrace();
        }
        
    }
    public void update(ArrayList ia){
        try{
            String query=null;
            
            if(ia.get(0)=="player"){
                 query= "update "+ia.get(0)+" set password='"+ia.get(2)+"',name='"+ia.get(3)+"',Jersey_no="+ia.get(4)+",gender='"+ia.get(5)+"',"
                         + "phone='"+ia.get(6)+"',email='"+ia.get(7)+"',Address='"+ia.get(8)+"',birth_date='"+ia.get(9)+"',player_role='"+ia.get(11)+"',bat_style='"+ia.get(12)+"',bowl_style='"+ia.get(13)+"' where username='"+ia.get(1)+"';";
            }
            else if(ia.get(0)=="coach"){
                 query= "update "+ia.get(0)+" set password='"+ia.get(2)+"',name='"+ia.get(3)+"',Role='"+ia.get(4)+"',phone='"+ia.get(5)+"',"
                         + "email='"+ia.get(6)+"',birth_date='"+ia.get(7)+"',"
                         + "Adress='"+ia.get(9)+"' where username='"+ia.get(1)+"';";
            }
            else if(ia.get(0)=="event_mgr"){
                 query="update "+ia.get(0)+" set password='"+ia.get(2)+"',name='"+ia.get(3)+"',phone='"+ia.get(4)+"',"
                         + "email='"+ia.get(5)+"', gender='"+ia.get(6)+"',birth_date='"+ia.get(7)+"',"
                         + "Adress='"+ia.get(9)+"' where username='"+ia.get(1)+"';";
            }
            else if(ia.get(0)=="physio"){
                 query="update "+ia.get(0)+" set password='"+ia.get(2)+"',name='"+ia.get(3)+"',phone='"+ia.get(4)+"',"
                         + "email='"+ia.get(5)+"', gender='"+ia.get(6)+"',birth_date='"+ia.get(7)+"',"
                         + "Adress='"+ia.get(9)+"' where username='"+ia.get(1)+"';";
            }
            
            
            
            
            st.executeUpdate(query);
            System.out.println(query);
            JOptionPane.showMessageDialog(null, "Updated successfully!");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Databse exception!"+e);
            System.out.println(e);
            e.printStackTrace();
        }
        
    }
    public ResultSet getSearchRes(ArrayList alist){
        String query;
        try{
            query="select * from `"+alist.get(0)+"` where username='"+alist.get(1)+"';";
            rs=st.executeQuery(query);
            System.out.println(query);
            return rs;
        }
        catch(Exception e){
            System.out.println("Error: "+e);
            e.printStackTrace();
        }
        return null;
    }
    public ResultSet getLoadRes(ArrayList alist){
        try{
            String query = "select * from `"+alist.get(0)+"`;"; 
            rs=st.executeQuery(query);
            System.out.println(query);
            return rs;
        }
        catch(SQLException e){
            System.out.println(e);
            e.printStackTrace();
        }
        
        return null;
    }
    public void DeleteProfile(ArrayList alist){
         try{
            String query = "delete from `"+alist.get(0)+"` where username='"+alist.get(1)+"';"; 
            st.executeUpdate(query);
            System.out.println(query);
            JOptionPane.showMessageDialog(null, "Profile Deleted successfully!");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Databse exception!"+e);
            System.out.println(e);
            e.printStackTrace();
            
        }
        
        
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
        manager()
        {
            //initialise the data 
        }
         void display()
         {
             //display the employee details 
         }
        void salary()
        {
            //salary of the employees
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