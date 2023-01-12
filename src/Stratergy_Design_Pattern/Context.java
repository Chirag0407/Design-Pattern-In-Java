package Stratergy_Design_Pattern;

public class Context {
    SortStrategy strategy; 
    public Context(SortStrategy strategy){
        this.strategy = strategy; 
    } 
    public void arrange(int[] input) { 
        strategy.sort(input);
    }
}
