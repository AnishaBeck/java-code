import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.io.*;

class players{
    String pid;
    String p_fname ;
    String p_lname;
    int p_age;
    String jersey;
    String Play_position;
    String p_phone_num;
    String p_email;
    float base_salary;
    String p_address;

    public void add_player()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first name :  ");
        p_fname=sc.nextLine();
        System.out.print("Enter the last name :  ");
        p_lname=sc.nextLine();
        System.out.print("Enter age :  ");
        p_age = sc.nextInt();sc.nextLine();
        System.out.print("Enter the jersey number :  ");
        jersey = sc.nextLine();
        for(;;)
        {
            System.out.print("Enter the play position:  ");
            Play_position = sc.nextLine();
            Play_position=Play_position.toLowerCase();
            if ((Play_position.equals("striker")) || (Play_position.equals("mid-feilder")) || (Play_position.equals("goal-keeper")) || (Play_position.equals("defender")) || (Play_position.equals("forward")))
            {
                break;
            }
            else
            System.out.println("Invlaid input ");

        }
        System.out.print("Enter the phone number:  ");
        p_phone_num = sc.nextLine();
        System.out.print("Enter the email :  ");
        p_email=sc.nextLine();
        System.out.print("Enter the address :  ");
        p_address = sc.nextLine();
    }
    
    public void display()
    {
        System.out.println("Name :  "+p_fname+" "+p_lname);
        System.out.println("Age :  "+p_age);
        System.out.println("Jersey No :  "+jersey);
        System.out.println("Contact :  "+p_phone_num+"\n\t"+p_email);
    }

    double cal_sal()
    {
               
        switch(Play_position)
        {
            case "striker":base_salary=50000;break;
            case "mid-fielder":base_salary=45000;break;
            case "goal-keeper":base_salary=42600;break;
            case "forward":base_salary=51920;break;
            case "defender":base_salary=47820;break;
            default: base_salary=35000;break;
        }
        System.out.println(base_salary);
        float HRA = (10.0f / 100.0f) * base_salary;
        float DA = (73.0f / 100.0f) * base_salary;
        float GS = base_salary + DA + HRA;
        float incometax = (30.0f / 100.0f) * GS;
        float netsalary = GS - incometax;
        return netsalary;
    }


}

class equipments{
    String eqid;
    String eq_name;
    String eq_type;
    int eq_quantity;
    int avail_qty;
    String availability;
    String comments;

    equipments(String name, String type, int quantity, String comment)
    {
        eq_name=name;
        eq_type = type;
        eq_quantity = quantity;
        avail_qty = quantity;
        comments = comment;
    }
    void borrow_equip(int n)
    {
        if(n<=avail_qty)
        {
            avail_qty=avail_qty-n;
            System.out.println(" THe equitment is borrowed Succeffully Please return once u finished the practice ");
        }
        else if(avail_qty==0){
            System.out.println(" The Equipment is Currently Un available ");
            
        }
        else 
        {
            System.out.println(" The Equipment available right now is "+avail_qty+"\nWould u like to borrow ?");
            Scanner sc =new Scanner(System.in);
            String nn=sc.nextLine();
            if(nn.equals("yes"))
            {
                borrow_equip(avail_qty);
            }
            else
            {
                System.out.println("Thank you");
            }
        }
    }

    public void return_equip(int num)
    {
        avail_qty = avail_qty+num;
        System.out.println("Thank you! Hope to see you soon!");
    }
}

class statistics{
    String stat_id;
    String stat_type;
    int stat_wins;
    int stat_loss;
    int stat_draw;
    int stat_goals;
    int stat_assist;
    int stat_attempt;

    statistics(String type, int wins, int loss, int draw, int goals, int assist, int attempt)
    {
        stat_type = type;
        stat_wins = wins;
        stat_loss = loss;
        stat_draw = draw;
        stat_goals = goals;
        stat_assist = assist;
        stat_attempt = attempt;
    }

    void update_stats()
    {

    }


}

class game
{
    String game_id;
    String g_name;
    String g_date;
    String g_status;
    int[] g_player = new int[15];
}


public class lab2 {

    public static void main(String[] args) 
    {
      Scanner i = new Scanner(System.in);
      System.out.println("Enter 1 for Player.\nEnter 2 for Equipments.\nEnter 3 for Game");
      int num = i.nextInt();
      switch (num) {
          case 1:
            Scanner j = new Scanner(System.in);
            System.out.println("Enter 1 to Add Player.\nEnter 2 to Remove Player.\nEnter 3 to Edit Player details.");
            int n = j.nextInt();
            switch (n) {
                case 1:
                    add_player();
                    break;
                case 2:
                    del_player();
                    break;
                case 3:
                    edit_player();
                    break;
                default:
                    break;
            }
            break;

          case 2:
          Scanner k = new Scanner(System.in);
            System.out.println("Enter 1 to Borrow Equipment.\nEnter 2 to Return Equipment.\nEnter 3 to Add new equipments.");
            int m = k.nextInt();
            switch (m) {
                case 1:
                    borrow_equip();
                    break;
                case 2:
                    return_equip();
                    break;
                case 3:
                    add_equip();
                    break;
                default:
                    break;
            }
            
            case 3:
            Scanner l = new Scanner(System.in);
            System.out.println("Enter 1 to Update Game.\nEnter 2 to View Game");
            int n = j.nextInt();
            switch (n) {
                case 1:
                    add_player();
                    break;
                case 2:
                    del_player();
                    break;
                case 3:
                    edit_player();
                    break;
          default:
              break;
      }
        
    }
    
}
