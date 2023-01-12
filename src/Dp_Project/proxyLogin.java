package Dp_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class proxyLogin implements login{
    private login l = new realLogin();
    private static ArrayList<String> emailid;
    private static ArrayList<String> password;
    static{
        emailid = new ArrayList<String>();
        password = new ArrayList<String>();
        emailid.add("abc1@gmail.com");
        password.add("1");
        emailid.add("abc2@gmail.com");
        password.add("2");
        emailid.add("abc2@gmail.com");
        password.add("3");
        emailid.add("abc2@gmail.com");
        password.add("4");
        emailid.add("abc5@gmail.com");
        password.add("5");
    }
    public void validate(String username) throws RuntimeException
    {
        if(emailid.contains(username.toLowerCase()))
        {
            int i = emailid.indexOf(username);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter password : ");
            String str = sc.next();
            String pass = password.get(i);
            if(str.equals(pass)){
                l.validate(username);
            }
            else{
                throw new RuntimeException();
            }
        }
        else{
                throw new RuntimeException();
        }


    }


}
