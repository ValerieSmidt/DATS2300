package maks;

public class Main {
    public static void main(String[] args) {
        int[] a = {5,2,17,2,9,3,20,3}; //

        // Henter maks metoden fra MaksMetode klassen
        int maksIndex = Maks.maks(a);

        System.out.println("Maximum value: " + a[maksIndex]);
        System.out.println("Index of maximum value: " + maksIndex);
    }
}
