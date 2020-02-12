package src;

/*
	Created by Tomasz Pajewski on 2020-01-28.
	Java some table examples
*/
public class Tabl {

    public static void main(String[] args) {
        int tab[] = new int[5];
        int[] tab1 = new int[5]; // zapis równoiważny z tab
        tab[0] = 5;
        tab[1] = 9;
        tab[2] = 6;
        tab[3] = 7;
        tab[4] = 8;
        tab1[0] = 8;
        System.out.println("Tablica " + tab[0]);
        for (int i = 0; i < 5; i++) {
            System.out.println("Tablica [i] =" + tab[i]);
        }
        for (int i : tab) {
            System.out.println("Tablica [i] =" + i);
        }
        int i = 0;
        for (; i < tab.length;) {
            System.out.println("Tablica [i] =" + tab[i]);
            i++;
        }
        int n = tab.length;
        while (n > 0) {
            n--;
            System.out.println("Tablica [i] =" + tab[n]);
        }
        n = tab.length;
        do {
            n--;
            System.out.println("Tablica [i] =" + tab[n]);
        } while (n > 0);
        int[][] tab3 = { { 2, 3, 4 }, { 1, 2, 3 } };
        for (int j = 0; j < tab3.length; j++) {
            System.out.println("length =" + tab3.length);
            for (int k = 0; k < tab3[j].length; k++) {
                System.out.println("j= " + j + " k= " + k);
                System.out.println("Tablica [" + j + "][" + k + "] =" + tab3[j][k]);
            }
        }
    }
}