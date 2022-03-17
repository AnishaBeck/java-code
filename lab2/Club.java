import java.io.*;

Public class Club{
    //1
    public class players{
    String pid;
    String p_fname ;
    String p_lname;
    int p_age;
    String jersey;
    String Play_position;
    String p_phone_num;
    String p_email;
    String p_address;
    String p_sponser;
    String p_sponser_amount;
    String p_doj;
    float p_salary;

    public static void addplayer(){

    }

    public static void edit_p_detail(){

    }

    public static void deleteplayer(){

    }

    public static void p_salary_cal(){

    }

    public static void networth_cal(){

    }

    }

    //2 
    public class manager{
        String mid;
        String m_fname;
        String m_lname;
        int m_age;
        String m_address;
        String m_phone_num;
        String m_email;
        String m_doj;
        String m_dor;
        float m_salary;

        public static void addmanager(){

        }

        public static void edit_m_detail(){

        }

        public static void deletemanager(){

        }

        public static void m_salary_cal(){

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

        public static void addeq(){

        }

        public static void deleteeq(){

        }

        public static void edit_eq(){

        }

    }

    //4
    public class adminstration{
        String a_fname;
        String a_lname;
        int a_age;
        String a_phone_num;
        String a_email;
        String a_designation;
        String a_doj;
        String a_dor;
        float a_salary;
        String a_experience;

        public static void addadmin(){

        }

        public static void editadmin(){

        }

        public static void deleteadmin(){

        }

        public static void admin_sal_cal(){

        }
    }

    //5
    public class owner{
        String oid;
        String o_name;
        String o_type; //individual or a company
        String phone_num;
        String o_email;
        String o_hq;
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
        String v_phone_num;
        String v_email;
        String v_address;
        String v_type;
        String v_order;
        String v_payment;
    }


    //8
    public class sponsers{
        String sid;
        String s_name;
        String s_poc;
        String s_phone_num;
        String s_email;
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