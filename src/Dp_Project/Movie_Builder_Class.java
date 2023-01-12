package Dp_Project;

public class Movie_Builder_Class implements Movie_Builder{
    String Movie_name=" Dhoom 3";
    String Subtitle="Hindi";
    String Quality="100p";
    @Override
    public Movie_Builder_Class setMovie(String Movie_name) {
        this.Movie_name=Movie_name;
        return this;
    }

    @Override
    public Movie_Builder_Class setSubtitle(String Subtitle) {
        this.Subtitle=Subtitle;
        return this;
    }

    @Override
    public Movie_Builder_Class setQuality(String Quality){
        this.Quality=Quality;
        return this;
    }

    Movie Build(){
        return new Movie(Movie_name,Subtitle,Quality);
    }

}
