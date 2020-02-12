package src;

/*
Created by Tomasz Pajewski 28.01.2020
*/
public class Home {
    public static void main(String[] args) {
        // TV pokoj = new TV();
        // pokoj.size = 32;
        TV kuchnia = new TV(32, "Agatka");
        TV salon = new TV(55, "Samsung");
        System.out.println("Telewizor w kuchni ma " + kuchnia.getSize() + " cale i nazywa się " + kuchnia.getName());
        System.out.println("Telewizor w salonie ma " + salon.getSize() + " cale i nazywa się " + salon.getName());
        kuchnia.setonOff(true);
        kuchnia.getonOff();
        salon.getonOff();
        Dog rex = new Dog();
        rex.speak();
        rex.setSize(15);
        rex.getSize();
    }
}