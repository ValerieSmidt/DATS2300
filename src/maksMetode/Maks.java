package maks;

public class Maks{
    public static int maks(int[] a) {
        for (int i = 0; i < a.length-1; ++i) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        int max = a[a.length - 1];
        return max;
    }

    public static int ombyttinger(int[] a) {
        int antallBytt = 0;
        for (int i = 0; i < a.length-1; ++i) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                antallBytt +=1;
            }
        }
        return antallBytt;
    }
}
