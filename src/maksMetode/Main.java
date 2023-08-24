package maksMetode;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,2,17,2,9,3,20,3}; //

        // Henter maks metoden fra MaksMetode klassen
        int maksIndex = MaksMetode.maks(array);

        System.out.println("Maximum value: " + array[maksIndex]);
        System.out.println("Index of maximum value: " + maksIndex);
    }
}
