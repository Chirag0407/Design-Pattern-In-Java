package Facade_Design_Pattern;

import java.util.*;

public class FacadeDemo {
    public static void main(String[] args) {
        Date from=new Date();
        Date to=new Date();
        TravelFacade facade = new TravelFacade();
            try{
                    facade.getFlightsAndHotels(from, to); 
    } catch (java. lang. NullPointerException exception){
    // Catch NullPointerExceptions. Logging. log(exception);
    } catch (Throwable exception){
    // Catch other Throwables. Logging. log(exception, false);
    }
          
    }
}