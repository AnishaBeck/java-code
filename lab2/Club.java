import java.io.*;
import java.util.Scanner;

public class Club {
    // 1
    public class players {
        int pid;
        String p_fname;
        String p_lname;
        int p_age;
        int jersey;
        String play_position;
        String p_contact;
        String p_address;
        float p_salary;

        players(int pid, String f, String l, int age, int jer, String pp, String contact, String address, float sal) {
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

        void display() {
            System.out.println(" Id " + this.pid);
            System.out.println(" First Name : " + this.p_fname);
            System.out.println(" Last Name : " + this.p_lname);
            System.out.println(" Age :  " + this.p_age);
            System.out.println(" Contact : " + this.p_contact);
            System.out.println(" Address : " + this.p_address);
            System.out.println(" Salary : " + this.p_salary);
        }

        public void calculate() // calculating all the parameters
        {
            float HRA = (10 / 100) * p_salary;
            float DA = (73 / 100) * p_salary;
            float GS = p_salary + DA + HRA;
            float incometax = (30 / 100) * GS;
            float netsalary = GS - incometax;
        }
    }

    // 2
    public class manager {
        String mid;
        String m_fname;
        String m_lname;
        int m_age;
        String m_address;
        String m_contact;
        int m_doj;
        int m_dor;
        float m_salary;
        String schedule;
        String exp;

        public void calculate() // calculating all the parameters
        {
            float HRA = (10 / 100) * m_salary;
            float DA = (73 / 100) * m_salary;
            float GS = m_salary + DA + HRA;
            float incometax = (30 / 100) * GS;
            float netsalary = GS - incometax;
        }

        public String cal_experience() {
            Scanner joining = new Scanner(System.in);
            System.out.println("Input your year of joining.");
            m_doj = joining.nextInt();
            if ((2022 - m_doj) > 20) {
                exp = "Senior";
            } else if ((2022 - m_doj) > 10) {
                exp = "Junior";
            } else {
                exp = "Associate";
            }
            return exp;
        }
    }
}