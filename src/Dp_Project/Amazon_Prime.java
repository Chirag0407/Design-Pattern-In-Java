package Dp_Project;

public class Amazon_Prime extends Movie_Platform_Download_Abstract{
    Amazon_Prime(Movie m) {
        super(m);
    }

    @Override
    void Download_Movie() {
        System.out.println("Your Dedicated Platform is Amazon_Prime");
        System.out.println("\n");
    }

    @Override
    void Payment_Details() {
        System.out.println("Charges Payble to Amazon_Prime");
        System.out.println("Movie Charges"+" : "+" 500 rs");
        System.out.println("Subtitle Charges"+" : "+" 200 rs");
        System.out.println("Quality Charges"+" : "+" 100 rs");
    }
}
