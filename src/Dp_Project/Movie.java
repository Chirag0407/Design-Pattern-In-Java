package Dp_Project;

public class Movie {
    String Movie_name;
    String Subtitle;
    String Quality;

    Movie(String Movie_name,String Subtitle,String Quality){
        this.Movie_name=Movie_name;
        this.Subtitle=Subtitle;
        this.Quality=Quality;
    }

    void Movie_details(){
        System.out.println("Movie Name"+" : "+Movie_name+"\n"+"Subtitle Language"+" : "+Subtitle+"\n"+"Quality"+" : "+Quality);
    }
}
