import java.util.*;
import java.io.*;
import java.io.Console;
import java.io.IOException;
import java.lang.ProcessBuilder;


class players extends statistics{
    int pid;
    String p_fname ;
    String p_lname;
    int p_age;
    String jersey;
    String Play_position;
    String p_phone_num;
    String p_email;
    float base_salary;
    String p_address;

    players(int id)
    {
        this.pid=id;
        System.out.println(" Ading a Player ");
    }

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
            Play_position=Play_position.toLowerCase(); //string method tolowercase
            //string comparision
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
    int eqid;
    String eq_name;
    String eq_type;
    int eq_quantity;
    int avail_qty;
    String availability;
    String comments;

    equipments(int eqid,String name, String type, int quantity, String comment)
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
    void display()
    {
        
    }

    public void return_equip(int num)
    {
        avail_qty = avail_qty+num;
        System.out.println("Thank you! Hope to see you soon!");
    }
}

class statistics {
    String stat_id;
    String stat_type;
    int stat_wins;
    int stat_loss;
    int stat_draw;
    int stat_goals;
    int stat_assist;
    int stat_attempt;

    statistics()
    {
        System.out.println(" stats");
    }
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
    void display_stats()
    {
        
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
    void add_game()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<15;i++)
        {
            
        }
    }
}
class system{
    final static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String lexicon1 = "1234567890";
    final static java.util.Random rand = new java.util.Random();

    // consider using a Map<String,Boolean> to say whether the identifier is being used or not 
    final static Set<String> identifiers = new HashSet<String>();

    public static String random_name() {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }
    
    public static void ClearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
              
            if(operatingSystem.contains("Windows")){        
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
    
                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class lab {

    static {

        System.out.println(" * * * *  Manager Login * * * *");
    }
    static String usr_name="beck";
    static String pd="4009";
    static players[] player_in_club = new players[30];
    static equipments[] equip_owned = new equipments[30];
    static game[] games_played = new game[30];
    static int n_player=0,n_equiments=0,n_games=0,p_id=201,eq_id=101;
    void player()
    {
        int choice;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("* *  Player Menu * * ");
        System.out.println(" 1. Add Players \n 2. Edit Player Details \n 3. Display ALL \n 4.Exit ");
        System.out.print(" Your Choice is : "); 
        choice=sc.nextInt();sc.nextLine();
        switch(choice)
        {
            case 1:player_in_club[n_player]=new players(p_id++);
                    player_in_club[n_player].add_player();
                    n_player+=1;
                    break;

            case 2:System.out.print(" Enter The player ID ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<n_player;i++)
                    {
                        if(player_in_club[i].pid==id)
                        {
                            player_in_club[i].add_player();
                        }
                    }
                    break;
            case 3:for(int i=0;i<n_player;i++)
                    {
                        player_in_club[i].display();
                        player_in_club[i].display_stats();
                    }
                    break;
            case 4:System.out.println("Exiting...."); break;
            default: System.out.println(" Invalid Input");break;
        }
        }while(choice!=4);

    }
    void equipment()
    {
        int choice,id;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("* *  Equiments Menu * * ");
            System.out.println(" 1. Add Equipment \n 2. Borrow Equipemts \n 3. Return Equipment \n 4. Display ALL \n 5.Exit ");
            System.out.print(" Your Choice is : ");
            choice=sc.nextInt();sc.nextLine();
            switch(choice)
            {
                case 1:
                        System.out.println(" Enter the Name of Equipemnt ");
                        String name=sc.nextLine();
                        System.out.println(" Enter the Type of Equipemnt ");
                        String type=sc.nextLine();
                        System.out.println(" Enter the Quantity Equipemnt ");
                        int qty=sc.nextInt(); sc.nextLine();
                        System.out.println(" Enter the description of the quipment :  ");
                        String desc=sc.nextLine();
                        equip_owned[n_equiments]=new equipments(eq_id++,name,type,qty,desc);
                        n_equiments+=1;
                        break;

                case 2:System.out.print(" Enter The Equipment ID ");
                        id=sc.nextInt();
                        sc.nextLine();

                        for(int i=0;i<n_equiments;i++)
                        {
                            if(equip_owned[i].eqid==id)
                            {
                                System.out.print(" Quantity to be borrowed : ");
                                int n=sc.nextInt();sc.nextLine();
                                equip_owned[i].borrow_equip(n);
                            }
                        }
                        break;
                case 3:System.out.print(" Enter The Equipment ID ");
                        id=sc.nextInt();
                        sc.nextLine();

                        for(int i=0;i<n_equiments;i++)
                        {
                            if(equip_owned[i].eqid==id)
                            {
                                System.out.print(" Quantity to be Returned : ");
                                int num=sc.nextInt();sc.nextLine();
                                equip_owned[i].return_equip(num);
                            }
                        }
                        break;
                case 4:for(int i=0;i<n_equiments;i++)
                        {
                            equip_owned[i].display();
                        }
                        break;
                case 5:System.out.println("Exiting...."); break;
                default: System.out.println(" Invalid Input");break;
            }
        }while(choice!=4);

    }
    void games()
    {   
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println(" * * Games Menu * * ");
        System.out.println(" 1. Schedule a Game \n 2. View All Games \n 3. Exit");
        System.out.print(" Your Choice is : ");
        choice=sc.nextInt();sc.nextLine();
        switch(choice)
        {
            case 1:games_played[n_games]=new game();
                    games_played[n_games].add_game(); 
                    break;
            case 2:break;
            case 3:break;
            default: System.out.println(" Exiting.....");break;
        }
    } 
    
    //commandline arguments
    public static void login()
    {
        Scanner sc = new Scanner(System.in);
        Console con = System.console(); 
        String usr,pass;
        char[] ch=new char[40];
        for(;;)
        {
            system.ClearConsole();
            
            System.out.println(" User Name : ");
            usr=sc.nextLine();
            System.out.println(" Password : ");
            
            ch=con.readPassword();   
            
            pass = String.valueOf(ch);   
        
            if(usr.equalsIgnoreCase(usr_name) && pass.equals(pd)) //string methods
            {
                System.out.println(" Loging in ");
                system.ClearConsole();
                break;
            }
            else{
                System.out.println(" Invalid Input "); 
            }
        }
    }
    
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        lab club=new lab();
        login(); //commandline argument is invoked
        int choice;
        do
        {
            System.out.println(" Welcome to Manager Menu ");
            System.out.println(" 1. Players \n 2. Equipments \n 3. Games \n 4. Logout \n");
            System.out.print(" Your Choice is : ");
            choice =sc.nextInt();sc.nextLine();
            
            switch(choice)
            {
                case 1:club.player();break;
                case 2:club.equipment();break;
                case 3:club.games();break;
                case 4:System.out.println(" Logging out");  break;
                default: System.out.println(" Invalid Input ");break;

            }
        }while(choice!=4);
        

        
    }
    
}
