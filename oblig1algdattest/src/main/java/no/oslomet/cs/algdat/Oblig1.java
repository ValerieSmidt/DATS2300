package no.oslomet.cs.algdat;
import java.util.Arrays;
import java.util.NoSuchElementException;

import java.util.NoSuchElementException;

public class Oblig1 {
    // Oppgave 1
    public static int antallUlikeUsortert(int[] a) {
        int antallUlike = 0;

        for (int i = 0; i < a.length; ++i){
            boolean unik = true;
            for(int j = 0; j < i;++j){
                if(a[i]==a[j]){
                    unik = false;
                    break;
                }
            }
            if(unik){
                ++antallUlike;
            }
        }
        return antallUlike;
    }

    public static void main(String[] args) {
        int[] a = {4,4,4,4,4,1,2,3,5,6,7,8};

        // Finding the maximum value in the array using the maks method
        int ulike =antallUlikeUsortert(a);


        // Printing the results
        System.out.println("ulike elementer " + ulike);

    }
}
