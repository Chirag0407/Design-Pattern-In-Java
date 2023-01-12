package Dp_Project;

import java.sql.SQLOutput;

public class Netflix extends Movie_Platform_Download_Abstract{

    Netflix(Movie m) {
        super(m);
    }

    @Override
    void Download_Movie() {
        System.out.println("Your Dedicated Platform is Netfilx");
        System.out.println("\n");
    }

    @Override
    void Payment_Details() {
        System.out.println("Charges Payble to Netflix");
        System.out.println("Movie Charges"+" : "+" 500 rs");
        System.out.println("Subtitle Charges"+" : "+" 200 rs");
        System.out.println("Quality Charges"+" : "+" 100 rs");
    }
}
