import java.util.*;

class food
{
    static Scanner s = new Scanner(System.in);
    public static void main (String [] args)throws Exception
    {
        System.out.println("\t\t\t Select the foods \n");
        System.out.println(" 1. Buhari \n 2. Eats of arabs \n 3. SS Hydrabadi \n 4. Amma canteen \n 5. Exit \n");
        int hotal = s.nextInt();
        switch(hotal)
        {
            //Buhari-----------------------------------------------------------------------------------------------------------------------------
            case 1:
            {
                System.out.println("\t\t\t **Thank for selecting Buhari** \n");
                System.out.println("Select your order \n");
                System.out.println(" 1. Chicken briyani \n 2. Mutton briyani \n 3. Chicken 65 \n 4. Chicken manchoori \n");
                int order = s.nextInt();
                switch(order)
                {
                    //chicken briyani
                    case 1:   
                    {
                        double price = 100;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;   
                        }
                    }break;
                    // Mutton briyani
                    case 2:
                    {
                        double price = 250;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);

                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }
                            break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;     
                        }
                    }break;
                    //chicken 65
                    case 3:
                    {
                        double price = 150;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);

                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }
                            break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;      
                        }
                    }break;
                    // chicken manchoori
                    case 4:
                    {
                        double price = 150;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);

                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;
                            
                        }
                    }break;   
                }
            }break;









            //Eats of arabs------------------------------------------------------------------------------------------------------------------------
            case 2:
            {
                System.out.println("\t\t\t **Thank for selecting Eats of arabs** \n");
                System.out.println("Please select your order \n");
                System.out.println(" 1. Chicken briyani \n 2. Mutton briyani \n 3. Chicken 65 \n 4. beef briyani \n 5. fresh juice");
                int order = s.nextInt();
                switch(order)
                {
                    case 1:
                    {
                        double price = 120;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 20 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                    }else
                                    {
                                        System.out.println("Please enter correct otp");
                                    }
                                }
                            }break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;
                        }
                    }break;
                    //mutton briyani
                    case 2:   
                    {
                        double price = 260;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);

                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;      
                        }
                    }break;
                    // chicken 65
                    case 3:
                    {
                        double price = 120;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);

                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }
                            break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;       
                        }
                    }break;
                    //beef briyani
                    case 4:
                    {
                        double price = 120;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);

                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }
                            break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;   
                        }
                    }break;
                    // fresh juice
                    case 5:
                    {
                        double price = 60;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;       
                        }
                    }break;        
                }                    
            }break;




            // SS Hydrabadi------------------------------------------------------------------------------------------------------------------------
            case 3:
            {
                System.out.println("\t\t\t **Thank for selecting S.S Hydrabadi** \n");
                System.out.println("Select your order \n");
                System.out.println(" 1. Chicken briyani \n 2. Mutton briyani \n 3. Chicken 65 \n");
                int order = s.nextInt();
                switch(order)
                {
                    //chicken briyani
                    case 1:   
                    {
                        double price = 150;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);

                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;      
                        }
                    }break;
                    // Mutton briyani
                    case 2:
                    {
                        double price = 350;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);

                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }
                            break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;   
                        }
                    }break;
                    //chicken 65
                    case 3:
                    {
                        double price = 100;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }
                            break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;   
                        }
                    }break;
                }
            }break;






            //amma canteen----------------------------------------------------------------------------------------------------------------------
            case 4:
            {
                System.out.println("\t\t\t **Thank for selecting Amma canteen** \n");
                System.out.println("Select your order \n");
                System.out.println(" 1. sambar rice \n 2. curd rice \n 3. rasam rice \n");
                int order = s.nextInt();
                switch(order)
                {
                    //sambar rice-------------------------------------------------
                    case 1:   
                    {
                        double price = 10;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;  
                        }
                    }break;
                    // curd rice------------------------------------------------
                    case 2:
                    {
                        double price = 10;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }
                            break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;   
                        }
                    }break;
                    //rasam rice-------------------------------------------------
                    case 3:
                    {
                        double price = 10;
                        System.out.println("\t\t\t Please enter the quantity \n");
                        int qty = s.nextInt();
                        double bill = price * qty;
                        Thread.sleep(2000);
                        System.out.println("Processing.........");
                        System.out.println("Your total bill amount : "+bill);
                        Thread.sleep(2000);
                        System.out.println("Please select your payment mode");
                        System.out.println(" 1. google pay \n 2. phone pay \n");
                        int select_payment = s.nextInt();
                        switch(select_payment)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp){
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }
                            break;
                            case 2:
                            {
                                System.out.println("\t\t\tTHANK FRO SELECTING PHONE PAY \n");
                                System.out.println("Please enter the bill amount :"+bill);
                                double user_bill = s.nextDouble();
                                if(bill == user_bill)
                                {
                                    System.out.println("Please enter the otp");
                                    double res = Math.random()*9999+9999;
                                    int sys_otp = (int)res;
                                    Thread.sleep(3000);
                                    System.out.println(sys_otp);
                                    int user_otp  = s.nextInt();
                                    if(user_otp == sys_otp)
                                    {
                                        System.out.println("Payment done successfully.....");
                                        Thread.sleep(2000);
                                        System.out.println("Order recived successfully");
                                        Thread.sleep(3000);
                                        System.out.println("Delivery will be done 30 min.");
                                        Thread.sleep(2000);
                                        System.out.println("\t\t\t"+(char)3+""+(char)3+""+(char)3+"****Thank You***"+(char)3+""+(char)3+""+(char)3);
                                        System.out.println("Once again thank you for selecting phone pay");
                                    }
                                    else
                                    {
                                        System.out.println("otp not match please check the otp");
                                    }
                                }
                            }break;
                            
                        }
                    }break;
                }
            }break;





            //Exit----------------------------------------------------------------------------------------------------------------------------
            case 5:
            {
                System.out.println("\t\t\t********Thank you for coming our app********\n");
            }break;
        }
    }
}
