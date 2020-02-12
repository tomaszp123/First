/*
Created by Tomasz Pajewski 28.01.2020
*/
public class TV {
    private int size;
    private String name;
    private boolean onOff;

    public TV() {

    }

    public TV(int Size, String name) {
        size = Size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setonOff(boolean sw) {
        onOff = sw;
    }

    public void getonOff() {
        if (onOff)
            System.out.println("Telewizor jest włączony");
        else if (onOff == false)
            System.out.println("Telewizor jest wyłączony");
        else
            System.out.println("Włóz wtyczkę do kontaktu baranie");
    }
}