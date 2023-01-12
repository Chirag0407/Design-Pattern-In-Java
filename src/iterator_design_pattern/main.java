package iterator_design_pattern;

public class main {
    public static void main(String[] args) {
        Channel_Repositery c = new Channel_Repositery();
        iterator i1=c.get_iterator();

        while(i1.HasNext()){
            System.out.println(i1.Next());
        }
    }
}
