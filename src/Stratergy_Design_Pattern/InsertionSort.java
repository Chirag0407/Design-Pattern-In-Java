package Stratergy_Design_Pattern;

class InsertionSort implements SortStrategy {
    @Override 
    public void sort(int[] numbers) { 
        System.out.println("sorting array using insertion sort strategy"); 
    } 
}