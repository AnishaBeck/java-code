import java.io.*;
public class clothing{

public class customer{
    int customer_id;
    String first_name;
    String last_name;
    int age;
    String email;
    int phone_no;
    String address;
}

public class employee{
    int employee_id;
    String first_name;
    String last_name;
    String designation;
    int age;
    String email;
    int phone_no;
    String address;
    int salary;
}

public class inventory{
    int inventory_id;
    int inventory_quantity;
}

public class item{
    int item_id;
    String item_name;
    String item_description;;
    String item_type;
    String item_price;
}

public class sales{
    int sales_id;
    String sales_amount;
    String sales_type;
    String sales_description;
    int sales_customer_id;
    int sales_date;
}

public class brand{
    int brand_id;
    String brand_name;
    String brand_description;
    String brand_company;
    int brand_sales;
    int brand_revenue;
}

public class category{
    int category_id;
    String category_type;
}

public class product{
    int product_id;
    String product_name;
    int product_size;
    int product_price;
    int product_quantity;
}

public class cart{
    int cart_id;
    int product_id;
    int customer_id;
    int no_of_products;
    int total_price;
}

public class payment{
    int payment_id;
    int customer_id;
    String payment_methods;
    String invoice;
    int amount;
    String payment_date;
}
}
