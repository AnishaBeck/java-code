// create a class called author with fname, lname and no_of_books_published
// Methods:
//     getfullname
//     display
//     addbook()
//         o/p - no. of books

class myauthor{
    public String fname;
    public String lname;
    public int no_of_books_published;

    myauthor(String f, String l, int n) {
        fname = f;
        lname = l;
        no_of_books_published = n;
    }
    
public void getfullname()
{
    System.out.println(fname+" "+lname);
}
public void display(){
    System.out.println("FName: "+fname);
    System.out.println("LName: "+lname);
    System.out.println("No of books published: "+no_of_books_published);
    }
public void addbook(int number){
    no_of_books_published += number;
    System.out.println("The number of books published are: "+ no_of_books_published);
}
}
public class author{
    public static void main(String args[])
    {
        myauthor A1 = new myauthor("Rahul","Ranjan",6);
        A1.getfullname();
        A1.display();
        A1.addbook(4);
    }

}
