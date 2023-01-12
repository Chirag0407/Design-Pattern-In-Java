package Dp_Project;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try{
            login l = new proxyLogin();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your email id : ");
            String str = sc.nextLine();
            l.validate(str);

            String m1,s1,q1;
            int p;
            System.out.println("Enter the Movie You Want To See");
            m1=sc.nextLine();
            System.out.println("Enter the Quality of Movie");
            q1=sc.next();
            System.out.println("Enter the Language Of Movie");
            s1=sc.next();

            Movie m;
            Movie_Builder_Class b = new Movie_Builder_Class();
            m = b.setMovie(m1).setQuality(q1).setSubtitle(s1).Build();
            m.Movie_details();
            System.out.println("\n");

            System.out.println("Enter the platform You want to see the movie");
            System.out.println("Enter 1 for Netflix \n Enter 2 for Amazon Prime \n Enter 3 for Disney+Hotstar ");
            p=sc.nextInt();
            switch (p){
                case 1:
                Movie_Platform_Download_Abstract a = new Netflix(m);
                a.details();
                break;
                case 2:
                Movie_Platform_Download_Abstract a1 = new Amazon_Prime(m);
                a1.details();
                case 3:
                Movie_Platform_Download_Abstract a2= new Disney_Hotstar(m);
                a2.details();
                default:
                    System.out.println("Platform Not Available");
            }
        }
        catch(RuntimeException e){
            System.out.println("Invalid user or Password");
        }


    }
}