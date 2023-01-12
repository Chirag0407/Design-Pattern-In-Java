package Dp_Project;

public abstract class Movie_Platform_Download_Abstract {
    Movie m;
    Movie_Platform_Download_Abstract(Movie m){
        this.m=m;
    }

    final void details(){
        Welcome();
        Download_Movie();
        Payment_Details();
        Movie_Downloded();
    }

    abstract void Download_Movie();
    abstract void Payment_Details();


    void Welcome() {
        System.out.println("Welcome");
        System.out.println("Your Requested Movie And its Configuration");
        m.Movie_details();
        System.out.print("Your Movie Download Will Start Soon");
        System.out.println("\n");

    }

    void Movie_Downloded() {
        System.out.println("Your Movie Have Been Downloaded Succesfully");
        System.out.println("Thanks For Visiting Our Platform");
    }
}
