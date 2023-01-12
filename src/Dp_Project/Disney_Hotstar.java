package Dp_Project;

public class Disney_Hotstar extends Movie_Platform_Download_Abstract{

    Disney_Hotstar(Movie m) {
        super(m);
    }

    @Override
    void Download_Movie() {
        System.out.println("Your Dedicated Platform is Disney-Hotstar");
        System.out.println("\n");
    }

    @Override
    void Payment_Details() {
        System.out.println("Charges Payble to Disney-Hotstar");
        System.out.println("Movie Charges"+" : "+" 500 rs");
        System.out.println("Subtitle Charges"+" : "+" 200 rs");
        System.out.println("Quality Charges"+" : "+" 100 rs");
    }
}
