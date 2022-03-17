import java.io.*;

//1
class players{
    String pid;
    String p_fname ;
    String p_lname;
    int p_age;
    String jersey;
    String Play_position;
    String p_contact;
    String p_address;
}

//2
class manager{
    String mid;
    String m_fname;
    String m_lname;
    int m_age;
    String m_address;
    String m_contact;
}

//3
class equipments{
    String eqid;
    String eq_name;
    String eq_type;
    int eq_quantity;
    String availability;
    String comments;
}

//4
class adminstration{
    String a_fname;
    String a_lname;
    int a_age;
    String a_contact;
    String a_designation;
    float a_salary;
    String a_experience;
}

//5
class vendors{
    String vid;
    String v_name;
    String v_contact;
    String v_address;
    String v_type;
    String v_order;
    String v_payment;
}

//6
class expenses{
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
class owner{
    String oid;
    String o_name;
    String o_type; //individual or a company
    String phone_num;
    String o_email;
    String o_hq;
}

//8
class sponsers{
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