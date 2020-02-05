/*
Created by Tomasz Pajewski 28.01.2020
*/
public class Mathematic {
    public static void main(String args[]) {
        Mathematic m = new Mathematic();
        m.className();
        System.out.println(m.sqrt(6));
        System.out.println(m.sqrt(5));
        System.out.println(m.sqrt(6.12));
    }

    public void className() {
        System.out.println("Mathematics");
    }

    public int sqrt(int liczba) {
        return liczba * liczba;
    }

    public double sqrt(double liczba) {
        return liczba * liczba;
    }
}