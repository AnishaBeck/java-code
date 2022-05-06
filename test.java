import java.io.*;
import java.util.Scanner;
import java.util.*;

//checked exception
//filenotfound
//classnotfound
//unchecked exception
//input mismatch exception
//arthmetic exception
//final
//try catch
//userdefined
//weight and height
//age

//interface

//Inheritance , super, abstract and final keyword

//This and Command Line Arguments
interface calling
{
    void addwrestlers();
    void display();
}
class Wrestlers implements calling
{
        int n;
        String name ;
        String gender ;
        float age ;
        float weight ;
        float height ;
        int ranking ;
        String achievements="" ;
        String country ;
        String category_type ;
        String handle ;
        int status;
    public void addwrestlers()
    {
        //new wrestlers
         Scanner inp=new Scanner(System.in);
       
         System.out.println(" NAME : ");
         name=inp.next();
         System.out.println("GENDER : ");
         gender=inp.next();
         System.out.println("AGE : ");
         age=inp.nextFloat();
         System.out.println("WEIGHT : ");
         weight=inp.nextFloat();
         System.out.println("HEIGHT : ");
         height=inp.nextFloat();
         insertweightscategory(height ,weight);
         System.out.println("RANKING : ");
         ranking=inp.nextInt();

         System.out.println("COUNTRY : ");
         country=inp.next();
         System.out.println("HANDLE");
         handle=inp.next();
    }
    public void hall_of_fame()
    {
        //are the part of any hall of fame
        achievements+="HALL OF FAME ,";
    }
    public void champion()
    {
        //are the part of any hall of fame
        achievements+=" PRESENT CHAMPION,";
    }
    public void presence_absence()
    {
        //if he is still wrestling or continuting his/her legacy
        status=1;
    }
    public void editwrestlers()
    {
        //add delete update emodfiy
    }
     public void insertweightscategory(double height , double weight)
    {

         if((weight>=56.7 && weight<61.2) && (height>=5.5 && height<5.6))
        {
            category_type="flyweight";
        }
        else if((weight>=61.2 && weight<65.8) && (height>=5.6 && height<5.8))
        {
            category_type="bantamweight";
        }
        else if((weight>=70.3 && weight<77.1) && (height>=5.10 && height<5.11))
        {
            category_type="lightweight";
        }
        else if((weight>=65.8 && weight<70.3) && (height>=5.8 && height<5.10))
        {
            category_type="featherweight";
        }
        else if((weight>=77.1 && weight<83.9) && (height>=5.11 && height<6.0))
        {
            category_type="Welterweight";
        }
        else if((weight>=83.9 && weight<93.0) && (height>=6.0 && height<6.3))
        {
            category_type="middleweight";
        }
        else if((weight>=83.9 && weight<93.0) && (height>=6.0 && height<6.3))
        {
            category_type="light heavyweight";
        }
        else if((weight>=120.2) && (height>6.3))
        {
            category_type="heavyweight";
        }
        else {
            category_type="none";
           
        }
        System.out.println("D:category_type : "+category_type);
    }
public void display()
{
    System.out.println("-------------------------------------DISPLAYING -----------------------------------------");
    System.out.println("name : "+name);
    System.out.println("gender : "+gender);
    System.out.println("age : "+age);
    System.out.println("weight : "+weight);
    System.out.println("height : "+height);
    System.out.println("ranking : "+ranking);
    System.out.println("achievements : "+achievements);
    System.out.println("country : "+country);
    System.out.println("category_type : "+category_type);
    System.out.println("handle : "+handle);
    System.out.println("status : "+status);
    System.out.println("---------------------------------------------------------------------------------------");
}
}
class Matches_schedules
{
       // String time;
        String refreename ;
        String judgename;
        String Stime ;
        String Etime;
        int positionofmatch ;
        String date ;
        String venue;
        String opponent;
        String defender;
        int status;
        String description;

    public void add_matches_schedules()
    {
    //add match schedules
         Scanner inp=new Scanner(System.in);
       
         System.out.println("REFREE NAME");
         refreename=inp.next();
         System.out.println("TIME OF THE schedules");
         Stime=inp.next();

         System.out.println("TIME OF THE schedules");
         Etime=inp.next();
         System.out.println("Position of the match");
         positionofmatch=inp.nextInt();
         System.out.println("DATE of the match");
         date=inp.next();
         System.out.println("venue of the match");
         venue=inp.next();
         System.out.println("opponent of the match");
         opponent=inp.next();
         System.out.println("champion of the match");
         defender=inp.next();
         System.out.println("Status 1-completed/n2.not completed/n3.postponed");
         status=inp.nextInt();
         System.out.println("Description of the match");
         description=inp.next();
         

    }
    public void post_pone_schedules()
    {
    //postpone of matches
    }
 public void pre_pone_schedules()
    {
        //prepone of macthes
    }
    public void find_more_insights()
    {
        //find the status of match
    }
    public void changes_in_plan()
    {
        //if chnage in plan edit it in emergency
    }
    public void status_of_matchorevent()
    {
        //is match happening or happened
    }
}
class Ticketandbilling
{
        private static double fprice=40000; //static variable
        private static double mprice=25000; //static variable
        private static double lprice=15000; // static variable
        int ticket_id;
        int billing_id;
        int ranking;
        String names;
        static double totalbill;//static variable
        int status;
        String fullname;  
        String email;  
    //static function
    static void cal(int no,int seattype)
    {
        if(seattype==1)
        {

        totalbill=fprice*no;
    }
    else if(seattype==2)
    {
         totalbill=mprice*no;
    }
    else if(seattype==3)
    {
        totalbill=lprice*no;
    }
    else{
        totalbill=0;
    }
    }
   
//nested class
    public static class billinfo{
        //nested static class
        public static class details{
            public void printmydet()
            {

            }
        }
        //static block
         static
       
    {
        System.out.println("----------------------------------");
        System.out.println("Ticket booking ");
        System.out.println("----------------------------------");
    }  
//non static method in static class
        public  void printingbill( String fullname,String emailid)
        {

            System.out.println("--------------------------------------------");
            System.out.print("NAME "+fullname);
            System.out.println("\t\tE-MAIL :"+emailid);
            System.out.println("TOTAL BILL :"+totalbill);
            System.out.println("--------------------------------------------");
        }

       
    }
     public void editing(String full,String email)
        {
            fullname=full;
            email=email;
            int choice,choice2;
            int insidewhile;
            int index;
            String modify,newfullname;
             StringBuffer sb=new StringBuffer(fullname);  

            Scanner inp=new Scanner(System.in);
           try{
                System.out.println("Enter 1 to edit your fullname \n2to edit at particular index");
           
            choice2=inp.nextInt();
            if(choice2==1)
            {
             
             System.out.println("Enter the name to change");  
             newfullname=inp.next();
             fullname=newfullname;
             System.out.println("UPDATED NAME "+fullname);  
            }
            else if(choice2==2)
            {
                while(true)
                {
                    System.out.println("ENter 1 to insert in position \n2 to unsave the changes \n3 to save the changes name n quit");
                    insidewhile=inp.nextInt();
                    if(insidewhile==1)
                    {
                System.out.println("FULLNAME : "+fullname);
                System.out.println("ENTER THE position TO CHANGE");
                index=inp.nextInt();

 modify=inp.next();
sb.replace(index-1,index-1,modify);
System.out.println("FULLNAME : "+sb);

       
            }
        else if(insidewhile==2)
        {
            sb = new StringBuffer(fullname);
            System.out.println("NEw name : "+fullname);
           
        }
        else {
            fullname = String.valueOf(sb);
            System.out.println("FULLNAME : "+fullname);
            break;
        }
        }
        }//end of while
        }
        catch (Exception e) {System.out.println("Something went wrong!!!");
            e.printStackTrace();}
}
        public void editing2(String full,String e)
        {
            email=e;
           // email=email;
            int choice,choice2;
            int insidewhile;
            int index;
            String modify,newmail;
             StringBuffer sb=new StringBuffer(email);  
            Scanner inp=new Scanner(System.in);
           
                System.out.println("Enter 1 to edit your email \n2to edit at particular index");
            choice2=inp.nextInt();
            if(choice2==1)
            {
             
             System.out.println("Enter the email to change");  
             newmail=inp.next();
             email=newmail;
             System.out.println("UPDATED NAME "+email);  
            }
            else if(choice2==2)
            {
                while(true)
                {
                    System.out.println("ENter 1 to insert in position \n2 to unsave the changes \n3 to save the changes name n quit");
                    insidewhile=inp.nextInt();
                    if(insidewhile==1)
                    {
                System.out.println("FULLNAME : "+email);
                System.out.println("ENTER THE position TO CHANGE");
                index=inp.nextInt();

 modify=inp.next();
sb.replace(index-1,index-1,modify);
System.out.println("FULLNAME : "+sb);

       
            }
        else if(insidewhile==2)
        {
            sb = new StringBuffer(email);
            System.out.println("NEw name : "+email);
           
        }
        else {
            email = String.valueOf(sb);
            System.out.println("FULLNAME : "+email);
            break;
        }
        }

        }//end of while
           
        }
    public void insert_ticket_billing()
    {
        //insert a ticker
    }
    public void advancebooking()
    {
        //advance booking
    }
    public void total_revenue()
    {
        //total revenue
    }
    public void availabilty()
    {
        // find how mnay ticket are there
    }
}

class Employeer extends Paperview_schedule
{
    String name ;
        String type ;
        String phone ;
        int gender ;
        int emp_id ;
        int experience ;
        float age;
        Boolean status;//if he is working
        String achievements;
        String date;
        String att_status;
    public void employeer()
    {
       
    }
    public void promote()
    {

    }
    public void best_employee()
    {

    }
    public void status()
    {

    }
    public void attendence()
    {

    }
}


class Weightscategory
{
    String Des ;
        String category_type ;
        String presentchampion;
        String datefrom;
        String dateto;
        int totalwrestlers;
      int categorystatus=1;
      int status;
      //integer
    public void insertweightscategory(int height , int weight)
    {
       if((weight>=56.7 && weight<61.2) && (height>=5.5 && height<5.6))
        {
            category_type="flyweight";
        }
        else if((weight>=61.2 && weight<65.8) && (height>=5.6 && height<5.8))
        {
            category_type="bantamweight";
        }
        else if((weight>=70.3 && weight<77.1) && (height>=5.10 && height<5.11))
        {
            category_type="lightweight";
        }
        else if((weight>=65.8 && weight<70.3) && (height>=5.8 && height<5.10))
        {
            category_type="featherweight";
        }
        else if((weight>=77.1 && weight<83.9) && (height>=5.11 && height<6.0))
        {
            category_type="Welterweight";
        }
        else if((weight>=83.9 && weight<93.0) && (height>=6.0 && height<6.3))
        {
            category_type="middleweight";
        }
        else if((weight>=83.9 && weight<93.0) && (height>=6.0 && height<6.3))
        {
            category_type="light heavyweight";
        }
        else if((weight>=120.2) && (height>6.3))
        {
            category_type="heavyweight";
        }
        else {
           
            categorystatus=invalidcategory();
   
        }
        System.out.println("I:category_type : "+category_type);
    }
   
    //double
   
        public void insertweightscategory(double height , double weight)
    {

         if((weight>=56.7 && weight<61.2) && (height>=5.5 && height<5.6))
        {
            category_type="flyweight";
        }
        else if((weight>=61.2 && weight<65.8) && (height>=5.6 && height<5.8))
        {
            category_type="bantamweight";
        }
        else if((weight>=70.3 && weight<77.1) && (height>=5.10 && height<5.11))
        {
            category_type="lightweight";
        }
        else if((weight>=65.8 && weight<70.3) && (height>=5.8 && height<5.10))
        {
            category_type="featherweight";
        }
        else if((weight>=77.1 && weight<83.9) && (height>=5.11 && height<6.0))
        {
            category_type="Welterweight";
        }
        else if((weight>=83.9 && weight<93.0) && (height>=6.0 && height<6.3))
        {
            category_type="middleweight";
        }
        else if((weight>=83.9 && weight<93.0) && (height>=6.0 && height<6.3))
        {
            category_type="light heavyweight";
        }
        else if((weight>=120.2) && (height>6.3))
        {
            category_type="heavyweight";
        }
        else {
            category_type="none";
            categorystatus=invalidcategory();
        }
        System.out.println("D:category_type : "+category_type);
    }
 
    public int invalidcategory()
    {
        category_type="none";
        status=0;
        return(status);
    }

    public void changechampion()
    {

    }
    public void reports()
    {

    }
}

class Ranking extends Weightscategory{
    String ranking_type ;
    String top_person ;
    String division ;
    int Ranking ;
    public void insertweightscategory()
    {
       

    }
    public void top_ranker()
    {

    }
    public void change_in_plan()
    {

    }
    public void present_champion()
    {

    }
}

public class test
{
    public static void main(String args[])
    {
        String name;
        int ch;
        String email;
        int seattype1,count;
        Scanner inp = new Scanner(System.in);
 /*      
//lab5
 Weightscategory a=new Weightscategory();
        Ticketandbilling b= new Ticketandbilling();
        //static inside the class object creation
        Ticketandbilling.billinfo c=new Ticketandbilling.billinfo();
     //   a.insertweightscategory(5.101,70.4);
     //   a.insertweightscategory(7,121);
     //   a.insertweightscategory(121,12);
        System.out.println("your name");
        name=inp.next();
        System.out.println("your email");
        email=inp.next();
        System.out.println("enter the details of ticket you wanted to buy");
        System.out.println("enter 1 to front seat /n2.middle 3.back");
        seattype1=inp.nextInt();
        System.out.println("total no of people ");
        count=inp.nextInt();

        b.cal(count,seattype1);
        c.printingbill(name,email);
        while(true)
        {
            System.out.println("enter 1 to edit your name \n2to email\nany no to quit ");  
            ch=inp.nextInt();
            if(ch==1)
            {
                b.editing(name,email);
            }
            if(ch==2)
            {
                b.editing2(name,email);
            }
            else
            {
                break;
            }
        }
    */
        //lab8
        Wrestlers a=new Wrestlers();
        a.addwrestlers();
        a.hall_of_fame();
        a.champion();

        a.display();
    }
}

